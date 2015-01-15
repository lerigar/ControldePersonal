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
import javax.swing.JOptionPane;
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
                    elemento.insertaValor(elemento.DatosNivel_1[c], resultados.getString(1));
                }
            } catch (SQLException e) {
                ecepcion = e;
            }
        }
        return elemento;
    }
      boolean guardaElementoNuevo(Elemento elementoNuevo) {
        statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException e) {
            ecepcion = e;
        }
        // inicializacion de los resultados.
        resultados = null;
        HashMap<String, String> datosElemento = elementoNuevo.dameDatosElemento();
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
      
      
    /*     ******************************               CAMBIOS MIOS DE MI              */
      
    public int buscaIDElemento(String nombre){
	statement = null;
        int id_empleado = 0;
        try {
            statement = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
	resultados = null;	
	String query = "select id_empleado from empleados_nivel1 where nombre_empleado='"+nombre+"'";
        try {
            resultados = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(resultados.next()==true){
                id_empleado = resultados.getInt("id_empleado");                
                return id_empleado;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_empleado;
    }
    
    public boolean registraAsistencia(int id_empleado,String fecha,String Asistencia){
        statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        resultados = null;
        if(revisaExistenciaAsistencia(id_empleado,fecha,Asistencia)){
            return false;
        }
        else{
            if(Asistencia.equals("A")){
                String query = "insert into empleado_asistencia (id_empleado,dia,status) values ("+id_empleado+",'"+fecha+"','"+Asistencia+"')";
                try {
                    statement.executeUpdate(query);
                } catch (SQLException ex) {
                    Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(Asistencia.equals("F")){
                String query = "insert into empleado_asistencia (id_empleado,dia,status) values ("+id_empleado+",'"+fecha+"','"+Asistencia+"')";
                try {
                    statement.executeUpdate(query);
                } catch (SQLException ex) {
                    Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(Asistencia.equals("J")){
                String query = "update empleado_asistencia set status='"+Asistencia+"' where id_empleado="+id_empleado+" and dia='"+fecha+"'";
                try {
                    statement.executeUpdate(query);
                } catch (SQLException ex) {
                    Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Falta justificada");
            }
            return true;
        }
    }
    
    private boolean revisaExistenciaAsistencia(int id_empleado,String fecha,String Asistencia){
        statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        resultados = null;
        String query;
        if(Asistencia.equals("A")){
            query = "select id_asistencia from empleado_asistencia where id_empleado="+id_empleado+" and dia='"+fecha+"'";
            try {
                resultados = statement.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {                
                return resultados.next() == true;
            } catch (SQLException ex) {
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Asistencia.equals("J")){
            int id_asistencia = buscaIDAsistencia(id_empleado,fecha);
            return id_asistencia <= 0;
        }
        if(Asistencia.equals("F")){
            query = "select id_asistencia from empleado_asistencia where id_empleado="+id_empleado+" and dia='"+fecha+"'";
            try {
                resultados = statement.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                return resultados.next() == true;
            } catch (SQLException ex) {
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }
    
    public int buscaIDServicio(String servicio){
	statement = null;
        int id_servicio = 0;
        try {
            statement = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
	resultados = null;	
	String query = "select id_servicio from servicios_nivel1 where nombre_servicio='"+servicio+"'";
        try {
            resultados = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(resultados.next()==true){
                id_servicio = resultados.getInt("id_servicio");                
                return id_servicio;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_servicio;
    }
    
    private int buscaIDAsistencia(int id_empleado,String fecha){
        statement = null;
        int id_asistencia = 0;
        try {
            statement = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
	resultados = null;	
	String query = "select id_asistencia from empleado_asistencia where dia='"+fecha+"' and id_empleado="+id_empleado+" and status='F'";
        try {
            resultados = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(resultados.next()==true){
                id_asistencia = resultados.getInt("id_asistencia");
                return id_asistencia;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_asistencia;
    }
        
}
