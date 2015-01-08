/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.excel;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Miguel
 */
public class ConexionExcel {
    private final String rutaArchivo = "E:/Documentos/NetBeansProjects/Control de Personal/excel/temporal.xls";
    
    public void exportaExcel(){     
        try {
            File archivoXLSX = new File(rutaArchivo);
            if(archivoXLSX.exists())archivoXLSX.delete();
            archivoXLSX.createNewFile();
            Workbook libro = new HSSFWorkbook();
            FileOutputStream archivo = new FileOutputStream(archivoXLSX);
            Sheet hoja = libro.createSheet("Exportación de SGCP");
            /*for(int f=0;f<10;f++){
            Row fila = hoja.createRow(f);
            for(int c=0;c<5;c++){
            Cell celda = fila.createCell(c);
            }
            }*/
            //Escribir en celdas
            /*
            celda.setCellValue("Encabezado #"+c);
            */
            for(int i=0; i<1;i++){
                Row fila = hoja.createRow(i);
                for(int c=0; c<2; c++){
                    Cell celda = fila.createCell(c);
                    if(i==0 && c==0){
                        celda.setCellValue("Valor 1");
                    }
                }
            }
            libro.write(archivo);
            archivo.close();
            Desktop.getDesktop().open(archivoXLSX);
        } catch (IOException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
