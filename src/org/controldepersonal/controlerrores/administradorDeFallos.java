/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.controlerrores;

/**
 *
 * @author Antonio
 */
public class administradorDeFallos {
    //Dialogo usado para los errores.
    dialogoError dialogo;
    /*
    Funcion para avisar al usuario sobreu un fallo.
    Recibe un String y el stacktrace del fallo.
    */
    public void avisarError(String descripcion){
        dialogo = new dialogoError(descripcion);
        dialogo.setVisible(true);
    }
}
