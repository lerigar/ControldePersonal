/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.HasMaps;

import java.util.HashMap;

/**
 *
 * @author Antonio
 */
public class Elemento {
    /**
     * Clase que guarda toda la informacion de los elementos, y con la cual, se 
     * manda a que el paquete conector obtenga la informacion o la extraiga.
     */
    private final HashMap <String, String>  DatosElemento;
       public String [] DatosNivel_1 = { "`empleados_nivel1`.`id_empleado`",
                                "`empleados_nivel1`.`nombre_empleado`",
                                "`empleados_nivel1`.`apellido_empleado`",
                                "`empleados_nivel1`.`status_empleado`",
                                "`empleados_nivel1`.`verificacion`",
                                "`empleados_nivel1`.`Status`",
                                "`empleados_nivel1`.`Servicio`",
                                "`empleados_nivel1`.`oficio_registro_sspf`",
                                "`empleados_nivel1`.`registro_sspf`",
                                "`empleados_nivel1`.`fecha_registro_sdn`",
                                "`empleados_nivel1`.`oficio_registro_sdn`",
                                "`empleados_nivel1`.`registro_sdn`",
                                "`empleados_nivel1`.`registro_cesp`",
                                "`empleados_nivel1`.`puesto`",
                                "`empleados_nivel1`.`numero`",
                                "`empleados_nivel1`.`Nombre`",
                                "`empleados_nivel1`.`estado`",
                                "`empleados_nivel1`.`empresa`",
                                "`empleados_nivel1`.`ciudad`",
                                "`empleados_nivel1`.`oficio_registro_cesp`"};
                    //FROM `controldepersonal`.`empleados_nivel1`;
    /*
    Constructor
    */
    public Elemento(){
        DatosElemento = new HashMap(22);//Capacidad 16 por default.
    }
    /*
    Getter que devuelve todos los datos del elemento.
    */
    public HashMap dameDatosElemento(){
        return DatosElemento;
    }
    /*
    Getter que devuelve un campo en especifico (String)
    */
    public String dameDato(String referencia) {
        if (DatosElemento.containsValue(referencia)) {
            return (String) DatosElemento.get(referencia);
        }
        return (String) referencia+"-Referencia no encontrada";
    }
    /*
    Borrar toda la info del empleado, por si las moscas.
    */
    public boolean borraDatos(){
        DatosElemento.clear();
        return DatosElemento.isEmpty();
    }
    /*
    Valida si la tabla esta vacia
    */
    public boolean estaVacia(){
        return DatosElemento.isEmpty();
    }
    /*
    Funcion que inserta un valor
    */
    public boolean insertaValor(String referencia, String valor ){
        DatosElemento.put(referencia, valor);
        return true;
    }
}
