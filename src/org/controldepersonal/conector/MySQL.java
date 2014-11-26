/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.conector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
