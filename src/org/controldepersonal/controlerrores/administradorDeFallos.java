/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.controlerrores;

import java.awt.Frame;


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
    public void avisarError(Frame quienTuvoError, String descripcion){
        dialogo = new dialogoError(quienTuvoError, true, descripcion);
    }
}
