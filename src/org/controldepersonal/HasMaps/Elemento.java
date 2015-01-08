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
    private final HashMap DatosElemento;
    public String [] Campos = {"Id",
                        "Nombre",
                        "Status",
                        "Empresa",
                        "Numero",
                        "Servicio",
                        "Ciudad",
                        "Puesto",
                        "Estado",
                        "Atencion RH",
                        "Inicio de Labores",
                        "Registro CESP",
                        "Fecha registro CESP",
                        "Oficio Registro CESP",
                        "Verificacion",
                        "Fecha Verificacion",
                        "Registro SSPF",
                        "Fecha Registro SSPF",
                        "Oficio Registro SSPF",
                        "Registro SDN",
                        "Fecha Registro SDN",
                        "Oficio Registro SDN",
                        "Lic Part Col"};
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
