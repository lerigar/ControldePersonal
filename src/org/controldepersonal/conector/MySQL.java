/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.conector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.controldepersonal.HasMaps.Elemento;

/**
 *
 * @author Antonio
 */
public class MySQL {
    /*
     Atributos
     */

    java.sql.Statement statement;
    SQLException ecepcion;
    ResultSet resultados;
    Connection conexion;
    private static final int RESULTADOSMAX = 999;
    /*
     * Constructor
     */

    public MySQL(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean borrarDatosTemporalesCursos() {
        statement = null;
        try {
            statement = conexion.createStatement();
            String query = "delete from cursosTemporal";
            statement.executeQuery(query);
            return true;
        } catch (SQLException e) {
            ecepcion = e;
            return false;
        }
    }

    public String[] dameArregloString(String tabla, String columna) {
        statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException e) {
            ecepcion = e;
        }
        // inicializacion de los resultados.
        resultados = null;
        //Se arma el qwerty
        String qwerty = "SELECT " + columna + " FROM " + tabla;
        // se ejecuta el qwerty:
        try {
            resultados = statement.executeQuery(qwerty);
        } catch (SQLException e) {
            ecepcion = e;
        }
        // se inicializa variable de retorno
        String buffer[] = new String[RESULTADOSMAX];
        String resultado[];
        int i = 0;
        // Se almacenan los resultados en la variable de retorno.
        try {
            for (i = 0; resultados.next(); i++) {
                buffer[i] = resultados.getString(1);
            }
        } catch (SQLException e) {
            ecepcion = e;
        }
        resultado = new String[i];
        //no se usa un systemarraycopy por que la idea es no dejar campos vacios.
        for (int c = 0; c < i; c++) {
            resultado[c] = buffer[c];
        }
        return resultado;
    }
    /*
     Funcion que llena los datos del empleado.
     */

    public Elemento obtenDatos(Elemento elemento, int IdElemento) {
        statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException e) {
            ecepcion = e;
        }
        // inicializacion de los resultados.
        resultados = null;
        //Se inicia el ciclo
        for (int c = 0; c >= elemento.DatosNivel_1.length; c++) {
            //Se arma el qwerty
            String qwerty = "SELECT " + elemento.DatosNivel_1[c]
                    + "FROM empleados_nivel1"
                    + "WHERE id_empleado=" + IdElemento + ";";
            // se ejecuta el qwerty:
            System.out.println(qwerty);
            try {
                resultados = statement.executeQuery(qwerty);
            } catch (SQLException e) {
                ecepcion = e;
            }
            // Se almacenan los resultados en la variable de retorno.
            try {
                for (int i = 0; resultados.next(); i++) {
                    elemento.insertaValor_nivel1(elemento.DatosNivel_1[c], resultados.getString(1));
                }
            } catch (SQLException e) {
                ecepcion = e;
            }
        }
        return elemento;
    }
    /*
    Funcion que guarda un elemento nuevo en la BD desde la clase RegistrarElemento.java
    */
      boolean guardaElementoNuevo(Elemento elementoNuevo) {
        statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException e) {
            ecepcion = e;
        }
        // inicializacion de los resultados.
        resultados = null;
        HashMap<String, String> datosElemento = elementoNuevo.dameDatosElemento_nivel1();
        String qwerty = "INSERT INTO  empleados_nivel1 (";
        datosElemento.keySet().stream().forEach((key) -> {
            qwerty.concat(key+", ");
        });
        qwerty.concat(") VALUES (");
        datosElemento.keySet().stream().forEach((key) -> {
            qwerty.concat("'"+datosElemento.get(key)+"',");
        });
          System.out.println(qwerty);
        return true;
    }
}
