/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.utelerias;

import com.sun.javafx.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tonyb_000
 */
public class configuracion {
    /*
    Clase que se encarga de almacenar localmente todas
    las configuraciones.
    */
    //Atributos de la clase:
    Exception ecepcion;
     /*
    Funcion para cargar la configuracion de acceso desde el archivo ini que 
    estara en la carpeta lib.
    */
    public String[] dameConfiguracionConexion(){
      String[] datosDeConexion = new String [2]; 
        try{
      Properties propiedades = obtenerArchivoPropiedades("configuracion.ini");
      //propiedades.load(new FileInputStream(getClass().getResourceAsStream("configuracionLocal/configuracion.properties")));
      datosDeConexion[0] = propiedades.getProperty("urlBD");
      datosDeConexion[1] = propiedades.getProperty("usuario");
      propiedades.list(System.out);
      }
    catch (Exception e) {
      ecepcion = e;
      e.printStackTrace();
      return null;
      }
        return datosDeConexion;
    }
    
    /*
    Funcion"Getter" que devuelve la ultima ecepcion obtenida.
    */
    public Exception dameExcepcion(){
        return ecepcion;
    }
    
    /*
    En caso de no encontrarse la configuracion ,crearla.
    */
    public boolean crearArchivoConfiguracion(String urlBD, String usuario) {
       FileInputStream archivo = null;
       Properties propiedades = new Properties();
        try {
            
            archivo = new FileInputStream(new File(Utils.class.getResource("/org/controldepersonal/configuracionLocal/configuracion.properties").getFile()));
            propiedades.load(archivo);
            propiedades.setProperty("urlBD", urlBD);
            propiedades.setProperty("usuario", usuario);
            propiedades.store(new FileOutputStream(Utils.class.getResource("/org/controldepersonal/configuracionLocal/configuracion.properties").getFile()), "");
            System.out.println("guardando archivo de configuracion...");
        } catch (IOException ex) {
            ecepcion = ex;
            return false;
        } finally {
            if (archivo != null) {
                try {
                    archivo.close();
                    System.out.println("1");
                    return true;
                } catch (IOException ex) {
                    ecepcion = ex;
                    System.out.println("2");
                    Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
                return false;
                }
            }
        } return false;
    }
/*
    Funcion que Acre el archivo a ruta relativa del ejecutable.
    */
    public static Properties obtenerArchivoPropiedades(String arc) throws FileNotFoundException {
    Properties prop = null;
    try {
        CodeSource codeSource = configuracion.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        File jarDir = jarFile.getParentFile();
 
        if (jarDir != null && jarDir.isDirectory()) {
            File propFile = new File(jarDir, arc);
            prop = new Properties();
            prop.load(new BufferedReader(new FileReader(propFile.getAbsoluteFile())));
        }
    } catch (URISyntaxException ex) {
        //Logger.getLogger(funcionesUtilidad.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        //System.err.println("No se encuentra el archivo: " + ex.getMessage());
        throw new FileNotFoundException("No se econtró el archivo de propiedades...");
    } catch (IOException ex) {
        //Logger.getLogger(funcionesUtilidad.class.getName()).log(Level.SEVERE, null, ex);
    }
    return prop;
}
    
    
}