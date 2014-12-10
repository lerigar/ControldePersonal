/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfaz;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class RegistrarElemento extends javax.swing.JDialog {
    /*
     Atributos 
     */

    conector conexionactual;
    private String[] cursosArray = new String[100];
    private int contadorCursos = 0;
    private DefaultTableModel modeloCursos;

    private static void DISPOSE_ON_CLOSE(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Creates new form RegistrarElemento
     */
    public RegistrarElemento(java.awt.Frame parent, boolean modal, conector conexionactual) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        initComponents();
        setTitle("Registro de Elemento");
        modeloCursos = (DefaultTableModel)tCursosTomados.getModel();
        initRadioButtons();
    }
    
    private void initRadioButtons(){
        rbMasculino.setActionCommand("Masculino");
        rbFemenino.setActionCommand("Femenino");
        
        rbSepCertificadoS.setActionCommand("Si");
        rbSepCertificadoN.setActionCommand("No");
        
        rbCartillaLiberada.setActionCommand("Liberada");
        rbPreCartilla.setActionCommand("PreCartilla");
        rbNoAplica.setActionCommand("No Aplica");

        rbHojaDatosEntregaO.setActionCommand("Original");
        rbHojaDatosEntregaC.setActionCommand("Copia");
        rbHojaDatosEntregaN.setActionCommand("No");

        rbSolicitudEntregaO.setActionCommand("Original");
        rbSolicitudEntregaC.setActionCommand("Copia");
        rbSolicitudEntregaN.setActionCommand("No");

        rbIfeEntregaO.setActionCommand("Original");
        rbIfeEntregaC.setActionCommand("Copia");
        rbIfeEntregaN.setActionCommand("No");

        rbActaNacimientoEntregaO.setActionCommand("Original");
        rbActaNacimientoEntregaC.setActionCommand("Copia");
        rbActaNacimientoEntregaN.setActionCommand("No");

        rbCurpYRfcEntregaO.setActionCommand("Original");
        rbCurpYRfcEntregaC.setActionCommand("Copia");
        rbCurpYRfcEntregaN.setActionCommand("No");

        rbComprobanteDomEntregaO.setActionCommand("Original");
        rbComprobanteDomEntregaC.setActionCommand("Copia");
        rbComprobanteDomEntregaN.setActionCommand("No");


        rbCartaAntecedentesEntregaO.setActionCommand("Original");
        rbCartaAntecedentesEntregaC.setActionCommand("Copia");
        rbCartaAntecedentesEntregaN.setActionCommand("No");


        rbComprobanteEstudiosEntregaO.setActionCommand("Original");
        rbComprobanteEstudiosEntregaC.setActionCommand("Copia");
        rbComprobanteEstudiosEntregaN.setActionCommand("No");

        rbCartillaEntregaO.setActionCommand("Original");
        rbCartillaEntregaC.setActionCommand("Copia");
        rbCartillaEntregaN.setActionCommand("No");

        rbContratoEntregaO.setActionCommand("Original");
        rbContratoEntregaC.setActionCommand("Copia");
        rbContratoEntregaN.setActionCommand("No");

        rbCartaRecomendacionEntregaO.setActionCommand("Original");
        rbCartaRecomendacionEntregaC.setActionCommand("Copia");
        rbCartaRecomendacionEntregaN.setActionCommand("No");

        rbNumeroImssEntregaO.setActionCommand("Original");
        rbNumeroImssEntregaC.setActionCommand("Copia");
        rbNumeroImssEntregaN.setActionCommand("No");

        rbSocioeconomicoEntregaO.setActionCommand("Original");
        rbSocioeconomicoEntregaC.setActionCommand("Copia");
        rbSocioeconomicoEntregaN.setActionCommand("No");

        rbSocioeconomicoEntrega2O.setActionCommand("Original");
        rbSocioeconomicoEntrega2C.setActionCommand("Copia");
        rbSocioeconomicoEntrega2N.setActionCommand("No");

        rbPsicologicoEntregaO.setActionCommand("Original");
        rbPsicologicoEntregaC.setActionCommand("Copia");
        rbPsicologicoEntregaN.setActionCommand("No");

        rbComprobanteMedicoEntregaO.setActionCommand("Original");
        rbComprobanteMedicoEntregaC.setActionCommand("Copia");
        rbComprobanteMedicoEntregaN.setActionCommand("No");

        rbToxicologicoEntregaO.setActionCommand("Original");
        rbToxicologicoEntregaC.setActionCommand("Copia");
        rbToxicologicoEntregaN.setActionCommand("No");

        rbCartaResguardoEntregaO.setActionCommand("Original");
        rbCartaResguardoEntregaC.setActionCommand("Copia");
        rbCartaResguardoEntregaN.setActionCommand("No");

        rbMapaDomicilioEntregaO.setActionCommand("Original");
        rbMapaDomicilioEntregaC.setActionCommand("Copia");
        rbMapaDomicilioEntregaN.setActionCommand("No");

        rbCursoRecibido.setActionCommand("Recibido");
        rbCursoImpartido.setActionCommand("Impartido");

        rbCursoInconcluso.setActionCommand("No concluido");
        rbCursoConcluido.setActionCommand("Concluido");
        rbCursoEncurso.setActionCommand("En curso");
        rbCursoSolicitud.setActionCommand("Solicitud");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        bgCartillaMilitar = new javax.swing.ButtonGroup();
        bgHojaDatosEntrega = new javax.swing.ButtonGroup();
        bgSolicitudEntrega = new javax.swing.ButtonGroup();
        bgIfeEntrega = new javax.swing.ButtonGroup();
        bgActaNacimientoEntrega = new javax.swing.ButtonGroup();
        bgCurpRfcEntrega = new javax.swing.ButtonGroup();
        bgComprobanteDomicilioEntrega = new javax.swing.ButtonGroup();
        bgCartaNoAntecedentesEntrega = new javax.swing.ButtonGroup();
        bgComprobanteEstudiosEntrega = new javax.swing.ButtonGroup();
        bgCartillaMilitarEntrega = new javax.swing.ButtonGroup();
        bgNumeroImssEntrega = new javax.swing.ButtonGroup();
        bgCartaRecomendacionEntrega = new javax.swing.ButtonGroup();
        bgContratoEntrega = new javax.swing.ButtonGroup();
        bgSocioeconomicoEntrega = new javax.swing.ButtonGroup();
        bgFotoSocioeconomicoEntrega = new javax.swing.ButtonGroup();
        bgPsicologicoEntrega = new javax.swing.ButtonGroup();
        bgComprobanteMedicoEntrega = new javax.swing.ButtonGroup();
        bgToxicologicoEntrega = new javax.swing.ButtonGroup();
        bgResguardoEntrega = new javax.swing.ButtonGroup();
        bgMapaDomicilioEntrega = new javax.swing.ButtonGroup();
        bgSepRegistroEstudios = new javax.swing.ButtonGroup();
        bgSocio1 = new javax.swing.ButtonGroup();
        bgSocio1Casa = new javax.swing.ButtonGroup();
        bgSocio1CasaTipo = new javax.swing.ButtonGroup();
        bgCurso = new javax.swing.ButtonGroup();
        bgCursoStatus = new javax.swing.ButtonGroup();
        spRegistroElemento = new javax.swing.JScrollPane();
        pRegistroElemento = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        tpRegistroElemento = new javax.swing.JTabbedPane();
        pDatosPersonales = new javax.swing.JPanel();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        pSexo = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblEstatura = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblKg = new javax.swing.JLabel();
        lblMts = new javax.swing.JLabel();
        lblComplexion = new javax.swing.JLabel();
        cbComplexion = new javax.swing.JComboBox();
        lblColorPiel = new javax.swing.JLabel();
        cbColorPiel = new javax.swing.JComboBox();
        lblCara = new javax.swing.JLabel();
        cbCara = new javax.swing.JComboBox();
        lblSangre = new javax.swing.JLabel();
        cbSangre = new javax.swing.JComboBox();
        lblAlergias = new javax.swing.JLabel();
        spAlergias = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pNacimiento = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        dpFecha = new org.jdesktop.swingx.JXDatePicker();
        lblEstado = new javax.swing.JLabel();
        javax.swing.JComboBox cbEstados = new javax.swing.JComboBox();
        lblMunicipio = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox();
        lblEstadoCivil = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JComboBox();
        pDomicilio = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblInterior = new javax.swing.JLabel();
        txtInterior = new javax.swing.JTextField();
        lblExterior = new javax.swing.JLabel();
        txtExterior = new javax.swing.JTextField();
        lblColonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblPostal = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        lblEntre = new javax.swing.JLabel();
        txtEntre = new javax.swing.JTextField();
        lblY = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        lblEstadoD = new javax.swing.JLabel();
        cbEstadoD = new javax.swing.JComboBox();
        lblMunicipioD = new javax.swing.JLabel();
        cbMunicipioD = new javax.swing.JComboBox();
        pEstudios = new javax.swing.JPanel();
        pEstudiosMaximos = new javax.swing.JPanel();
        lblEstadoEstudios = new javax.swing.JLabel();
        lblMunicipioEstudios = new javax.swing.JLabel();
        cbMunicipioEstudios = new javax.swing.JComboBox();
        lblEscolaridadEstudios = new javax.swing.JLabel();
        cbEscolaridadEstudios = new javax.swing.JComboBox();
        cbEstadoEstudios = new javax.swing.JComboBox();
        lblEscuelaEstudios = new javax.swing.JLabel();
        txtNombreEstudios = new javax.swing.JTextField();
        lblEspecialidadEstudios = new javax.swing.JLabel();
        txtEspecialidadEstudios = new javax.swing.JTextField();
        panelRegistroSep = new javax.swing.JPanel();
        rbSepCertificadoS = new javax.swing.JRadioButton();
        rbSepCertificadoN = new javax.swing.JRadioButton();
        lblCedulaEstudios = new javax.swing.JLabel();
        txtCedulaEstudios = new javax.swing.JTextField();
        lblIngresoEstudios = new javax.swing.JLabel();
        txtIngresoEstudios = new javax.swing.JTextField();
        lblEgresoSalida = new javax.swing.JLabel();
        txtYearEgresoSalida = new javax.swing.JTextField();
        lblComprobanteEstudiosFolio = new javax.swing.JLabel();
        txtComprobanteFolioEstudios = new javax.swing.JTextField();
        lblPromedioEstudios = new javax.swing.JLabel();
        txtPromedioEstudios = new javax.swing.JTextField();
        pDocumentos = new javax.swing.JPanel();
        lblCurp = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblNumeroImss = new javax.swing.JLabel();
        txtNumeroImss = new javax.swing.JTextField();
        pCartillaMilitar = new javax.swing.JPanel();
        rbCartillaLiberada = new javax.swing.JRadioButton();
        rbPreCartilla = new javax.swing.JRadioButton();
        rbNoAplica = new javax.swing.JRadioButton();
        lblNumeroCartilla = new javax.swing.JLabel();
        txtNumeroCartilla = new javax.swing.JTextField();
        lblIfeClave = new javax.swing.JLabel();
        txtIfeClave = new javax.swing.JTextField();
        lblIfeFolio = new javax.swing.JLabel();
        txtIfeFolio = new javax.swing.JTextField();
        lblCuip = new javax.swing.JLabel();
        txtCuip = new javax.swing.JTextField();
        lblPasaporte = new javax.swing.JLabel();
        txtPasaporte = new javax.swing.JTextField();
        pDocEntregados = new javax.swing.JPanel();
        pHojaDatos = new javax.swing.JPanel();
        rbHojaDatosEntregaO = new javax.swing.JRadioButton();
        rbHojaDatosEntregaC = new javax.swing.JRadioButton();
        rbHojaDatosEntregaN = new javax.swing.JRadioButton();
        pSolicitud = new javax.swing.JPanel();
        rbSolicitudEntregaO = new javax.swing.JRadioButton();
        rbSolicitudEntregaC = new javax.swing.JRadioButton();
        rbSolicitudEntregaN = new javax.swing.JRadioButton();
        pIfe = new javax.swing.JPanel();
        rbIfeEntregaO = new javax.swing.JRadioButton();
        rbIfeEntregaC = new javax.swing.JRadioButton();
        rbIfeEntregaN = new javax.swing.JRadioButton();
        pActaNacimiento = new javax.swing.JPanel();
        rbActaNacimientoEntregaO = new javax.swing.JRadioButton();
        rbActaNacimientoEntregaC = new javax.swing.JRadioButton();
        rbActaNacimientoEntregaN = new javax.swing.JRadioButton();
        pCurpYRfc = new javax.swing.JPanel();
        rbCurpYRfcEntregaO = new javax.swing.JRadioButton();
        rbCurpYRfcEntregaC = new javax.swing.JRadioButton();
        rbCurpYRfcEntregaN = new javax.swing.JRadioButton();
        pComprobanteDom = new javax.swing.JPanel();
        rbComprobanteDomEntregaO = new javax.swing.JRadioButton();
        rbComprobanteDomEntregaC = new javax.swing.JRadioButton();
        rbComprobanteDomEntregaN = new javax.swing.JRadioButton();
        dpComprobanteDomEntrega = new org.jdesktop.swingx.JXDatePicker();
        pCartaAntecedentes = new javax.swing.JPanel();
        rbCartaAntecedentesEntregaO = new javax.swing.JRadioButton();
        rbCartaAntecedentesEntregaC = new javax.swing.JRadioButton();
        rbCartaAntecedentesEntregaN = new javax.swing.JRadioButton();
        dpCartaAntecedentesEntrega = new org.jdesktop.swingx.JXDatePicker();
        pComprobanteEstudios = new javax.swing.JPanel();
        rbComprobanteEstudiosEntregaO = new javax.swing.JRadioButton();
        rbComprobanteEstudiosEntregaC = new javax.swing.JRadioButton();
        rbComprobanteEstudiosEntregaN = new javax.swing.JRadioButton();
        pDocumentos2 = new javax.swing.JPanel();
        pDocEntregados2 = new javax.swing.JPanel();
        pCartillaEntrega = new javax.swing.JPanel();
        rbCartillaEntregaO = new javax.swing.JRadioButton();
        rbCartillaEntregaC = new javax.swing.JRadioButton();
        rbCartillaEntregaN = new javax.swing.JRadioButton();
        pContratoEntrega = new javax.swing.JPanel();
        rbContratoEntregaO = new javax.swing.JRadioButton();
        rbContratoEntregaC = new javax.swing.JRadioButton();
        rbContratoEntregaN = new javax.swing.JRadioButton();
        pCartaRecomendacionEntrega = new javax.swing.JPanel();
        rbCartaRecomendacionEntregaO = new javax.swing.JRadioButton();
        rbCartaRecomendacionEntregaC = new javax.swing.JRadioButton();
        rbCartaRecomendacionEntregaN = new javax.swing.JRadioButton();
        pNumeroImssEntrega = new javax.swing.JPanel();
        rbNumeroImssEntregaO = new javax.swing.JRadioButton();
        rbNumeroImssEntregaC = new javax.swing.JRadioButton();
        rbNumeroImssEntregaN = new javax.swing.JRadioButton();
        pSocioeconomicoEntrega = new javax.swing.JPanel();
        rbSocioeconomicoEntregaO = new javax.swing.JRadioButton();
        rbSocioeconomicoEntregaC = new javax.swing.JRadioButton();
        rbSocioeconomicoEntregaN = new javax.swing.JRadioButton();
        dpSocioeconomicoEntrega = new org.jdesktop.swingx.JXDatePicker();
        pSocioeconomicoEntrega2 = new javax.swing.JPanel();
        rbSocioeconomicoEntrega2O = new javax.swing.JRadioButton();
        rbSocioeconomicoEntrega2C = new javax.swing.JRadioButton();
        rbSocioeconomicoEntrega2N = new javax.swing.JRadioButton();
        pPsicologicoEntrega = new javax.swing.JPanel();
        rbPsicologicoEntregaO = new javax.swing.JRadioButton();
        rbPsicologicoEntregaC = new javax.swing.JRadioButton();
        rbPsicologicoEntregaN = new javax.swing.JRadioButton();
        pComprobanteMedicoEntrega = new javax.swing.JPanel();
        rbComprobanteMedicoEntregaO = new javax.swing.JRadioButton();
        rbComprobanteMedicoEntregaC = new javax.swing.JRadioButton();
        rbComprobanteMedicoEntregaN = new javax.swing.JRadioButton();
        pToxicologicoEntrega = new javax.swing.JPanel();
        rbToxicologicoEntregaO = new javax.swing.JRadioButton();
        rbToxicologicoEntregaC = new javax.swing.JRadioButton();
        rbToxicologicoEntregaN = new javax.swing.JRadioButton();
        pCartaResguardoEntrega = new javax.swing.JPanel();
        rbCartaResguardoEntregaO = new javax.swing.JRadioButton();
        rbCartaResguardoEntregaC = new javax.swing.JRadioButton();
        rbCartaResguardoEntregaN = new javax.swing.JRadioButton();
        pMapaDomicilioEntrega = new javax.swing.JPanel();
        rbMapaDomicilioEntregaO = new javax.swing.JRadioButton();
        rbMapaDomicilioEntregaC = new javax.swing.JRadioButton();
        rbMapaDomicilioEntregaN = new javax.swing.JRadioButton();
        pReferenciasPersonales = new javax.swing.JPanel();
        pReferenciaPersonal1 = new javax.swing.JPanel();
        lblNombreReferencia1 = new javax.swing.JLabel();
        txtNombreReferencia1 = new javax.swing.JTextField();
        lblParentescoReferencia1 = new javax.swing.JLabel();
        lblOcupacionReferencia1 = new javax.swing.JLabel();
        txtOcupacionReferencia1 = new javax.swing.JTextField();
        lblTelefonoReferencia1 = new javax.swing.JLabel();
        txtTelefonoReferencia1 = new javax.swing.JTextField();
        lblEstadoReferencia1 = new javax.swing.JLabel();
        cbEstadoReferencia1 = new javax.swing.JComboBox();
        lblMunicipioReferencia1 = new javax.swing.JLabel();
        cbMunicipioReferencia1 = new javax.swing.JComboBox();
        lblColoniaReferencia1 = new javax.swing.JLabel();
        txtColoniaReferencia1 = new javax.swing.JTextField();
        lblDireccionReferencia1 = new javax.swing.JLabel();
        txtDireccionReferencia1 = new javax.swing.JTextField();
        lblInteriorReferencia1 = new javax.swing.JLabel();
        txtInteriorReferencia1 = new javax.swing.JTextField();
        lblExteriorReferencia1 = new javax.swing.JLabel();
        txtExteriorReferencia1 = new javax.swing.JTextField();
        lblConocerloReferencia1 = new javax.swing.JLabel();
        txtConocerloReferencia1 = new javax.swing.JTextField();
        lblYearsReferencia1 = new javax.swing.JLabel();
        txtParentescoReferencia1 = new javax.swing.JTextField();
        pReferenciaPersonal2 = new javax.swing.JPanel();
        lblNombreReferencia2 = new javax.swing.JLabel();
        lblParentescoReferencia2 = new javax.swing.JLabel();
        lblOcupacionReferencia2 = new javax.swing.JLabel();
        txtOcupacionReferencia2 = new javax.swing.JTextField();
        lblTelefonoReferencia2 = new javax.swing.JLabel();
        txtTelefonoReferencia2 = new javax.swing.JTextField();
        lblEstadoReferencia2 = new javax.swing.JLabel();
        cbEstadoReferencia2 = new javax.swing.JComboBox();
        lblMunicipioReferencia2 = new javax.swing.JLabel();
        cbMunicipioReferencia2 = new javax.swing.JComboBox();
        lblColoniaReferencia2 = new javax.swing.JLabel();
        txtColoniaReferencia2 = new javax.swing.JTextField();
        lblDireccionReferencia2 = new javax.swing.JLabel();
        txtDireccionReferencia2 = new javax.swing.JTextField();
        lblInteriorReferencia2 = new javax.swing.JLabel();
        txtInteriorReferencia2 = new javax.swing.JTextField();
        lblExteriorReferencia2 = new javax.swing.JLabel();
        txtExteriorReferencia2 = new javax.swing.JTextField();
        lblConocerloReferencia2 = new javax.swing.JLabel();
        txtConocerloReferencia2 = new javax.swing.JTextField();
        lblYearsReferencia2 = new javax.swing.JLabel();
        txtParentescoReferencia2 = new javax.swing.JTextField();
        txtNombreReferencia2 = new javax.swing.JTextField();
        pReferenciasLaborales = new javax.swing.JPanel();
        pReferenciaPersonal3 = new javax.swing.JPanel();
        lblNombreReferencia3 = new javax.swing.JLabel();
        txtNombreReferencia3 = new javax.swing.JTextField();
        lblParentescoReferencia3 = new javax.swing.JLabel();
        lblOcupacionReferencia3 = new javax.swing.JLabel();
        txtOcupacionReferencia3 = new javax.swing.JTextField();
        lblTelefonoReferencia3 = new javax.swing.JLabel();
        txtTelefonoReferencia3 = new javax.swing.JTextField();
        lblEstadoReferencia3 = new javax.swing.JLabel();
        cbEstadoReferencia3 = new javax.swing.JComboBox();
        lblMunicipioReferencia3 = new javax.swing.JLabel();
        cbMunicipioReferencia3 = new javax.swing.JComboBox();
        lblColoniaReferencia3 = new javax.swing.JLabel();
        txtColoniaReferencia3 = new javax.swing.JTextField();
        lblDireccionReferencia3 = new javax.swing.JLabel();
        txtDireccionReferencia3 = new javax.swing.JTextField();
        lblInteriorReferencia3 = new javax.swing.JLabel();
        txtInteriorReferencia3 = new javax.swing.JTextField();
        lblExteriorReferencia3 = new javax.swing.JLabel();
        txtExteriorReferencia3 = new javax.swing.JTextField();
        lblConocerloReferencia3 = new javax.swing.JLabel();
        txtConocerloReferencia3 = new javax.swing.JTextField();
        lblYearsReferencia3 = new javax.swing.JLabel();
        txtParentescoReferencia3 = new javax.swing.JTextField();
        pReferenciaPersonal4 = new javax.swing.JPanel();
        lblNombreReferencia4 = new javax.swing.JLabel();
        txtNombreReferencia4 = new javax.swing.JTextField();
        lblParentescoReferencia4 = new javax.swing.JLabel();
        lblOcupacionReferencia4 = new javax.swing.JLabel();
        txtOcupacionReferencia4 = new javax.swing.JTextField();
        lblTelefonoReferencia4 = new javax.swing.JLabel();
        txtTelefonoReferencia4 = new javax.swing.JTextField();
        lblEstadoReferencia4 = new javax.swing.JLabel();
        cbEstadoReferencia4 = new javax.swing.JComboBox();
        lblMunicipioReferencia4 = new javax.swing.JLabel();
        cbMunicipioReferencia4 = new javax.swing.JComboBox();
        lblColoniaReferencia4 = new javax.swing.JLabel();
        txtColoniaReferencia4 = new javax.swing.JTextField();
        lblDireccionReferencia4 = new javax.swing.JLabel();
        txtDireccionReferencia4 = new javax.swing.JTextField();
        lblInteriorReferencia4 = new javax.swing.JLabel();
        txtInteriorReferencia4 = new javax.swing.JTextField();
        lblExteriorReferencia4 = new javax.swing.JLabel();
        txtExteriorReferencia4 = new javax.swing.JTextField();
        lblConocerloReferencia4 = new javax.swing.JLabel();
        txtConocerloReferencia4 = new javax.swing.JTextField();
        lblYearsReferencia4 = new javax.swing.JLabel();
        txtParentescoReferencia4 = new javax.swing.JTextField();
        pExperienciaLaboral1 = new javax.swing.JPanel();
        pTrabajoAnterior1 = new javax.swing.JPanel();
        lblDependenciaEA1 = new javax.swing.JLabel();
        txtDependenciaEA1 = new javax.swing.JTextField();
        lblCorporacionEA1 = new javax.swing.JLabel();
        txtCorporacionEA1 = new javax.swing.JTextField();
        lblDireccionEA1 = new javax.swing.JLabel();
        txtDireccionEA1 = new javax.swing.JTextField();
        lblInteriorEA1 = new javax.swing.JLabel();
        txtInteriorEA1 = new javax.swing.JTextField();
        lblExteriorEA1 = new javax.swing.JLabel();
        txtExteriorEA1 = new javax.swing.JTextField();
        lblColoniaEA1 = new javax.swing.JLabel();
        txtColoniaEA1 = new javax.swing.JTextField();
        lblCodigoEA1 = new javax.swing.JLabel();
        txtCodigoPostalEA1 = new javax.swing.JTextField();
        lblTelefonosEA1 = new javax.swing.JLabel();
        txtTelefonosEA1 = new javax.swing.JTextField();
        lblEstadoEA1 = new javax.swing.JLabel();
        cbEstadosEA1 = new javax.swing.JComboBox();
        lblMunicipioEA1 = new javax.swing.JLabel();
        cbMunicipiosEA1 = new javax.swing.JComboBox();
        lblIngresoEA1 = new javax.swing.JLabel();
        dpIngresoEA1 = new org.jdesktop.swingx.JXDatePicker();
        lblSalidaEA1 = new javax.swing.JLabel();
        dpSalidaEA1 = new org.jdesktop.swingx.JXDatePicker();
        lblPuestoEA1 = new javax.swing.JLabel();
        txtPuestoEA1 = new javax.swing.JTextField();
        lblFuncionesEA1 = new javax.swing.JLabel();
        txtFuncionesEA1 = new javax.swing.JTextField();
        lblEspecialidadEA1 = new javax.swing.JLabel();
        txtEspecialidadEA1 = new javax.swing.JTextField();
        lblRangoCategoriaEA1 = new javax.swing.JLabel();
        txtRangoCategoriaEA1 = new javax.swing.JTextField();
        lblSueldoEA1 = new javax.swing.JLabel();
        lblPlacaEA1 = new javax.swing.JLabel();
        txtPlacaEA1 = new javax.swing.JTextField();
        lblAreaEA1 = new javax.swing.JLabel();
        txtAreaEA1 = new javax.swing.JTextField();
        lblDivisionEA1 = new javax.swing.JLabel();
        txtDivisionEA1 = new javax.swing.JTextField();
        txtSueldoEA1 = new javax.swing.JTextField();
        lblJefeEA1 = new javax.swing.JLabel();
        txtJefeEA1 = new javax.swing.JTextField();
        lblCuipEA1 = new javax.swing.JLabel();
        txtCuipEA1 = new javax.swing.JTextField();
        lblMotivoEA1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMotivoEA1 = new javax.swing.JTextArea();
        pExperienciaLaboral2 = new javax.swing.JPanel();
        pTrabajoAnterior2 = new javax.swing.JPanel();
        lblDependenciaEA2 = new javax.swing.JLabel();
        txtDependenciaEA2 = new javax.swing.JTextField();
        lblCorporacionEA2 = new javax.swing.JLabel();
        txtCorporacionEA2 = new javax.swing.JTextField();
        lblDireccionEA2 = new javax.swing.JLabel();
        txtDireccionEA2 = new javax.swing.JTextField();
        lblInteriorEA2 = new javax.swing.JLabel();
        txtInteriorEA2 = new javax.swing.JTextField();
        lblExteriorEA2 = new javax.swing.JLabel();
        txtExteriorEA2 = new javax.swing.JTextField();
        lblColoniaEA2 = new javax.swing.JLabel();
        txtColoniaEA2 = new javax.swing.JTextField();
        lblCodigoEA2 = new javax.swing.JLabel();
        txtCodigoPostalEA2 = new javax.swing.JTextField();
        lblTelefonosEA2 = new javax.swing.JLabel();
        txtTelefonosEA2 = new javax.swing.JTextField();
        lblEstadoEA2 = new javax.swing.JLabel();
        cbEstadosEA2 = new javax.swing.JComboBox();
        lblMunicipioEA2 = new javax.swing.JLabel();
        cbMunicipiosEA2 = new javax.swing.JComboBox();
        lblIngresoEA2 = new javax.swing.JLabel();
        dpIngresoEA2 = new org.jdesktop.swingx.JXDatePicker();
        lblSalidaEA2 = new javax.swing.JLabel();
        dpSalidaEA2 = new org.jdesktop.swingx.JXDatePicker();
        lblPuestoEA2 = new javax.swing.JLabel();
        txtPuestoEA2 = new javax.swing.JTextField();
        lblFuncionesEA2 = new javax.swing.JLabel();
        txtFuncionesEA2 = new javax.swing.JTextField();
        lblEspecialidadEA2 = new javax.swing.JLabel();
        txtEspecialidadEA2 = new javax.swing.JTextField();
        lblRangoCategoriaEA2 = new javax.swing.JLabel();
        txtRangoCategoriaEA2 = new javax.swing.JTextField();
        lblSueldoEA2 = new javax.swing.JLabel();
        lblPlacaEA2 = new javax.swing.JLabel();
        txtPlacaEA2 = new javax.swing.JTextField();
        lblAreaEA2 = new javax.swing.JLabel();
        txtAreaEA2 = new javax.swing.JTextField();
        lblDivisionEA2 = new javax.swing.JLabel();
        txtDivisionEA2 = new javax.swing.JTextField();
        txtSueldoEA2 = new javax.swing.JTextField();
        lblJefeEA2 = new javax.swing.JLabel();
        txtJefeEA2 = new javax.swing.JTextField();
        lblCuipEA2 = new javax.swing.JLabel();
        txtCuipEA2 = new javax.swing.JTextField();
        lblMotivoEA2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMotivoEA2 = new javax.swing.JTextArea();
        pExperienciaLaboral3 = new javax.swing.JPanel();
        pTrabajoAnterior3 = new javax.swing.JPanel();
        lblDependenciaEA3 = new javax.swing.JLabel();
        txtDependenciaEA3 = new javax.swing.JTextField();
        lblCorporacionEA3 = new javax.swing.JLabel();
        txtCorporacionEA3 = new javax.swing.JTextField();
        lblDireccionEA3 = new javax.swing.JLabel();
        txtDireccionEA3 = new javax.swing.JTextField();
        lblInteriorEA3 = new javax.swing.JLabel();
        txtInteriorEA3 = new javax.swing.JTextField();
        lblExteriorEA3 = new javax.swing.JLabel();
        txtExteriorEA3 = new javax.swing.JTextField();
        lblColoniaEA3 = new javax.swing.JLabel();
        txtColoniaEA3 = new javax.swing.JTextField();
        lblCodigoEA3 = new javax.swing.JLabel();
        txtCodigoPostalEA3 = new javax.swing.JTextField();
        lblTelefonosEA3 = new javax.swing.JLabel();
        txtTelefonosEA3 = new javax.swing.JTextField();
        lblEstadoEA3 = new javax.swing.JLabel();
        cbEstadosEA3 = new javax.swing.JComboBox();
        lblMunicipioEA3 = new javax.swing.JLabel();
        cbMunicipiosEA3 = new javax.swing.JComboBox();
        lblIngresoEA3 = new javax.swing.JLabel();
        dpIngresoEA3 = new org.jdesktop.swingx.JXDatePicker();
        lblSalidaEA3 = new javax.swing.JLabel();
        dpSalidaEA3 = new org.jdesktop.swingx.JXDatePicker();
        lblPuestoEA3 = new javax.swing.JLabel();
        txtPuestoEA3 = new javax.swing.JTextField();
        lblFuncionesEA3 = new javax.swing.JLabel();
        txtFuncionesEA3 = new javax.swing.JTextField();
        lblEspecialidadEA3 = new javax.swing.JLabel();
        txtEspecialidadEA3 = new javax.swing.JTextField();
        lblRangoCategoriaEA3 = new javax.swing.JLabel();
        txtRangoCategoriaEA3 = new javax.swing.JTextField();
        lblSueldoEA3 = new javax.swing.JLabel();
        lblPlacaEA3 = new javax.swing.JLabel();
        txtPlacaEA3 = new javax.swing.JTextField();
        lblAreaEA3 = new javax.swing.JLabel();
        txtAreaEA3 = new javax.swing.JTextField();
        lblDivisionEA3 = new javax.swing.JLabel();
        txtDivisionEA3 = new javax.swing.JTextField();
        txtSueldoEA3 = new javax.swing.JTextField();
        lblJefeEA3 = new javax.swing.JLabel();
        txtJefeEA3 = new javax.swing.JTextField();
        lblCuipEA3 = new javax.swing.JLabel();
        txtCuipEA3 = new javax.swing.JTextField();
        lblMotivoEA3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taMotivoEA3 = new javax.swing.JTextArea();
        pCursos = new javax.swing.JPanel();
        lblInstitucionEmpresa = new javax.swing.JLabel();
        txtEmpresaNombre = new javax.swing.JTextField();
        lblEstudioCurso = new javax.swing.JLabel();
        txtEstudioCurso = new javax.swing.JTextField();
        lblTipoCurso = new javax.swing.JLabel();
        txtTipoCurso = new javax.swing.JTextField();
        lblCursoImpartidoRecibido = new javax.swing.JLabel();
        rbCursoRecibido = new javax.swing.JRadioButton();
        rbCursoImpartido = new javax.swing.JRadioButton();
        lblCursoStatus = new javax.swing.JLabel();
        rbCursoInconcluso = new javax.swing.JRadioButton();
        rbCursoConcluido = new javax.swing.JRadioButton();
        rbCursoEncurso = new javax.swing.JRadioButton();
        rbCursoSolicitud = new javax.swing.JRadioButton();
        lblCursoDuración = new javax.swing.JLabel();
        txtCursoDuracion = new javax.swing.JTextField();
        lblCursoInicio = new javax.swing.JLabel();
        dpCursoInicio = new org.jdesktop.swingx.JXDatePicker();
        lblCursoFin = new javax.swing.JLabel();
        dpCursoFin = new org.jdesktop.swingx.JXDatePicker();
        btnCursoAceptar = new javax.swing.JButton();
        PCursosTotales = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tCursosTomados = new javax.swing.JTable();
        pFotos = new javax.swing.JPanel();
        pBuscaFotos = new javax.swing.JPanel();
        lblFotoFrente = new javax.swing.JLabel();
        txtFotoFrente = new javax.swing.JTextField();
        btnFotoFrente = new javax.swing.JButton();
        lblFotoPerfilIzquierdo = new javax.swing.JLabel();
        txtFotoPerfilIzquierdo = new javax.swing.JTextField();
        btnFotoPerfilIzquierdo = new javax.swing.JButton();
        lblFotoPerfilDerecho = new javax.swing.JLabel();
        txtFotoPerfilDerecho = new javax.swing.JTextField();
        btnFotoPerfilDerecho = new javax.swing.JButton();
        btnFotoSocioeconomico1 = new javax.swing.JButton();
        btnFotoSocioeconomico2 = new javax.swing.JButton();
        txtFotoSocioeconomico2 = new javax.swing.JTextField();
        txtFotoSocioeconomico1 = new javax.swing.JTextField();
        lblFotoSocioeconomico1 = new javax.swing.JLabel();
        lblFotoSocioeconomico2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pRegistroElemento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pRegistroElemento.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 110, -1));

        lblApellidoPaterno.setText("Apellido Paterno");

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        lblApellidoMaterno.setText("Apellido Materno");

        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        lblNombre.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblStatus.setText("Status");

        txtStatus.setText("NO DISPONIBLE");
        txtStatus.setEnabled(false);

        pSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        bgSexo.add(rbFemenino);
        rbFemenino.setText("Femenino");

        javax.swing.GroupLayout pSexoLayout = new javax.swing.GroupLayout(pSexo);
        pSexo.setLayout(pSexoLayout);
        pSexoLayout.setHorizontalGroup(
            pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSexoLayout.setVerticalGroup(
            pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSexoLayout.createSequentialGroup()
                .addComponent(rbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFemenino)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        lblEdad.setText("Edad");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        lblEstatura.setText("Estatura");

        txtEstatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstaturaKeyTyped(evt);
            }
        });

        lblPeso.setText("Peso");

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        lblKg.setText("kg.");

        lblMts.setText("mts.");

        lblComplexion.setText("Complexión");

        cbComplexion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Delgada", "Robusta" }));

        lblColorPiel.setText("Color de piel");

        cbColorPiel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blanca", "Medio", "Morena" }));

        lblCara.setText("Cara");

        cbCara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cuadrada", "Triángulo invertido", "Alargada", "Pera", "Ovalada", "Redonda" }));

        lblSangre.setText("Tipo de sangre");

        cbSangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-" }));

        lblAlergias.setText("Alergias");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        spAlergias.setViewportView(jTextArea1);

        pNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Nacimiento"));

        lblFecha.setText("Fecha");

        lblEstado.setText("Estado");

        cbEstados.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));/*
        cbEstados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        */
        cbEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadosActionPerformed(evt);
            }
        });

        lblMunicipio.setText("Municipio");

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un estado" }));

        javax.swing.GroupLayout pNacimientoLayout = new javax.swing.GroupLayout(pNacimiento);
        pNacimiento.setLayout(pNacimientoLayout);
        pNacimientoLayout.setHorizontalGroup(
            pNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNacimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNacimientoLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pNacimientoLayout.createSequentialGroup()
                        .addComponent(lblMunicipio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pNacimientoLayout.setVerticalGroup(
            pNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNacimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(cbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipio)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblEstadoCivil.setText("Estado civil");

        txtEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Unión libre", "Casado", "Viudes" }));

        pDomicilio.setBorder(javax.swing.BorderFactory.createTitledBorder("Domicilio"));

        lblDireccion.setText("Dirección");

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        lblInterior.setText("Interior");

        txtInterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorKeyTyped(evt);
            }
        });

        lblExterior.setText("Exterior");

        txtExterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorKeyTyped(evt);
            }
        });

        lblColonia.setText("Colonia");

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });

        lblPostal.setText("Código Postal");

        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });

        lblEntre.setText("Entre");

        txtEntre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntreKeyTyped(evt);
            }
        });

        lblY.setText("Y");

        txtY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYKeyTyped(evt);
            }
        });

        lblEstadoD.setText("Estado");

        cbEstadoD.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));/*
        */
        cbEstadoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoDActionPerformed(evt);
            }
        });

        lblMunicipioD.setText("Municipio");

        cbMunicipioD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un estado" }));
        cbMunicipioD.setToolTipText("");

        javax.swing.GroupLayout pDomicilioLayout = new javax.swing.GroupLayout(pDomicilio);
        pDomicilio.setLayout(pDomicilioLayout);
        pDomicilioLayout.setHorizontalGroup(
            pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDomicilioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDomicilioLayout.createSequentialGroup()
                        .addGroup(pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pDomicilioLayout.createSequentialGroup()
                                .addComponent(lblDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblInterior))
                            .addGroup(pDomicilioLayout.createSequentialGroup()
                                .addComponent(lblColonia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPostal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoPostal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblExterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDomicilioLayout.createSequentialGroup()
                        .addComponent(lblEntre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDomicilioLayout.createSequentialGroup()
                        .addComponent(lblEstadoD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstadoD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMunicipioD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMunicipioD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pDomicilioLayout.setVerticalGroup(
            pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDomicilioLayout.createSequentialGroup()
                .addGroup(pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInterior)
                    .addComponent(txtInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExterior)
                    .addComponent(txtExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColonia)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostal)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntre)
                    .addComponent(txtEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblY)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoD)
                    .addComponent(cbEstadoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioD)
                    .addComponent(cbMunicipioD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDatosPersonalesLayout = new javax.swing.GroupLayout(pDatosPersonales);
        pDatosPersonales.setLayout(pDatosPersonalesLayout);
        pDatosPersonalesLayout.setHorizontalGroup(
            pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(pNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(lblEstadoCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(lblApellidoPaterno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblApellidoMaterno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(pSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                                .addComponent(lblEdad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                                .addComponent(lblEstatura)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblMts))
                                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                                .addComponent(lblPeso)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblKg)))
                                        .addGap(9, 9, 9)
                                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                                .addComponent(lblComplexion)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbComplexion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblColorPiel)
                                                    .addComponent(lblCara))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbColorPiel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbCara, 0, 120, Short.MAX_VALUE))))
                                        .addGap(16, 16, 16)))
                                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(lblSangre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDatosPersonalesLayout.createSequentialGroup()
                                            .addComponent(lblNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                            .addComponent(lblAlergias)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(pDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(229, Short.MAX_VALUE))))
        );
        pDatosPersonalesLayout.setVerticalGroup(
            pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaterno)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoMaterno)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplexion)
                            .addComponent(cbComplexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSangre)
                            .addComponent(cbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstatura)
                                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMts)
                                    .addComponent(lblColorPiel)
                                    .addComponent(cbColorPiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAlergias))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPeso)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKg)
                                    .addComponent(lblCara)
                                    .addComponent(cbCara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstadoCivil)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Datos Personales", pDatosPersonales);

        pEstudiosMaximos.setBorder(javax.swing.BorderFactory.createTitledBorder("Máximo grado de estudios"));

        lblEstadoEstudios.setText("Estado");

        lblMunicipioEstudios.setText("Municipio");

        cbMunicipioEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona el Estado" }));

        lblEscolaridadEstudios.setText("Escolaridad");

        cbEscolaridadEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primaria", "Primaria Trunca", "Secundaria", "Secundaria Técnica", "Secundaria Trunca", "Bachillerato General", "Bachillerato Técnico", "Bachillerato Trunco", "Carrera", "Carrera Técnica", "Carrera Trunca" }));

        cbEstadoEstudios.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadoEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoEstudiosActionPerformed(evt);
            }
        });

        lblEscuelaEstudios.setText("Nombre");

        txtNombreEstudios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstudiosKeyTyped(evt);
            }
        });

        lblEspecialidadEstudios.setText("Especialidad");

        txtEspecialidadEstudios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecialidadEstudiosKeyTyped(evt);
            }
        });

        panelRegistroSep.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrada ante SEP"));

        bgSepRegistroEstudios.add(rbSepCertificadoS);
        rbSepCertificadoS.setText("Si");

        bgSepRegistroEstudios.add(rbSepCertificadoN);
        rbSepCertificadoN.setText("No");

        javax.swing.GroupLayout panelRegistroSepLayout = new javax.swing.GroupLayout(panelRegistroSep);
        panelRegistroSep.setLayout(panelRegistroSepLayout);
        panelRegistroSepLayout.setHorizontalGroup(
            panelRegistroSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroSepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroSepLayout.createSequentialGroup()
                        .addComponent(rbSepCertificadoN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRegistroSepLayout.createSequentialGroup()
                        .addComponent(rbSepCertificadoS)
                        .addGap(66, 117, Short.MAX_VALUE))))
        );
        panelRegistroSepLayout.setVerticalGroup(
            panelRegistroSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroSepLayout.createSequentialGroup()
                .addComponent(rbSepCertificadoS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSepCertificadoN))
        );

        lblCedulaEstudios.setText("Cédula Profesional");

        txtCedulaEstudios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEstudiosKeyTyped(evt);
            }
        });

        lblIngresoEstudios.setText("Año de ingreso");

        lblEgresoSalida.setText("Año de egreso o salida");

        lblComprobanteEstudiosFolio.setText("Folio de Comprobante de estudios");

        txtComprobanteFolioEstudios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComprobanteFolioEstudiosKeyTyped(evt);
            }
        });

        lblPromedioEstudios.setText("Promedio");

        txtPromedioEstudios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPromedioEstudiosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pEstudiosMaximosLayout = new javax.swing.GroupLayout(pEstudiosMaximos);
        pEstudiosMaximos.setLayout(pEstudiosMaximosLayout);
        pEstudiosMaximosLayout.setHorizontalGroup(
            pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                        .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                                    .addComponent(lblEstadoEstudios)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbEstadoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMunicipioEstudios)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMunicipioEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                                    .addComponent(lblEscolaridadEstudios)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbEscolaridadEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                                    .addComponent(lblEscuelaEstudios)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreEstudios)))
                            .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                                        .addComponent(lblEspecialidadEstudios)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEspecialidadEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEstudiosMaximosLayout.createSequentialGroup()
                                            .addComponent(lblComprobanteEstudiosFolio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtComprobanteFolioEstudios))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEstudiosMaximosLayout.createSequentialGroup()
                                            .addComponent(lblIngresoEstudios)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIngresoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblEgresoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtYearEgresoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelRegistroSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                                .addComponent(lblPromedioEstudios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPromedioEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                        .addComponent(lblCedulaEstudios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCedulaEstudios)))
                .addContainerGap())
        );
        pEstudiosMaximosLayout.setVerticalGroup(
            pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEstudios)
                    .addComponent(lblMunicipioEstudios)
                    .addComponent(cbMunicipioEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstadoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscolaridadEstudios)
                    .addComponent(cbEscolaridadEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscuelaEstudios)
                    .addComponent(txtNombreEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstudiosMaximosLayout.createSequentialGroup()
                        .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecialidadEstudios)
                            .addComponent(txtEspecialidadEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIngresoEstudios)
                            .addComponent(txtIngresoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEgresoSalida)
                            .addComponent(txtYearEgresoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComprobanteEstudiosFolio)
                            .addComponent(txtComprobanteFolioEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRegistroSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromedioEstudios)
                    .addComponent(txtPromedioEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pEstudiosMaximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaEstudios)
                    .addComponent(txtCedulaEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pEstudiosLayout = new javax.swing.GroupLayout(pEstudios);
        pEstudios.setLayout(pEstudiosLayout);
        pEstudiosLayout.setHorizontalGroup(
            pEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstudiosLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(pEstudiosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        pEstudiosLayout.setVerticalGroup(
            pEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstudiosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(pEstudiosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Estudios", pEstudios);

        lblCurp.setText("CURP");

        txtCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpKeyTyped(evt);
            }
        });

        lblRFC.setText("RFC");

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        lblNumeroImss.setText("Número IMSS");

        txtNumeroImss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroImssKeyTyped(evt);
            }
        });

        pCartillaMilitar.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartilla Militar"));

        bgCartillaMilitar.add(rbCartillaLiberada);
        rbCartillaLiberada.setText("Liberada");

        bgCartillaMilitar.add(rbPreCartilla);
        rbPreCartilla.setText("Pre-Cartilla");

        bgCartillaMilitar.add(rbNoAplica);
        rbNoAplica.setText("No Aplica");

        lblNumeroCartilla.setText("Número");

        txtNumeroCartilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCartillaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pCartillaMilitarLayout = new javax.swing.GroupLayout(pCartillaMilitar);
        pCartillaMilitar.setLayout(pCartillaMilitarLayout);
        pCartillaMilitarLayout.setHorizontalGroup(
            pCartillaMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartillaMilitarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCartillaMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCartillaMilitarLayout.createSequentialGroup()
                        .addGroup(pCartillaMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCartillaMilitarLayout.createSequentialGroup()
                                .addComponent(rbPreCartilla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(txtNumeroCartilla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCartillaMilitarLayout.createSequentialGroup()
                                .addComponent(rbNoAplica)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pCartillaMilitarLayout.createSequentialGroup()
                        .addComponent(rbCartillaLiberada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumeroCartilla)
                        .addGap(66, 66, 66))))
        );
        pCartillaMilitarLayout.setVerticalGroup(
            pCartillaMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartillaMilitarLayout.createSequentialGroup()
                .addGroup(pCartillaMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCartillaLiberada)
                    .addComponent(lblNumeroCartilla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCartillaMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPreCartilla)
                    .addComponent(txtNumeroCartilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNoAplica))
        );

        lblIfeClave.setText("IFE Clave");

        txtIfeClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIfeClaveKeyTyped(evt);
            }
        });

        lblIfeFolio.setText("IFE Folio");

        txtIfeFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIfeFolioKeyTyped(evt);
            }
        });

        lblCuip.setText("CUIP");

        lblPasaporte.setText("Pasaporte");

        txtPasaporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasaporteKeyTyped(evt);
            }
        });

        pDocEntregados.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentos entregados"));

        pHojaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Hoja de Datos"));

        bgHojaDatosEntrega.add(rbHojaDatosEntregaO);
        rbHojaDatosEntregaO.setText("Original");

        bgHojaDatosEntrega.add(rbHojaDatosEntregaC);
        rbHojaDatosEntregaC.setText("Copia");

        bgHojaDatosEntrega.add(rbHojaDatosEntregaN);
        rbHojaDatosEntregaN.setText("No");

        javax.swing.GroupLayout pHojaDatosLayout = new javax.swing.GroupLayout(pHojaDatos);
        pHojaDatos.setLayout(pHojaDatosLayout);
        pHojaDatosLayout.setHorizontalGroup(
            pHojaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHojaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHojaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbHojaDatosEntregaO)
                    .addComponent(rbHojaDatosEntregaC)
                    .addComponent(rbHojaDatosEntregaN))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pHojaDatosLayout.setVerticalGroup(
            pHojaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHojaDatosLayout.createSequentialGroup()
                .addComponent(rbHojaDatosEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHojaDatosEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHojaDatosEntregaN))
        );

        pSolicitud.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitud"));

        bgSolicitudEntrega.add(rbSolicitudEntregaO);
        rbSolicitudEntregaO.setText("Original");

        bgSolicitudEntrega.add(rbSolicitudEntregaC);
        rbSolicitudEntregaC.setText("Copia");

        bgSolicitudEntrega.add(rbSolicitudEntregaN);
        rbSolicitudEntregaN.setText("No");

        javax.swing.GroupLayout pSolicitudLayout = new javax.swing.GroupLayout(pSolicitud);
        pSolicitud.setLayout(pSolicitudLayout);
        pSolicitudLayout.setHorizontalGroup(
            pSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSolicitudEntregaO)
                    .addComponent(rbSolicitudEntregaC)
                    .addComponent(rbSolicitudEntregaN))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pSolicitudLayout.setVerticalGroup(
            pSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSolicitudLayout.createSequentialGroup()
                .addComponent(rbSolicitudEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSolicitudEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSolicitudEntregaN))
        );

        pIfe.setBorder(javax.swing.BorderFactory.createTitledBorder("IFE"));

        bgIfeEntrega.add(rbIfeEntregaO);
        rbIfeEntregaO.setText("Original");

        bgIfeEntrega.add(rbIfeEntregaC);
        rbIfeEntregaC.setText("Copia");

        bgIfeEntrega.add(rbIfeEntregaN);
        rbIfeEntregaN.setText("No");

        javax.swing.GroupLayout pIfeLayout = new javax.swing.GroupLayout(pIfe);
        pIfe.setLayout(pIfeLayout);
        pIfeLayout.setHorizontalGroup(
            pIfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIfeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbIfeEntregaO)
                    .addComponent(rbIfeEntregaC)
                    .addComponent(rbIfeEntregaN))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pIfeLayout.setVerticalGroup(
            pIfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIfeLayout.createSequentialGroup()
                .addComponent(rbIfeEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbIfeEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbIfeEntregaN))
        );

        pActaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acta de Nacimiento"));

        bgActaNacimientoEntrega.add(rbActaNacimientoEntregaO);
        rbActaNacimientoEntregaO.setText("Original");

        bgActaNacimientoEntrega.add(rbActaNacimientoEntregaC);
        rbActaNacimientoEntregaC.setText("Copia");

        bgActaNacimientoEntrega.add(rbActaNacimientoEntregaN);
        rbActaNacimientoEntregaN.setText("No");

        javax.swing.GroupLayout pActaNacimientoLayout = new javax.swing.GroupLayout(pActaNacimiento);
        pActaNacimiento.setLayout(pActaNacimientoLayout);
        pActaNacimientoLayout.setHorizontalGroup(
            pActaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pActaNacimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pActaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbActaNacimientoEntregaO)
                    .addComponent(rbActaNacimientoEntregaC)
                    .addComponent(rbActaNacimientoEntregaN))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pActaNacimientoLayout.setVerticalGroup(
            pActaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pActaNacimientoLayout.createSequentialGroup()
                .addComponent(rbActaNacimientoEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbActaNacimientoEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbActaNacimientoEntregaN))
        );

        pCurpYRfc.setBorder(javax.swing.BorderFactory.createTitledBorder("CURP y RFC"));

        bgCurpRfcEntrega.add(rbCurpYRfcEntregaO);
        rbCurpYRfcEntregaO.setText("Original");

        bgCurpRfcEntrega.add(rbCurpYRfcEntregaC);
        rbCurpYRfcEntregaC.setText("Copia");

        bgCurpRfcEntrega.add(rbCurpYRfcEntregaN);
        rbCurpYRfcEntregaN.setText("No");

        javax.swing.GroupLayout pCurpYRfcLayout = new javax.swing.GroupLayout(pCurpYRfc);
        pCurpYRfc.setLayout(pCurpYRfcLayout);
        pCurpYRfcLayout.setHorizontalGroup(
            pCurpYRfcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCurpYRfcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCurpYRfcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCurpYRfcEntregaO)
                    .addComponent(rbCurpYRfcEntregaC)
                    .addComponent(rbCurpYRfcEntregaN))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pCurpYRfcLayout.setVerticalGroup(
            pCurpYRfcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCurpYRfcLayout.createSequentialGroup()
                .addComponent(rbCurpYRfcEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCurpYRfcEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCurpYRfcEntregaN))
        );

        pComprobanteDom.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante de Domicilio"));

        bgComprobanteDomicilioEntrega.add(rbComprobanteDomEntregaO);
        rbComprobanteDomEntregaO.setText("Original");

        bgComprobanteDomicilioEntrega.add(rbComprobanteDomEntregaC);
        rbComprobanteDomEntregaC.setText("Copia");

        bgComprobanteDomicilioEntrega.add(rbComprobanteDomEntregaN);
        rbComprobanteDomEntregaN.setText("No");

        javax.swing.GroupLayout pComprobanteDomLayout = new javax.swing.GroupLayout(pComprobanteDom);
        pComprobanteDom.setLayout(pComprobanteDomLayout);
        pComprobanteDomLayout.setHorizontalGroup(
            pComprobanteDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprobanteDomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pComprobanteDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pComprobanteDomLayout.createSequentialGroup()
                        .addComponent(rbComprobanteDomEntregaN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pComprobanteDomLayout.createSequentialGroup()
                        .addGroup(pComprobanteDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbComprobanteDomEntregaO)
                            .addComponent(rbComprobanteDomEntregaC))
                        .addGap(18, 18, 18)
                        .addComponent(dpComprobanteDomEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pComprobanteDomLayout.setVerticalGroup(
            pComprobanteDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprobanteDomLayout.createSequentialGroup()
                .addGroup(pComprobanteDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pComprobanteDomLayout.createSequentialGroup()
                        .addComponent(rbComprobanteDomEntregaO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbComprobanteDomEntregaC))
                    .addGroup(pComprobanteDomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dpComprobanteDomEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComprobanteDomEntregaN))
        );

        pCartaAntecedentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Carta de No Antecedentes"));

        bgCartaNoAntecedentesEntrega.add(rbCartaAntecedentesEntregaO);
        rbCartaAntecedentesEntregaO.setText("Original");

        bgCartaNoAntecedentesEntrega.add(rbCartaAntecedentesEntregaC);
        rbCartaAntecedentesEntregaC.setText("Copia");

        bgCartaNoAntecedentesEntrega.add(rbCartaAntecedentesEntregaN);
        rbCartaAntecedentesEntregaN.setText("No");

        javax.swing.GroupLayout pCartaAntecedentesLayout = new javax.swing.GroupLayout(pCartaAntecedentes);
        pCartaAntecedentes.setLayout(pCartaAntecedentesLayout);
        pCartaAntecedentesLayout.setHorizontalGroup(
            pCartaAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaAntecedentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCartaAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCartaAntecedentesLayout.createSequentialGroup()
                        .addComponent(rbCartaAntecedentesEntregaN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pCartaAntecedentesLayout.createSequentialGroup()
                        .addGroup(pCartaAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCartaAntecedentesEntregaO)
                            .addComponent(rbCartaAntecedentesEntregaC))
                        .addGap(28, 28, 28)
                        .addComponent(dpCartaAntecedentesEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCartaAntecedentesLayout.setVerticalGroup(
            pCartaAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaAntecedentesLayout.createSequentialGroup()
                .addGroup(pCartaAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCartaAntecedentesLayout.createSequentialGroup()
                        .addComponent(rbCartaAntecedentesEntregaO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCartaAntecedentesEntregaC))
                    .addGroup(pCartaAntecedentesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dpCartaAntecedentesEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartaAntecedentesEntregaN))
        );

        pComprobanteEstudios.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante de estudios"));

        bgComprobanteEstudiosEntrega.add(rbComprobanteEstudiosEntregaO);
        rbComprobanteEstudiosEntregaO.setText("Original");

        bgComprobanteEstudiosEntrega.add(rbComprobanteEstudiosEntregaC);
        rbComprobanteEstudiosEntregaC.setText("Copia");

        bgComprobanteEstudiosEntrega.add(rbComprobanteEstudiosEntregaN);
        rbComprobanteEstudiosEntregaN.setText("No");

        javax.swing.GroupLayout pComprobanteEstudiosLayout = new javax.swing.GroupLayout(pComprobanteEstudios);
        pComprobanteEstudios.setLayout(pComprobanteEstudiosLayout);
        pComprobanteEstudiosLayout.setHorizontalGroup(
            pComprobanteEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprobanteEstudiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pComprobanteEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbComprobanteEstudiosEntregaO)
                    .addComponent(rbComprobanteEstudiosEntregaC)
                    .addComponent(rbComprobanteEstudiosEntregaN))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pComprobanteEstudiosLayout.setVerticalGroup(
            pComprobanteEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprobanteEstudiosLayout.createSequentialGroup()
                .addComponent(rbComprobanteEstudiosEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComprobanteEstudiosEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComprobanteEstudiosEntregaN))
        );

        javax.swing.GroupLayout pDocEntregadosLayout = new javax.swing.GroupLayout(pDocEntregados);
        pDocEntregados.setLayout(pDocEntregadosLayout);
        pDocEntregadosLayout.setHorizontalGroup(
            pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocEntregadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDocEntregadosLayout.createSequentialGroup()
                        .addComponent(pHojaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pComprobanteDom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDocEntregadosLayout.createSequentialGroup()
                        .addComponent(pIfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pActaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pCartaAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCurpYRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pComprobanteEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDocEntregadosLayout.setVerticalGroup(
            pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocEntregadosLayout.createSequentialGroup()
                .addGroup(pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pHojaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pIfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pActaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCurpYRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDocEntregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pComprobanteDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCartaAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pComprobanteEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDocumentosLayout = new javax.swing.GroupLayout(pDocumentos);
        pDocumentos.setLayout(pDocumentosLayout);
        pDocumentosLayout.setHorizontalGroup(
            pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pDocEntregados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDocumentosLayout.createSequentialGroup()
                        .addComponent(pCartillaMilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pDocumentosLayout.createSequentialGroup()
                                .addComponent(lblIfeClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIfeClave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDocumentosLayout.createSequentialGroup()
                                .addComponent(lblCuip)
                                .addGap(27, 27, 27)
                                .addComponent(txtCuip)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pDocumentosLayout.createSequentialGroup()
                                .addComponent(lblIfeFolio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIfeFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDocumentosLayout.createSequentialGroup()
                                .addComponent(lblPasaporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPasaporte)))
                        .addGap(0, 163, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDocumentosLayout.createSequentialGroup()
                        .addComponent(lblCurp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurp)
                        .addGap(18, 18, 18)
                        .addComponent(lblRFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumeroImss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroImss, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)))
                .addGap(15, 15, 15))
        );
        pDocumentosLayout.setVerticalGroup(
            pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurp)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroImss)
                    .addComponent(txtNumeroImss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCartillaMilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDocumentosLayout.createSequentialGroup()
                        .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIfeClave)
                            .addComponent(txtIfeClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIfeFolio)
                            .addComponent(txtIfeFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPasaporte)
                                .addComponent(txtPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCuip)
                                .addComponent(txtCuip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDocEntregados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpRegistroElemento.addTab("Documentos", pDocumentos);

        pDocEntregados2.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentos entregados"));

        pCartillaEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartilla Militar"));

        bgCartillaMilitarEntrega.add(rbCartillaEntregaO);
        rbCartillaEntregaO.setText("Original");

        bgCartillaMilitarEntrega.add(rbCartillaEntregaC);
        rbCartillaEntregaC.setText("Copia");

        bgCartillaMilitarEntrega.add(rbCartillaEntregaN);
        rbCartillaEntregaN.setText("No");

        javax.swing.GroupLayout pCartillaEntregaLayout = new javax.swing.GroupLayout(pCartillaEntrega);
        pCartillaEntrega.setLayout(pCartillaEntregaLayout);
        pCartillaEntregaLayout.setHorizontalGroup(
            pCartillaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartillaEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCartillaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCartillaEntregaO)
                    .addComponent(rbCartillaEntregaC)
                    .addComponent(rbCartillaEntregaN))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pCartillaEntregaLayout.setVerticalGroup(
            pCartillaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartillaEntregaLayout.createSequentialGroup()
                .addComponent(rbCartillaEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartillaEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartillaEntregaN))
        );

        pContratoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));

        bgContratoEntrega.add(rbContratoEntregaO);
        rbContratoEntregaO.setText("Original");

        bgContratoEntrega.add(rbContratoEntregaC);
        rbContratoEntregaC.setText("Copia");

        bgContratoEntrega.add(rbContratoEntregaN);
        rbContratoEntregaN.setText("No");

        javax.swing.GroupLayout pContratoEntregaLayout = new javax.swing.GroupLayout(pContratoEntrega);
        pContratoEntrega.setLayout(pContratoEntregaLayout);
        pContratoEntregaLayout.setHorizontalGroup(
            pContratoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContratoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pContratoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbContratoEntregaO)
                    .addComponent(rbContratoEntregaC)
                    .addComponent(rbContratoEntregaN))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pContratoEntregaLayout.setVerticalGroup(
            pContratoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContratoEntregaLayout.createSequentialGroup()
                .addComponent(rbContratoEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbContratoEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbContratoEntregaN))
        );

        pCartaRecomendacionEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartas de recomendación"));

        bgCartaRecomendacionEntrega.add(rbCartaRecomendacionEntregaO);
        rbCartaRecomendacionEntregaO.setText("Original");

        bgCartaRecomendacionEntrega.add(rbCartaRecomendacionEntregaC);
        rbCartaRecomendacionEntregaC.setText("Copia");

        bgCartaRecomendacionEntrega.add(rbCartaRecomendacionEntregaN);
        rbCartaRecomendacionEntregaN.setText("No");

        javax.swing.GroupLayout pCartaRecomendacionEntregaLayout = new javax.swing.GroupLayout(pCartaRecomendacionEntrega);
        pCartaRecomendacionEntrega.setLayout(pCartaRecomendacionEntregaLayout);
        pCartaRecomendacionEntregaLayout.setHorizontalGroup(
            pCartaRecomendacionEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaRecomendacionEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCartaRecomendacionEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCartaRecomendacionEntregaO)
                    .addComponent(rbCartaRecomendacionEntregaC)
                    .addComponent(rbCartaRecomendacionEntregaN))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pCartaRecomendacionEntregaLayout.setVerticalGroup(
            pCartaRecomendacionEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaRecomendacionEntregaLayout.createSequentialGroup()
                .addComponent(rbCartaRecomendacionEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartaRecomendacionEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartaRecomendacionEntregaN))
        );

        pNumeroImssEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Número Imss"));

        bgNumeroImssEntrega.add(rbNumeroImssEntregaO);
        rbNumeroImssEntregaO.setText("Original");

        bgNumeroImssEntrega.add(rbNumeroImssEntregaC);
        rbNumeroImssEntregaC.setText("Copia");

        bgNumeroImssEntrega.add(rbNumeroImssEntregaN);
        rbNumeroImssEntregaN.setText("No");

        javax.swing.GroupLayout pNumeroImssEntregaLayout = new javax.swing.GroupLayout(pNumeroImssEntrega);
        pNumeroImssEntrega.setLayout(pNumeroImssEntregaLayout);
        pNumeroImssEntregaLayout.setHorizontalGroup(
            pNumeroImssEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNumeroImssEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNumeroImssEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNumeroImssEntregaO)
                    .addComponent(rbNumeroImssEntregaC)
                    .addComponent(rbNumeroImssEntregaN))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pNumeroImssEntregaLayout.setVerticalGroup(
            pNumeroImssEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNumeroImssEntregaLayout.createSequentialGroup()
                .addComponent(rbNumeroImssEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNumeroImssEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNumeroImssEntregaN))
        );

        pSocioeconomicoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudio socioeconómico"));

        bgSocioeconomicoEntrega.add(rbSocioeconomicoEntregaO);
        rbSocioeconomicoEntregaO.setText("Original");

        bgSocioeconomicoEntrega.add(rbSocioeconomicoEntregaC);
        rbSocioeconomicoEntregaC.setText("Copia");

        bgSocioeconomicoEntrega.add(rbSocioeconomicoEntregaN);
        rbSocioeconomicoEntregaN.setText("No");

        javax.swing.GroupLayout pSocioeconomicoEntregaLayout = new javax.swing.GroupLayout(pSocioeconomicoEntrega);
        pSocioeconomicoEntrega.setLayout(pSocioeconomicoEntregaLayout);
        pSocioeconomicoEntregaLayout.setHorizontalGroup(
            pSocioeconomicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSocioeconomicoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSocioeconomicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSocioeconomicoEntregaN)
                    .addGroup(pSocioeconomicoEntregaLayout.createSequentialGroup()
                        .addGroup(pSocioeconomicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSocioeconomicoEntregaO)
                            .addComponent(rbSocioeconomicoEntregaC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpSocioeconomicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSocioeconomicoEntregaLayout.setVerticalGroup(
            pSocioeconomicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSocioeconomicoEntregaLayout.createSequentialGroup()
                .addGroup(pSocioeconomicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSocioeconomicoEntregaLayout.createSequentialGroup()
                        .addComponent(rbSocioeconomicoEntregaO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSocioeconomicoEntregaC))
                    .addGroup(pSocioeconomicoEntregaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dpSocioeconomicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSocioeconomicoEntregaN))
        );

        pSocioeconomicoEntrega2.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto estudio socioeconómico"));

        bgFotoSocioeconomicoEntrega.add(rbSocioeconomicoEntrega2O);
        rbSocioeconomicoEntrega2O.setText("Original");

        bgFotoSocioeconomicoEntrega.add(rbSocioeconomicoEntrega2C);
        rbSocioeconomicoEntrega2C.setText("Copia");

        bgFotoSocioeconomicoEntrega.add(rbSocioeconomicoEntrega2N);
        rbSocioeconomicoEntrega2N.setText("No");

        javax.swing.GroupLayout pSocioeconomicoEntrega2Layout = new javax.swing.GroupLayout(pSocioeconomicoEntrega2);
        pSocioeconomicoEntrega2.setLayout(pSocioeconomicoEntrega2Layout);
        pSocioeconomicoEntrega2Layout.setHorizontalGroup(
            pSocioeconomicoEntrega2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSocioeconomicoEntrega2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSocioeconomicoEntrega2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSocioeconomicoEntrega2O)
                    .addComponent(rbSocioeconomicoEntrega2C)
                    .addComponent(rbSocioeconomicoEntrega2N))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pSocioeconomicoEntrega2Layout.setVerticalGroup(
            pSocioeconomicoEntrega2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSocioeconomicoEntrega2Layout.createSequentialGroup()
                .addComponent(rbSocioeconomicoEntrega2O)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSocioeconomicoEntrega2C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSocioeconomicoEntrega2N))
        );

        pPsicologicoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Psicológico"));

        bgPsicologicoEntrega.add(rbPsicologicoEntregaO);
        rbPsicologicoEntregaO.setText("Original");

        bgPsicologicoEntrega.add(rbPsicologicoEntregaC);
        rbPsicologicoEntregaC.setText("Copia");

        bgPsicologicoEntrega.add(rbPsicologicoEntregaN);
        rbPsicologicoEntregaN.setText("No");

        javax.swing.GroupLayout pPsicologicoEntregaLayout = new javax.swing.GroupLayout(pPsicologicoEntrega);
        pPsicologicoEntrega.setLayout(pPsicologicoEntregaLayout);
        pPsicologicoEntregaLayout.setHorizontalGroup(
            pPsicologicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPsicologicoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPsicologicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPsicologicoEntregaO)
                    .addComponent(rbPsicologicoEntregaC)
                    .addComponent(rbPsicologicoEntregaN))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pPsicologicoEntregaLayout.setVerticalGroup(
            pPsicologicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPsicologicoEntregaLayout.createSequentialGroup()
                .addComponent(rbPsicologicoEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPsicologicoEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPsicologicoEntregaN))
        );

        pComprobanteMedicoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante médico"));

        bgComprobanteMedicoEntrega.add(rbComprobanteMedicoEntregaO);
        rbComprobanteMedicoEntregaO.setText("Original");

        bgComprobanteMedicoEntrega.add(rbComprobanteMedicoEntregaC);
        rbComprobanteMedicoEntregaC.setText("Copia");

        bgComprobanteMedicoEntrega.add(rbComprobanteMedicoEntregaN);
        rbComprobanteMedicoEntregaN.setText("No");

        javax.swing.GroupLayout pComprobanteMedicoEntregaLayout = new javax.swing.GroupLayout(pComprobanteMedicoEntrega);
        pComprobanteMedicoEntrega.setLayout(pComprobanteMedicoEntregaLayout);
        pComprobanteMedicoEntregaLayout.setHorizontalGroup(
            pComprobanteMedicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprobanteMedicoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pComprobanteMedicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbComprobanteMedicoEntregaO)
                    .addComponent(rbComprobanteMedicoEntregaC)
                    .addComponent(rbComprobanteMedicoEntregaN))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        pComprobanteMedicoEntregaLayout.setVerticalGroup(
            pComprobanteMedicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprobanteMedicoEntregaLayout.createSequentialGroup()
                .addComponent(rbComprobanteMedicoEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComprobanteMedicoEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComprobanteMedicoEntregaN))
        );

        pToxicologicoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Examen toxicológico"));

        bgToxicologicoEntrega.add(rbToxicologicoEntregaO);
        rbToxicologicoEntregaO.setText("Original");

        bgToxicologicoEntrega.add(rbToxicologicoEntregaC);
        rbToxicologicoEntregaC.setText("Copia");

        bgToxicologicoEntrega.add(rbToxicologicoEntregaN);
        rbToxicologicoEntregaN.setText("No");

        javax.swing.GroupLayout pToxicologicoEntregaLayout = new javax.swing.GroupLayout(pToxicologicoEntrega);
        pToxicologicoEntrega.setLayout(pToxicologicoEntregaLayout);
        pToxicologicoEntregaLayout.setHorizontalGroup(
            pToxicologicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pToxicologicoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pToxicologicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbToxicologicoEntregaO)
                    .addComponent(rbToxicologicoEntregaC)
                    .addComponent(rbToxicologicoEntregaN))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pToxicologicoEntregaLayout.setVerticalGroup(
            pToxicologicoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pToxicologicoEntregaLayout.createSequentialGroup()
                .addComponent(rbToxicologicoEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbToxicologicoEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbToxicologicoEntregaN))
        );

        pCartaResguardoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Carta de resguardo"));

        bgResguardoEntrega.add(rbCartaResguardoEntregaO);
        rbCartaResguardoEntregaO.setText("Original");

        bgResguardoEntrega.add(rbCartaResguardoEntregaC);
        rbCartaResguardoEntregaC.setText("Copia");

        bgResguardoEntrega.add(rbCartaResguardoEntregaN);
        rbCartaResguardoEntregaN.setText("No");

        javax.swing.GroupLayout pCartaResguardoEntregaLayout = new javax.swing.GroupLayout(pCartaResguardoEntrega);
        pCartaResguardoEntrega.setLayout(pCartaResguardoEntregaLayout);
        pCartaResguardoEntregaLayout.setHorizontalGroup(
            pCartaResguardoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaResguardoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCartaResguardoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCartaResguardoEntregaO)
                    .addComponent(rbCartaResguardoEntregaC)
                    .addComponent(rbCartaResguardoEntregaN))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pCartaResguardoEntregaLayout.setVerticalGroup(
            pCartaResguardoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaResguardoEntregaLayout.createSequentialGroup()
                .addComponent(rbCartaResguardoEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartaResguardoEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCartaResguardoEntregaN))
        );

        pMapaDomicilioEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Mapa de domicilio"));

        bgMapaDomicilioEntrega.add(rbMapaDomicilioEntregaO);
        rbMapaDomicilioEntregaO.setText("Original");

        bgMapaDomicilioEntrega.add(rbMapaDomicilioEntregaC);
        rbMapaDomicilioEntregaC.setText("Copia");

        bgMapaDomicilioEntrega.add(rbMapaDomicilioEntregaN);
        rbMapaDomicilioEntregaN.setText("No");

        javax.swing.GroupLayout pMapaDomicilioEntregaLayout = new javax.swing.GroupLayout(pMapaDomicilioEntrega);
        pMapaDomicilioEntrega.setLayout(pMapaDomicilioEntregaLayout);
        pMapaDomicilioEntregaLayout.setHorizontalGroup(
            pMapaDomicilioEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMapaDomicilioEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMapaDomicilioEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMapaDomicilioEntregaO)
                    .addComponent(rbMapaDomicilioEntregaC)
                    .addComponent(rbMapaDomicilioEntregaN))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pMapaDomicilioEntregaLayout.setVerticalGroup(
            pMapaDomicilioEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMapaDomicilioEntregaLayout.createSequentialGroup()
                .addComponent(rbMapaDomicilioEntregaO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMapaDomicilioEntregaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMapaDomicilioEntregaN))
        );

        javax.swing.GroupLayout pDocEntregados2Layout = new javax.swing.GroupLayout(pDocEntregados2);
        pDocEntregados2.setLayout(pDocEntregados2Layout);
        pDocEntregados2Layout.setHorizontalGroup(
            pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocEntregados2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDocEntregados2Layout.createSequentialGroup()
                        .addGroup(pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pSocioeconomicoEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pDocEntregados2Layout.createSequentialGroup()
                                .addComponent(pCartillaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pNumeroImssEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDocEntregados2Layout.createSequentialGroup()
                                .addComponent(pCartaRecomendacionEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pContratoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDocEntregados2Layout.createSequentialGroup()
                                .addComponent(pSocioeconomicoEntrega2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pPsicologicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pDocEntregados2Layout.createSequentialGroup()
                        .addComponent(pToxicologicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pCartaResguardoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pMapaDomicilioEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pComprobanteMedicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        pDocEntregados2Layout.setVerticalGroup(
            pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocEntregados2Layout.createSequentialGroup()
                .addGroup(pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCartillaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pContratoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCartaRecomendacionEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pNumeroImssEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pSocioeconomicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSocioeconomicoEntrega2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPsicologicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDocEntregados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pToxicologicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCartaResguardoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pMapaDomicilioEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pComprobanteMedicoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDocumentos2Layout = new javax.swing.GroupLayout(pDocumentos2);
        pDocumentos2.setLayout(pDocumentos2Layout);
        pDocumentos2Layout.setHorizontalGroup(
            pDocumentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocumentos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDocEntregados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDocumentos2Layout.setVerticalGroup(
            pDocumentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocumentos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDocEntregados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpRegistroElemento.addTab("Documentos 2", pDocumentos2);

        pReferenciaPersonal1.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencia 1"));

        lblNombreReferencia1.setText("Nombre");

        txtNombreReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreReferencia1KeyTyped(evt);
            }
        });

        lblParentescoReferencia1.setText("Parentesco");

        lblOcupacionReferencia1.setText("Ocupación");

        txtOcupacionReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOcupacionReferencia1KeyTyped(evt);
            }
        });

        lblTelefonoReferencia1.setText("Teléfono");

        txtTelefonoReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoReferencia1KeyTyped(evt);
            }
        });

        lblEstadoReferencia1.setText("Estado");

        cbEstadoReferencia1.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadoReferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoReferencia1ActionPerformed(evt);
            }
        });

        lblMunicipioReferencia1.setText("Municipio");

        cbMunicipioReferencia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un Estado" }));

        lblColoniaReferencia1.setText("Colonia");

        txtColoniaReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaReferencia1KeyTyped(evt);
            }
        });

        lblDireccionReferencia1.setText("Dirección");

        txtDireccionReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionReferencia1KeyTyped(evt);
            }
        });

        lblInteriorReferencia1.setText("Interior");

        txtInteriorReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorReferencia1KeyTyped(evt);
            }
        });

        lblExteriorReferencia1.setText("Exterior");

        txtExteriorReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorReferencia1KeyTyped(evt);
            }
        });

        lblConocerloReferencia1.setText("Tiempo de conocerlo");

        txtConocerloReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConocerloReferencia1KeyTyped(evt);
            }
        });

        lblYearsReferencia1.setText("años");

        javax.swing.GroupLayout pReferenciaPersonal1Layout = new javax.swing.GroupLayout(pReferenciaPersonal1);
        pReferenciaPersonal1.setLayout(pReferenciaPersonal1Layout);
        pReferenciaPersonal1Layout.setHorizontalGroup(
            pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                        .addGroup(pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                                .addComponent(lblDireccionReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblInteriorReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteriorReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblExteriorReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExteriorReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblColoniaReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColoniaReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                                .addComponent(lblEstadoReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMunicipioReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMunicipioReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                                .addComponent(lblOcupacionReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOcupacionReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelefonoReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblConocerloReferencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConocerloReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblYearsReferencia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                        .addComponent(lblNombreReferencia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblParentescoReferencia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParentescoReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        pReferenciaPersonal1Layout.setVerticalGroup(
            pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreReferencia1)
                    .addComponent(txtNombreReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParentescoReferencia1)
                    .addComponent(txtParentescoReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacionReferencia1)
                    .addComponent(txtOcupacionReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoReferencia1)
                    .addComponent(txtTelefonoReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConocerloReferencia1)
                    .addComponent(txtConocerloReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearsReferencia1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionReferencia1)
                    .addComponent(txtDireccionReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorReferencia1)
                    .addComponent(txtInteriorReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorReferencia1)
                    .addComponent(txtExteriorReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColoniaReferencia1)
                    .addComponent(txtColoniaReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoReferencia1)
                    .addComponent(cbEstadoReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioReferencia1)
                    .addComponent(cbMunicipioReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pReferenciaPersonal2.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencia 2"));

        lblNombreReferencia2.setText("Nombre");

        lblParentescoReferencia2.setText("Parentesco");

        lblOcupacionReferencia2.setText("Ocupación");

        txtOcupacionReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOcupacionReferencia2KeyTyped(evt);
            }
        });

        lblTelefonoReferencia2.setText("Teléfono");

        txtTelefonoReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoReferencia2KeyTyped(evt);
            }
        });

        lblEstadoReferencia2.setText("Estado");

        cbEstadoReferencia2.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadoReferencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoReferencia2ActionPerformed(evt);
            }
        });

        lblMunicipioReferencia2.setText("Municipio");

        cbMunicipioReferencia2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un Estado" }));

        lblColoniaReferencia2.setText("Colonia");

        txtColoniaReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaReferencia2KeyTyped(evt);
            }
        });

        lblDireccionReferencia2.setText("Dirección");

        txtDireccionReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionReferencia2KeyTyped(evt);
            }
        });

        lblInteriorReferencia2.setText("Interior");

        txtInteriorReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorReferencia2KeyTyped(evt);
            }
        });

        lblExteriorReferencia2.setText("Exterior");

        txtExteriorReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorReferencia2KeyTyped(evt);
            }
        });

        lblConocerloReferencia2.setText("Tiempo de conocerlo");

        txtConocerloReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConocerloReferencia2KeyTyped(evt);
            }
        });

        lblYearsReferencia2.setText("años");

        txtNombreReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreReferencia2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pReferenciaPersonal2Layout = new javax.swing.GroupLayout(pReferenciaPersonal2);
        pReferenciaPersonal2.setLayout(pReferenciaPersonal2Layout);
        pReferenciaPersonal2Layout.setHorizontalGroup(
            pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                        .addGroup(pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                                .addComponent(lblDireccionReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblInteriorReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteriorReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblExteriorReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExteriorReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblColoniaReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColoniaReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                                .addComponent(lblEstadoReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMunicipioReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMunicipioReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                                .addComponent(lblOcupacionReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOcupacionReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelefonoReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblConocerloReferencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConocerloReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblYearsReferencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                        .addComponent(lblNombreReferencia2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblParentescoReferencia2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParentescoReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        pReferenciaPersonal2Layout.setVerticalGroup(
            pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreReferencia2)
                    .addComponent(lblParentescoReferencia2)
                    .addComponent(txtParentescoReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacionReferencia2)
                    .addComponent(txtOcupacionReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoReferencia2)
                    .addComponent(txtTelefonoReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConocerloReferencia2)
                    .addComponent(txtConocerloReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearsReferencia2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionReferencia2)
                    .addComponent(txtDireccionReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorReferencia2)
                    .addComponent(txtInteriorReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorReferencia2)
                    .addComponent(txtExteriorReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColoniaReferencia2)
                    .addComponent(txtColoniaReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoReferencia2)
                    .addComponent(cbEstadoReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioReferencia2)
                    .addComponent(cbMunicipioReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pReferenciasPersonalesLayout = new javax.swing.GroupLayout(pReferenciasPersonales);
        pReferenciasPersonales.setLayout(pReferenciasPersonalesLayout);
        pReferenciasPersonalesLayout.setHorizontalGroup(
            pReferenciasPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciasPersonalesLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pReferenciasPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pReferenciaPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pReferenciaPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pReferenciasPersonalesLayout.setVerticalGroup(
            pReferenciasPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciasPersonalesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pReferenciaPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pReferenciaPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Referencias Personales", pReferenciasPersonales);

        pReferenciaPersonal3.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencia 3"));

        lblNombreReferencia3.setText("Nombre");

        txtNombreReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreReferencia3KeyTyped(evt);
            }
        });

        lblParentescoReferencia3.setText("Parentesco");

        lblOcupacionReferencia3.setText("Ocupación");

        txtOcupacionReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOcupacionReferencia3KeyTyped(evt);
            }
        });

        lblTelefonoReferencia3.setText("Teléfono");

        txtTelefonoReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoReferencia3KeyTyped(evt);
            }
        });

        lblEstadoReferencia3.setText("Estado");

        cbEstadoReferencia3.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadoReferencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoReferencia3ActionPerformed(evt);
            }
        });

        lblMunicipioReferencia3.setText("Municipio");

        cbMunicipioReferencia3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un Estado" }));

        lblColoniaReferencia3.setText("Colonia");

        txtColoniaReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaReferencia3KeyTyped(evt);
            }
        });

        lblDireccionReferencia3.setText("Dirección");

        txtDireccionReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionReferencia3KeyTyped(evt);
            }
        });

        lblInteriorReferencia3.setText("Interior");

        txtInteriorReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorReferencia3KeyTyped(evt);
            }
        });

        lblExteriorReferencia3.setText("Exterior");

        txtExteriorReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorReferencia3KeyTyped(evt);
            }
        });

        lblConocerloReferencia3.setText("Tiempo de conocerlo");

        txtConocerloReferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConocerloReferencia3KeyTyped(evt);
            }
        });

        lblYearsReferencia3.setText("años");

        javax.swing.GroupLayout pReferenciaPersonal3Layout = new javax.swing.GroupLayout(pReferenciaPersonal3);
        pReferenciaPersonal3.setLayout(pReferenciaPersonal3Layout);
        pReferenciaPersonal3Layout.setHorizontalGroup(
            pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                        .addGroup(pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                                .addComponent(lblDireccionReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblInteriorReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteriorReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblExteriorReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExteriorReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblColoniaReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColoniaReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                                .addComponent(lblEstadoReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMunicipioReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMunicipioReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                                .addComponent(lblOcupacionReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOcupacionReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelefonoReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblConocerloReferencia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConocerloReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblYearsReferencia3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                        .addComponent(lblNombreReferencia3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblParentescoReferencia3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParentescoReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        pReferenciaPersonal3Layout.setVerticalGroup(
            pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreReferencia3)
                    .addComponent(txtNombreReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParentescoReferencia3)
                    .addComponent(txtParentescoReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacionReferencia3)
                    .addComponent(txtOcupacionReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoReferencia3)
                    .addComponent(txtTelefonoReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConocerloReferencia3)
                    .addComponent(txtConocerloReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearsReferencia3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionReferencia3)
                    .addComponent(txtDireccionReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorReferencia3)
                    .addComponent(txtInteriorReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorReferencia3)
                    .addComponent(txtExteriorReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColoniaReferencia3)
                    .addComponent(txtColoniaReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoReferencia3)
                    .addComponent(cbEstadoReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioReferencia3)
                    .addComponent(cbMunicipioReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pReferenciaPersonal4.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencia 4"));

        lblNombreReferencia4.setText("Nombre");

        txtNombreReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreReferencia4KeyTyped(evt);
            }
        });

        lblParentescoReferencia4.setText("Parentesco");

        lblOcupacionReferencia4.setText("Ocupación");

        txtOcupacionReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOcupacionReferencia4KeyTyped(evt);
            }
        });

        lblTelefonoReferencia4.setText("Teléfono");

        txtTelefonoReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoReferencia4KeyTyped(evt);
            }
        });

        lblEstadoReferencia4.setText("Estado");

        cbEstadoReferencia4.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadoReferencia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoReferencia4ActionPerformed(evt);
            }
        });

        lblMunicipioReferencia4.setText("Municipio");

        cbMunicipioReferencia4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un Estado" }));

        lblColoniaReferencia4.setText("Colonia");

        txtColoniaReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaReferencia4KeyTyped(evt);
            }
        });

        lblDireccionReferencia4.setText("Dirección");

        txtDireccionReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionReferencia4KeyTyped(evt);
            }
        });

        lblInteriorReferencia4.setText("Interior");

        txtInteriorReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorReferencia4KeyTyped(evt);
            }
        });

        lblExteriorReferencia4.setText("Exterior");

        txtExteriorReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorReferencia4KeyTyped(evt);
            }
        });

        lblConocerloReferencia4.setText("Tiempo de conocerlo");

        txtConocerloReferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConocerloReferencia4KeyTyped(evt);
            }
        });

        lblYearsReferencia4.setText("años");

        javax.swing.GroupLayout pReferenciaPersonal4Layout = new javax.swing.GroupLayout(pReferenciaPersonal4);
        pReferenciaPersonal4.setLayout(pReferenciaPersonal4Layout);
        pReferenciaPersonal4Layout.setHorizontalGroup(
            pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                        .addGroup(pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                                .addComponent(lblDireccionReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblInteriorReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteriorReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblExteriorReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExteriorReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblColoniaReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColoniaReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                                .addComponent(lblEstadoReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMunicipioReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMunicipioReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                                .addComponent(lblOcupacionReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOcupacionReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelefonoReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblConocerloReferencia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConocerloReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblYearsReferencia4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                        .addComponent(lblNombreReferencia4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblParentescoReferencia4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParentescoReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        pReferenciaPersonal4Layout.setVerticalGroup(
            pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciaPersonal4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreReferencia4)
                    .addComponent(txtNombreReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParentescoReferencia4)
                    .addComponent(txtParentescoReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacionReferencia4)
                    .addComponent(txtOcupacionReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoReferencia4)
                    .addComponent(txtTelefonoReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConocerloReferencia4)
                    .addComponent(txtConocerloReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearsReferencia4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionReferencia4)
                    .addComponent(txtDireccionReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorReferencia4)
                    .addComponent(txtInteriorReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorReferencia4)
                    .addComponent(txtExteriorReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColoniaReferencia4)
                    .addComponent(txtColoniaReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pReferenciaPersonal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoReferencia4)
                    .addComponent(cbEstadoReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioReferencia4)
                    .addComponent(cbMunicipioReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pReferenciasLaboralesLayout = new javax.swing.GroupLayout(pReferenciasLaborales);
        pReferenciasLaborales.setLayout(pReferenciasLaboralesLayout);
        pReferenciasLaboralesLayout.setHorizontalGroup(
            pReferenciasLaboralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciasLaboralesLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(pReferenciasLaboralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pReferenciaPersonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pReferenciaPersonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pReferenciasLaboralesLayout.setVerticalGroup(
            pReferenciasLaboralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciasLaboralesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pReferenciaPersonal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pReferenciaPersonal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Referencias Laborales", pReferenciasLaborales);

        pTrabajoAnterior1.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajo Anterior"));

        lblDependenciaEA1.setText("Dependencia");

        lblCorporacionEA1.setText("Corporación");

        lblDireccionEA1.setText("Dirección");

        lblInteriorEA1.setText("Interior");

        txtInteriorEA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorEA1KeyTyped(evt);
            }
        });

        lblExteriorEA1.setText("Exterior");

        txtExteriorEA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorEA1KeyTyped(evt);
            }
        });

        lblColoniaEA1.setText("Colonia");

        lblCodigoEA1.setText("Código Postal");

        lblTelefonosEA1.setText("Teléfonos");

        lblEstadoEA1.setText("Estado");

        cbEstadosEA1.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadosEA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadosEA1ActionPerformed(evt);
            }
        });

        lblMunicipioEA1.setText("Municipio");

        cbMunicipiosEA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige un Estado" }));

        lblIngresoEA1.setText("Fecha de ingreso");

        lblSalidaEA1.setText("Fecha de salida");

        lblPuestoEA1.setText("Puesto");

        lblFuncionesEA1.setText("Funciones");

        lblEspecialidadEA1.setText("Especialidad");

        lblRangoCategoriaEA1.setText("Rango o Categoría");

        lblSueldoEA1.setText("Sueldo base");

        lblPlacaEA1.setText("Número de placa");

        lblAreaEA1.setText("Aréa");

        lblDivisionEA1.setText("División");

        lblJefeEA1.setText("Jefe inmediato");

        lblCuipEA1.setText("CUIP Jefe");

        lblMotivoEA1.setText("Motivo de salida");

        taMotivoEA1.setColumns(20);
        taMotivoEA1.setRows(5);
        jScrollPane1.setViewportView(taMotivoEA1);

        javax.swing.GroupLayout pTrabajoAnterior1Layout = new javax.swing.GroupLayout(pTrabajoAnterior1);
        pTrabajoAnterior1.setLayout(pTrabajoAnterior1Layout);
        pTrabajoAnterior1Layout.setHorizontalGroup(
            pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                            .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblDependenciaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDependenciaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblDireccionEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDireccionEA1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblCorporacionEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCorporacionEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblInteriorEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtInteriorEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblExteriorEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtExteriorEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                            .addComponent(lblIngresoEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpIngresoEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSalidaEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpSalidaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrabajoAnterior1Layout.createSequentialGroup()
                            .addComponent(lblPuestoEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPuestoEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblFuncionesEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFuncionesEA1))
                        .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                            .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblEstadoEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbEstadosEA1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblColoniaEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtColoniaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblCodigoEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigoPostalEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblTelefonosEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefonosEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                                    .addComponent(lblMunicipioEA1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMunicipiosEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                            .addComponent(lblEspecialidadEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEspecialidadEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblRangoCategoriaEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRangoCategoriaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSueldoEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSueldoEA1))
                        .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                            .addComponent(lblPlacaEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPlacaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblAreaEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAreaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblDivisionEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDivisionEA1)))
                    .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior1Layout.createSequentialGroup()
                            .addComponent(lblMotivoEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior1Layout.createSequentialGroup()
                            .addComponent(lblJefeEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtJefeEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCuipEA1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCuipEA1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pTrabajoAnterior1Layout.setVerticalGroup(
            pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrabajoAnterior1Layout.createSequentialGroup()
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDependenciaEA1)
                    .addComponent(txtDependenciaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorporacionEA1)
                    .addComponent(txtCorporacionEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionEA1)
                    .addComponent(txtDireccionEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorEA1)
                    .addComponent(txtInteriorEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorEA1)
                    .addComponent(txtExteriorEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColoniaEA1)
                    .addComponent(txtColoniaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoEA1)
                    .addComponent(txtCodigoPostalEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonosEA1)
                    .addComponent(txtTelefonosEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEA1)
                    .addComponent(cbEstadosEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioEA1)
                    .addComponent(cbMunicipiosEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresoEA1)
                    .addComponent(dpIngresoEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalidaEA1)
                    .addComponent(dpSalidaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuestoEA1)
                    .addComponent(txtPuestoEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionesEA1)
                    .addComponent(txtFuncionesEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidadEA1)
                    .addComponent(txtEspecialidadEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRangoCategoriaEA1)
                    .addComponent(txtRangoCategoriaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSueldoEA1)
                    .addComponent(txtSueldoEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlacaEA1)
                    .addComponent(txtPlacaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaEA1)
                    .addComponent(txtAreaEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDivisionEA1)
                    .addComponent(txtDivisionEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJefeEA1)
                    .addComponent(txtJefeEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuipEA1)
                    .addComponent(txtCuipEA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotivoEA1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pExperienciaLaboral1Layout = new javax.swing.GroupLayout(pExperienciaLaboral1);
        pExperienciaLaboral1.setLayout(pExperienciaLaboral1Layout);
        pExperienciaLaboral1Layout.setHorizontalGroup(
            pExperienciaLaboral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExperienciaLaboral1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(pTrabajoAnterior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        pExperienciaLaboral1Layout.setVerticalGroup(
            pExperienciaLaboral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExperienciaLaboral1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pTrabajoAnterior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Experiencia Laboral 1", pExperienciaLaboral1);

        pTrabajoAnterior2.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajo Anterior"));

        lblDependenciaEA2.setText("Dependencia");

        lblCorporacionEA2.setText("Corporación");

        lblDireccionEA2.setText("Dirección");

        lblInteriorEA2.setText("Interior");

        txtInteriorEA2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorEA2KeyTyped(evt);
            }
        });

        lblExteriorEA2.setText("Exterior");

        txtExteriorEA2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorEA2KeyTyped(evt);
            }
        });

        lblColoniaEA2.setText("Colonia");

        lblCodigoEA2.setText("Código Postal");

        lblTelefonosEA2.setText("Teléfonos");

        lblEstadoEA2.setText("Estado");

        cbEstadosEA2.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadosEA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadosEA2ActionPerformed(evt);
            }
        });

        lblMunicipioEA2.setText("Municipio");

        cbMunicipiosEA2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige un Estado" }));

        lblIngresoEA2.setText("Fecha de ingreso");

        lblSalidaEA2.setText("Fecha de salida");

        lblPuestoEA2.setText("Puesto");

        lblFuncionesEA2.setText("Funciones");

        lblEspecialidadEA2.setText("Especialidad");

        lblRangoCategoriaEA2.setText("Rango o Categoría");

        lblSueldoEA2.setText("Sueldo base");

        lblPlacaEA2.setText("Número de placa");

        lblAreaEA2.setText("Aréa");

        lblDivisionEA2.setText("División");

        lblJefeEA2.setText("Jefe inmediato");

        lblCuipEA2.setText("CUIP Jefe");

        lblMotivoEA2.setText("Motivo de salida");

        taMotivoEA2.setColumns(20);
        taMotivoEA2.setRows(5);
        jScrollPane2.setViewportView(taMotivoEA2);

        javax.swing.GroupLayout pTrabajoAnterior2Layout = new javax.swing.GroupLayout(pTrabajoAnterior2);
        pTrabajoAnterior2.setLayout(pTrabajoAnterior2Layout);
        pTrabajoAnterior2Layout.setHorizontalGroup(
            pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                            .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblDependenciaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDependenciaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblDireccionEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDireccionEA2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblCorporacionEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCorporacionEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblInteriorEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtInteriorEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblExteriorEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtExteriorEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                            .addComponent(lblIngresoEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpIngresoEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSalidaEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpSalidaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrabajoAnterior2Layout.createSequentialGroup()
                            .addComponent(lblPuestoEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPuestoEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblFuncionesEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFuncionesEA2))
                        .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                            .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblEstadoEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbEstadosEA2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblColoniaEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtColoniaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblCodigoEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigoPostalEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblTelefonosEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefonosEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                                    .addComponent(lblMunicipioEA2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMunicipiosEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                            .addComponent(lblEspecialidadEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEspecialidadEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblRangoCategoriaEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRangoCategoriaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSueldoEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSueldoEA2))
                        .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                            .addComponent(lblPlacaEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPlacaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblAreaEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAreaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblDivisionEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDivisionEA2)))
                    .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior2Layout.createSequentialGroup()
                            .addComponent(lblMotivoEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior2Layout.createSequentialGroup()
                            .addComponent(lblJefeEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtJefeEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCuipEA2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCuipEA2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pTrabajoAnterior2Layout.setVerticalGroup(
            pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrabajoAnterior2Layout.createSequentialGroup()
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDependenciaEA2)
                    .addComponent(txtDependenciaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorporacionEA2)
                    .addComponent(txtCorporacionEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionEA2)
                    .addComponent(txtDireccionEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorEA2)
                    .addComponent(txtInteriorEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorEA2)
                    .addComponent(txtExteriorEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColoniaEA2)
                    .addComponent(txtColoniaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoEA2)
                    .addComponent(txtCodigoPostalEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonosEA2)
                    .addComponent(txtTelefonosEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEA2)
                    .addComponent(cbEstadosEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioEA2)
                    .addComponent(cbMunicipiosEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresoEA2)
                    .addComponent(dpIngresoEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalidaEA2)
                    .addComponent(dpSalidaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuestoEA2)
                    .addComponent(txtPuestoEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionesEA2)
                    .addComponent(txtFuncionesEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidadEA2)
                    .addComponent(txtEspecialidadEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRangoCategoriaEA2)
                    .addComponent(txtRangoCategoriaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSueldoEA2)
                    .addComponent(txtSueldoEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlacaEA2)
                    .addComponent(txtPlacaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaEA2)
                    .addComponent(txtAreaEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDivisionEA2)
                    .addComponent(txtDivisionEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJefeEA2)
                    .addComponent(txtJefeEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuipEA2)
                    .addComponent(txtCuipEA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotivoEA2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pExperienciaLaboral2Layout = new javax.swing.GroupLayout(pExperienciaLaboral2);
        pExperienciaLaboral2.setLayout(pExperienciaLaboral2Layout);
        pExperienciaLaboral2Layout.setHorizontalGroup(
            pExperienciaLaboral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExperienciaLaboral2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(pTrabajoAnterior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        pExperienciaLaboral2Layout.setVerticalGroup(
            pExperienciaLaboral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExperienciaLaboral2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pTrabajoAnterior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Experiencia Laboral 2", pExperienciaLaboral2);

        pTrabajoAnterior3.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajo Anterior"));

        lblDependenciaEA3.setText("Dependencia");

        lblCorporacionEA3.setText("Corporación");

        lblDireccionEA3.setText("Dirección");

        lblInteriorEA3.setText("Interior");

        txtInteriorEA3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteriorEA3KeyTyped(evt);
            }
        });

        lblExteriorEA3.setText("Exterior");

        txtExteriorEA3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExteriorEA3KeyTyped(evt);
            }
        });

        lblColoniaEA3.setText("Colonia");

        lblCodigoEA3.setText("Código Postal");

        lblTelefonosEA3.setText("Teléfonos");

        lblEstadoEA3.setText("Estado");

        cbEstadosEA3.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstadosEA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadosEA3ActionPerformed(evt);
            }
        });

        lblMunicipioEA3.setText("Municipio");

        cbMunicipiosEA3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige un Estado" }));

        lblIngresoEA3.setText("Fecha de ingreso");

        lblSalidaEA3.setText("Fecha de salida");

        lblPuestoEA3.setText("Puesto");

        lblFuncionesEA3.setText("Funciones");

        lblEspecialidadEA3.setText("Especialidad");

        lblRangoCategoriaEA3.setText("Rango o Categoría");

        lblSueldoEA3.setText("Sueldo base");

        lblPlacaEA3.setText("Número de placa");

        lblAreaEA3.setText("Aréa");

        lblDivisionEA3.setText("División");

        lblJefeEA3.setText("Jefe inmediato");

        lblCuipEA3.setText("CUIP Jefe");

        lblMotivoEA3.setText("Motivo de salida");

        taMotivoEA3.setColumns(20);
        taMotivoEA3.setRows(5);
        jScrollPane3.setViewportView(taMotivoEA3);

        javax.swing.GroupLayout pTrabajoAnterior3Layout = new javax.swing.GroupLayout(pTrabajoAnterior3);
        pTrabajoAnterior3.setLayout(pTrabajoAnterior3Layout);
        pTrabajoAnterior3Layout.setHorizontalGroup(
            pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                            .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblDependenciaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDependenciaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblDireccionEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDireccionEA3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblCorporacionEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCorporacionEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblInteriorEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtInteriorEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblExteriorEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtExteriorEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                            .addComponent(lblIngresoEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpIngresoEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSalidaEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpSalidaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrabajoAnterior3Layout.createSequentialGroup()
                            .addComponent(lblPuestoEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPuestoEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblFuncionesEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFuncionesEA3))
                        .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                            .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblEstadoEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbEstadosEA3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblColoniaEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtColoniaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblCodigoEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigoPostalEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblTelefonosEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefonosEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                                    .addComponent(lblMunicipioEA3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMunicipiosEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                            .addComponent(lblEspecialidadEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEspecialidadEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblRangoCategoriaEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRangoCategoriaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSueldoEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSueldoEA3))
                        .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                            .addComponent(lblPlacaEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPlacaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblAreaEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAreaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblDivisionEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDivisionEA3)))
                    .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior3Layout.createSequentialGroup()
                            .addComponent(lblMotivoEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTrabajoAnterior3Layout.createSequentialGroup()
                            .addComponent(lblJefeEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtJefeEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCuipEA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCuipEA3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pTrabajoAnterior3Layout.setVerticalGroup(
            pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrabajoAnterior3Layout.createSequentialGroup()
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDependenciaEA3)
                    .addComponent(txtDependenciaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorporacionEA3)
                    .addComponent(txtCorporacionEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionEA3)
                    .addComponent(txtDireccionEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInteriorEA3)
                    .addComponent(txtInteriorEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExteriorEA3)
                    .addComponent(txtExteriorEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColoniaEA3)
                    .addComponent(txtColoniaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoEA3)
                    .addComponent(txtCodigoPostalEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonosEA3)
                    .addComponent(txtTelefonosEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEA3)
                    .addComponent(cbEstadosEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipioEA3)
                    .addComponent(cbMunicipiosEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresoEA3)
                    .addComponent(dpIngresoEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalidaEA3)
                    .addComponent(dpSalidaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuestoEA3)
                    .addComponent(txtPuestoEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionesEA3)
                    .addComponent(txtFuncionesEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidadEA3)
                    .addComponent(txtEspecialidadEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRangoCategoriaEA3)
                    .addComponent(txtRangoCategoriaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSueldoEA3)
                    .addComponent(txtSueldoEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlacaEA3)
                    .addComponent(txtPlacaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaEA3)
                    .addComponent(txtAreaEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDivisionEA3)
                    .addComponent(txtDivisionEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJefeEA3)
                    .addComponent(txtJefeEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuipEA3)
                    .addComponent(txtCuipEA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrabajoAnterior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotivoEA3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pExperienciaLaboral3Layout = new javax.swing.GroupLayout(pExperienciaLaboral3);
        pExperienciaLaboral3.setLayout(pExperienciaLaboral3Layout);
        pExperienciaLaboral3Layout.setHorizontalGroup(
            pExperienciaLaboral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExperienciaLaboral3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(pTrabajoAnterior3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pExperienciaLaboral3Layout.setVerticalGroup(
            pExperienciaLaboral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExperienciaLaboral3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pTrabajoAnterior3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Experiencia Laboral 3", pExperienciaLaboral3);

        lblInstitucionEmpresa.setText("Institución o Empresa:");

        lblEstudioCurso.setText("Estudio ó curso:");

        lblTipoCurso.setText("Tipo de curso:");

        lblCursoImpartidoRecibido.setText("Curso:");

        bgCurso.add(rbCursoRecibido);
        rbCursoRecibido.setText("Recibido");

        bgCurso.add(rbCursoImpartido);
        rbCursoImpartido.setText("Impartido");

        lblCursoStatus.setText("Status:");

        bgCursoStatus.add(rbCursoInconcluso);
        rbCursoInconcluso.setText("Inconcluso");

        bgCursoStatus.add(rbCursoConcluido);
        rbCursoConcluido.setText("Concluido");

        bgCursoStatus.add(rbCursoEncurso);
        rbCursoEncurso.setText("En curso");

        bgCursoStatus.add(rbCursoSolicitud);
        rbCursoSolicitud.setText("Solicitud");

        lblCursoDuración.setText("Duración en horas:");

        lblCursoInicio.setText("Inicio:");

        lblCursoFin.setText("Fin:");

        btnCursoAceptar.setText("Aceptar");
        btnCursoAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursoAceptarActionPerformed(evt);
            }
        });

        tCursosTomados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso"
            }
        ));
        tCursosTomados.setEnabled(false);
        jScrollPane4.setViewportView(tCursosTomados);

        javax.swing.GroupLayout PCursosTotalesLayout = new javax.swing.GroupLayout(PCursosTotales);
        PCursosTotales.setLayout(PCursosTotalesLayout);
        PCursosTotalesLayout.setHorizontalGroup(
            PCursosTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        PCursosTotalesLayout.setVerticalGroup(
            PCursosTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pCursosLayout = new javax.swing.GroupLayout(pCursos);
        pCursos.setLayout(pCursosLayout);
        pCursosLayout.setHorizontalGroup(
            pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCursosLayout.createSequentialGroup()
                .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCursosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstitucionEmpresa)
                            .addComponent(lblEstudioCurso)
                            .addComponent(lblTipoCurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpresaNombre)
                            .addComponent(txtEstudioCurso)
                            .addComponent(txtTipoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCursosLayout.createSequentialGroup()
                                .addComponent(lblCursoStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCursoInconcluso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCursoConcluido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCursoEncurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCursoSolicitud))
                            .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pCursosLayout.createSequentialGroup()
                                    .addComponent(lblCursoInicio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dpCursoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblCursoFin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dpCursoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCursoAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pCursosLayout.createSequentialGroup()
                                    .addComponent(lblCursoImpartidoRecibido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbCursoRecibido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbCursoImpartido)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCursoDuración)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCursoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pCursosLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(PCursosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pCursosLayout.setVerticalGroup(
            pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionEmpresa)
                    .addComponent(txtEmpresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCursoImpartidoRecibido)
                    .addComponent(rbCursoRecibido)
                    .addComponent(rbCursoImpartido)
                    .addComponent(lblCursoDuración)
                    .addComponent(txtCursoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudioCurso)
                    .addComponent(txtEstudioCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCursoStatus)
                    .addComponent(rbCursoInconcluso)
                    .addComponent(rbCursoConcluido)
                    .addComponent(rbCursoEncurso)
                    .addComponent(rbCursoSolicitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCurso)
                    .addComponent(txtTipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCursoInicio)
                    .addComponent(dpCursoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCursoFin)
                    .addComponent(dpCursoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCursoAceptar))
                .addGap(54, 54, 54)
                .addComponent(PCursosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Cursos", pCursos);

        pBuscaFotos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFotoFrente.setText("Foto de frente:");

        txtFotoFrente.setEditable(false);

        btnFotoFrente.setText("Buscar");
        btnFotoFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoFrenteActionPerformed(evt);
            }
        });

        lblFotoPerfilIzquierdo.setText("Foto de perfil Izquierdo:");

        txtFotoPerfilIzquierdo.setEditable(false);

        btnFotoPerfilIzquierdo.setText("Buscar");
        btnFotoPerfilIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoPerfilIzquierdoActionPerformed(evt);
            }
        });

        lblFotoPerfilDerecho.setText("Foto Perfil Derecho:");

        txtFotoPerfilDerecho.setEditable(false);

        btnFotoPerfilDerecho.setText("Buscar");
        btnFotoPerfilDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoPerfilDerechoActionPerformed(evt);
            }
        });

        btnFotoSocioeconomico1.setText("Buscar");
        btnFotoSocioeconomico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoSocioeconomico1ActionPerformed(evt);
            }
        });

        btnFotoSocioeconomico2.setText("Buscar");
        btnFotoSocioeconomico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoSocioeconomico2ActionPerformed(evt);
            }
        });

        txtFotoSocioeconomico2.setEditable(false);

        txtFotoSocioeconomico1.setEditable(false);

        lblFotoSocioeconomico1.setText("Foto estudio socioeconómico 1:");

        lblFotoSocioeconomico2.setText("Foto estudio socioeconómico 2:");

        javax.swing.GroupLayout pBuscaFotosLayout = new javax.swing.GroupLayout(pBuscaFotos);
        pBuscaFotos.setLayout(pBuscaFotosLayout);
        pBuscaFotosLayout.setHorizontalGroup(
            pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscaFotosLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoSocioeconomico1)
                    .addComponent(lblFotoSocioeconomico2)
                    .addComponent(lblFotoPerfilDerecho)
                    .addComponent(lblFotoPerfilIzquierdo)
                    .addComponent(lblFotoFrente))
                .addGap(4, 4, 4)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBuscaFotosLayout.createSequentialGroup()
                        .addComponent(txtFotoSocioeconomico1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFotoSocioeconomico1))
                    .addGroup(pBuscaFotosLayout.createSequentialGroup()
                        .addComponent(txtFotoSocioeconomico2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFotoSocioeconomico2))
                    .addGroup(pBuscaFotosLayout.createSequentialGroup()
                        .addComponent(txtFotoPerfilDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFotoPerfilDerecho))
                    .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscaFotosLayout.createSequentialGroup()
                            .addComponent(txtFotoPerfilIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFotoPerfilIzquierdo))
                        .addGroup(pBuscaFotosLayout.createSequentialGroup()
                            .addComponent(txtFotoFrente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFotoFrente))))
                .addGap(63, 63, 63))
        );
        pBuscaFotosLayout.setVerticalGroup(
            pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscaFotosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFotoFrente)
                    .addComponent(txtFotoFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFotoFrente))
                .addGap(18, 18, 18)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFotoPerfilIzquierdo)
                    .addComponent(txtFotoPerfilIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFotoPerfilIzquierdo))
                .addGap(18, 18, 18)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFotoPerfilDerecho)
                    .addComponent(txtFotoPerfilDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFotoPerfilDerecho))
                .addGap(18, 18, 18)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFotoSocioeconomico1)
                    .addComponent(txtFotoSocioeconomico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFotoSocioeconomico1))
                .addGap(18, 18, 18)
                .addGroup(pBuscaFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFotoSocioeconomico2)
                    .addComponent(txtFotoSocioeconomico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFotoSocioeconomico2))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pFotosLayout = new javax.swing.GroupLayout(pFotos);
        pFotos.setLayout(pFotosLayout);
        pFotosLayout.setHorizontalGroup(
            pFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFotosLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(pBuscaFotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        pFotosLayout.setVerticalGroup(
            pFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFotosLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(pBuscaFotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Fotos", pFotos);

        pRegistroElemento.add(tpRegistroElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 570));

        btnRegistrar.setText("Registrar Elemento");
        pRegistroElemento.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 210, -1));

        spRegistroElemento.setViewportView(pRegistroElemento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spRegistroElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spRegistroElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtConocerloReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConocerloReferencia4KeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConocerloReferencia4KeyTyped

    private void txtExteriorReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtExteriorReferencia4KeyTyped

    private void txtInteriorReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtInteriorReferencia4KeyTyped

    private void txtDireccionReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtDireccionReferencia4KeyTyped

    private void txtColoniaReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtColoniaReferencia4KeyTyped

    private void cbEstadoReferencia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoReferencia4ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipioReferencia4.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadoReferencia4ActionPerformed

    private void txtTelefonoReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoReferencia4KeyTyped

    private void txtOcupacionReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtOcupacionReferencia4KeyTyped

    private void txtNombreReferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreReferencia4KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtNombreReferencia4KeyTyped

    private void txtConocerloReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConocerloReferencia3KeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConocerloReferencia3KeyTyped

    private void txtExteriorReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtExteriorReferencia3KeyTyped

    private void txtInteriorReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtInteriorReferencia3KeyTyped

    private void txtDireccionReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtDireccionReferencia3KeyTyped

    private void txtColoniaReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtColoniaReferencia3KeyTyped

    private void cbEstadoReferencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoReferencia3ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipioReferencia3.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadoReferencia3ActionPerformed

    private void txtTelefonoReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoReferencia3KeyTyped

    private void txtOcupacionReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtOcupacionReferencia3KeyTyped

    private void txtNombreReferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreReferencia3KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtNombreReferencia3KeyTyped

    private void txtConocerloReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConocerloReferencia2KeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConocerloReferencia2KeyTyped

    private void txtExteriorReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtExteriorReferencia2KeyTyped

    private void txtInteriorReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtInteriorReferencia2KeyTyped

    private void txtDireccionReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtDireccionReferencia2KeyTyped

    private void txtColoniaReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtColoniaReferencia2KeyTyped

    private void cbEstadoReferencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoReferencia2ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipioReferencia2.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadoReferencia2ActionPerformed

    private void txtTelefonoReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoReferencia2KeyTyped

    private void txtOcupacionReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtOcupacionReferencia2KeyTyped

    private void txtConocerloReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConocerloReferencia1KeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConocerloReferencia1KeyTyped

    private void txtExteriorReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtExteriorReferencia1KeyTyped

    private void txtInteriorReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtInteriorReferencia1KeyTyped

    private void txtDireccionReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtDireccionReferencia1KeyTyped

    private void txtColoniaReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtColoniaReferencia1KeyTyped

    private void cbEstadoReferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoReferencia1ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipioReferencia1.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadoReferencia1ActionPerformed

    private void txtTelefonoReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoReferencia1KeyTyped

    private void txtOcupacionReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtOcupacionReferencia1KeyTyped

    private void txtNombreReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreReferencia1KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtNombreReferencia1KeyTyped

    private void txtPasaporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasaporteKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car != '-' && car != '/' && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtPasaporteKeyTyped

    private void txtIfeFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIfeFolioKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIfeFolioKeyTyped

    private void txtIfeClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIfeClaveKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIfeClaveKeyTyped

    private void txtNumeroCartillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCartillaKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car != '-' && car != '/' && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtNumeroCartillaKeyTyped

    private void txtNumeroImssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroImssKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroImssKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtCurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtCurpKeyTyped

    private void txtPromedioEstudiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPromedioEstudiosKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtPromedioEstudiosKeyTyped

    private void txtComprobanteFolioEstudiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComprobanteFolioEstudiosKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car != '-' && car != '/' && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtComprobanteFolioEstudiosKeyTyped

    private void txtCedulaEstudiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEstudiosKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car != '-' && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtCedulaEstudiosKeyTyped

    private void txtEspecialidadEstudiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadEstudiosKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtEspecialidadEstudiosKeyTyped

    private void txtNombreEstudiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstudiosKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car!='#' && car != '-' && car != '/' && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtNombreEstudiosKeyTyped

    private void cbEstadoEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoEstudiosActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipioEstudios.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadoEstudiosActionPerformed

    private void cbEstadoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoDActionPerformed
        // TODO add your handling code here:
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipioD.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadoDActionPerformed

    private void txtYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtYKeyTyped

    private void txtEntreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntreKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEntreKeyTyped

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 5) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtExteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE) && (car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtExteriorKeyTyped

    private void txtInteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE) && (car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInteriorKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void cbEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadosActionPerformed
        // TODO add your handling code here:
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadosActionPerformed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 4) {
            evt.consume();
        }
        if ((car < '0' || car > '9') && car != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtEstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstaturaKeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 4) {
            evt.consume();
        }
        if ((car < '0' || car > '9') && car != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtEstaturaKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char car = evt.getKeyChar();
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtNombreReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreReferencia2KeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreReferencia2KeyTyped

    private void cbEstadosEA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadosEA1ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipiosEA1.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadosEA1ActionPerformed

    private void txtExteriorEA1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorEA1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExteriorEA1KeyTyped

    private void txtInteriorEA1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorEA1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteriorEA1KeyTyped

    private void txtInteriorEA2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorEA2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteriorEA2KeyTyped

    private void txtExteriorEA2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorEA2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExteriorEA2KeyTyped

    private void cbEstadosEA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadosEA2ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipiosEA2.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadosEA2ActionPerformed

    private void txtInteriorEA3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteriorEA3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteriorEA3KeyTyped

    private void txtExteriorEA3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExteriorEA3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExteriorEA3KeyTyped

    private void cbEstadosEA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadosEA3ActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipiosEA3.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadosEA3ActionPerformed

    private void btnCursoAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursoAceptarActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicio = dateFormat.format(dpCursoInicio.getDate());
        String fechaFin = dateFormat.format(dpCursoFin.getDate());
        cursosArray[contadorCursos] = fechaInicio+","+fechaFin+","+txtEmpresaNombre.getText()+","+txtEstudioCurso.getText()+","+txtTipoCurso.getText()+","+txtCursoDuracion.getText()+","+bgCurso.getSelection().getActionCommand()+","+bgCursoStatus.getSelection().getActionCommand();;
        contadorCursos++;        
        modeloCursos.addRow(new Object[]{txtEmpresaNombre.getText()});
        txtEmpresaNombre.setText("");
        txtEstudioCurso.setText("");
        txtTipoCurso.setText("");
        txtCursoDuracion.setText("");
        bgCurso.clearSelection();
        bgCursoStatus.clearSelection();
    }//GEN-LAST:event_btnCursoAceptarActionPerformed

    private void btnFotoFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoFrenteActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes jpg (*.jpg)","jpg");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Imagenes png (*.png)","png");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("Imagenes gif (*.gif)","gif");
        file.setFileFilter(filter);
        file.setFileFilter(filter2);
        file.setFileFilter(filter3);
        int option = file.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String path = file.getSelectedFile().getPath();
            txtFotoFrente.setText(path);
        }
    }//GEN-LAST:event_btnFotoFrenteActionPerformed

    private void btnFotoPerfilIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoPerfilIzquierdoActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes jpg (*.jpg)","jpg");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Imagenes png (*.png)","png");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("Imagenes gif (*.gif)","gif");
        file.setFileFilter(filter);
        file.setFileFilter(filter2);
        file.setFileFilter(filter3);
        int option = file.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String path = file.getSelectedFile().getPath();
            txtFotoPerfilIzquierdo.setText(path);
        }
    }//GEN-LAST:event_btnFotoPerfilIzquierdoActionPerformed

    private void btnFotoPerfilDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoPerfilDerechoActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes jpg (*.jpg)","jpg");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Imagenes png (*.png)","png");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("Imagenes gif (*.gif)","gif");
        file.setFileFilter(filter);
        file.setFileFilter(filter2);
        file.setFileFilter(filter3);
        int option = file.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String path = file.getSelectedFile().getPath();
            txtFotoPerfilDerecho.setText(path);
        }
    }//GEN-LAST:event_btnFotoPerfilDerechoActionPerformed

    private void btnFotoSocioeconomico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoSocioeconomico1ActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes jpg (*.jpg)","jpg");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Imagenes png (*.png)","png");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("Imagenes gif (*.gif)","gif");
        file.setFileFilter(filter);
        file.setFileFilter(filter2);
        file.setFileFilter(filter3);
        int option = file.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String path = file.getSelectedFile().getPath();
            txtFotoSocioeconomico1.setText(path);
        }
    }//GEN-LAST:event_btnFotoSocioeconomico1ActionPerformed

    private void btnFotoSocioeconomico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoSocioeconomico2ActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes jpg (*.jpg)","jpg");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Imagenes png (*.png)","png");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("Imagenes gif (*.gif)","gif");
        file.setFileFilter(filter);
        file.setFileFilter(filter2);
        file.setFileFilter(filter3);
        int option = file.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String path = file.getSelectedFile().getPath();
            txtFotoSocioeconomico2.setText(path);
        }
    }//GEN-LAST:event_btnFotoSocioeconomico2ActionPerformed

   
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCursosTotales;
    private javax.swing.ButtonGroup bgActaNacimientoEntrega;
    private javax.swing.ButtonGroup bgCartaNoAntecedentesEntrega;
    private javax.swing.ButtonGroup bgCartaRecomendacionEntrega;
    private javax.swing.ButtonGroup bgCartillaMilitar;
    private javax.swing.ButtonGroup bgCartillaMilitarEntrega;
    private javax.swing.ButtonGroup bgComprobanteDomicilioEntrega;
    private javax.swing.ButtonGroup bgComprobanteEstudiosEntrega;
    private javax.swing.ButtonGroup bgComprobanteMedicoEntrega;
    private javax.swing.ButtonGroup bgContratoEntrega;
    private javax.swing.ButtonGroup bgCurpRfcEntrega;
    private javax.swing.ButtonGroup bgCurso;
    private javax.swing.ButtonGroup bgCursoStatus;
    private javax.swing.ButtonGroup bgFotoSocioeconomicoEntrega;
    private javax.swing.ButtonGroup bgHojaDatosEntrega;
    private javax.swing.ButtonGroup bgIfeEntrega;
    private javax.swing.ButtonGroup bgMapaDomicilioEntrega;
    private javax.swing.ButtonGroup bgNumeroImssEntrega;
    private javax.swing.ButtonGroup bgPsicologicoEntrega;
    private javax.swing.ButtonGroup bgResguardoEntrega;
    private javax.swing.ButtonGroup bgSepRegistroEstudios;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.ButtonGroup bgSocio1;
    private javax.swing.ButtonGroup bgSocio1Casa;
    private javax.swing.ButtonGroup bgSocio1CasaTipo;
    private javax.swing.ButtonGroup bgSocioeconomicoEntrega;
    private javax.swing.ButtonGroup bgSolicitudEntrega;
    private javax.swing.ButtonGroup bgToxicologicoEntrega;
    private javax.swing.JButton btnCursoAceptar;
    private javax.swing.JButton btnFotoFrente;
    private javax.swing.JButton btnFotoPerfilDerecho;
    private javax.swing.JButton btnFotoPerfilIzquierdo;
    private javax.swing.JButton btnFotoSocioeconomico1;
    private javax.swing.JButton btnFotoSocioeconomico2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbCara;
    private javax.swing.JComboBox cbColorPiel;
    private javax.swing.JComboBox cbComplexion;
    private javax.swing.JComboBox cbEscolaridadEstudios;
    private javax.swing.JComboBox cbEstadoD;
    private javax.swing.JComboBox cbEstadoEstudios;
    private javax.swing.JComboBox cbEstadoReferencia1;
    private javax.swing.JComboBox cbEstadoReferencia2;
    private javax.swing.JComboBox cbEstadoReferencia3;
    private javax.swing.JComboBox cbEstadoReferencia4;
    private javax.swing.JComboBox cbEstadosEA1;
    private javax.swing.JComboBox cbEstadosEA2;
    private javax.swing.JComboBox cbEstadosEA3;
    private javax.swing.JComboBox cbMunicipio;
    private javax.swing.JComboBox cbMunicipioD;
    private javax.swing.JComboBox cbMunicipioEstudios;
    private javax.swing.JComboBox cbMunicipioReferencia1;
    private javax.swing.JComboBox cbMunicipioReferencia2;
    private javax.swing.JComboBox cbMunicipioReferencia3;
    private javax.swing.JComboBox cbMunicipioReferencia4;
    private javax.swing.JComboBox cbMunicipiosEA1;
    private javax.swing.JComboBox cbMunicipiosEA2;
    private javax.swing.JComboBox cbMunicipiosEA3;
    private javax.swing.JComboBox cbSangre;
    private org.jdesktop.swingx.JXDatePicker dpCartaAntecedentesEntrega;
    private org.jdesktop.swingx.JXDatePicker dpComprobanteDomEntrega;
    private org.jdesktop.swingx.JXDatePicker dpCursoFin;
    private org.jdesktop.swingx.JXDatePicker dpCursoInicio;
    private org.jdesktop.swingx.JXDatePicker dpFecha;
    private org.jdesktop.swingx.JXDatePicker dpIngresoEA1;
    private org.jdesktop.swingx.JXDatePicker dpIngresoEA2;
    private org.jdesktop.swingx.JXDatePicker dpIngresoEA3;
    private org.jdesktop.swingx.JXDatePicker dpSalidaEA1;
    private org.jdesktop.swingx.JXDatePicker dpSalidaEA2;
    private org.jdesktop.swingx.JXDatePicker dpSalidaEA3;
    private org.jdesktop.swingx.JXDatePicker dpSocioeconomicoEntrega;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblAreaEA1;
    private javax.swing.JLabel lblAreaEA2;
    private javax.swing.JLabel lblAreaEA3;
    private javax.swing.JLabel lblCara;
    private javax.swing.JLabel lblCedulaEstudios;
    private javax.swing.JLabel lblCodigoEA1;
    private javax.swing.JLabel lblCodigoEA2;
    private javax.swing.JLabel lblCodigoEA3;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblColoniaEA1;
    private javax.swing.JLabel lblColoniaEA2;
    private javax.swing.JLabel lblColoniaEA3;
    private javax.swing.JLabel lblColoniaReferencia1;
    private javax.swing.JLabel lblColoniaReferencia2;
    private javax.swing.JLabel lblColoniaReferencia3;
    private javax.swing.JLabel lblColoniaReferencia4;
    private javax.swing.JLabel lblColorPiel;
    private javax.swing.JLabel lblComplexion;
    private javax.swing.JLabel lblComprobanteEstudiosFolio;
    private javax.swing.JLabel lblConocerloReferencia1;
    private javax.swing.JLabel lblConocerloReferencia2;
    private javax.swing.JLabel lblConocerloReferencia3;
    private javax.swing.JLabel lblConocerloReferencia4;
    private javax.swing.JLabel lblCorporacionEA1;
    private javax.swing.JLabel lblCorporacionEA2;
    private javax.swing.JLabel lblCorporacionEA3;
    private javax.swing.JLabel lblCuip;
    private javax.swing.JLabel lblCuipEA1;
    private javax.swing.JLabel lblCuipEA2;
    private javax.swing.JLabel lblCuipEA3;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblCursoDuración;
    private javax.swing.JLabel lblCursoFin;
    private javax.swing.JLabel lblCursoImpartidoRecibido;
    private javax.swing.JLabel lblCursoInicio;
    private javax.swing.JLabel lblCursoStatus;
    private javax.swing.JLabel lblDependenciaEA1;
    private javax.swing.JLabel lblDependenciaEA2;
    private javax.swing.JLabel lblDependenciaEA3;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionEA1;
    private javax.swing.JLabel lblDireccionEA2;
    private javax.swing.JLabel lblDireccionEA3;
    private javax.swing.JLabel lblDireccionReferencia1;
    private javax.swing.JLabel lblDireccionReferencia2;
    private javax.swing.JLabel lblDireccionReferencia3;
    private javax.swing.JLabel lblDireccionReferencia4;
    private javax.swing.JLabel lblDivisionEA1;
    private javax.swing.JLabel lblDivisionEA2;
    private javax.swing.JLabel lblDivisionEA3;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEgresoSalida;
    private javax.swing.JLabel lblEntre;
    private javax.swing.JLabel lblEscolaridadEstudios;
    private javax.swing.JLabel lblEscuelaEstudios;
    private javax.swing.JLabel lblEspecialidadEA1;
    private javax.swing.JLabel lblEspecialidadEA2;
    private javax.swing.JLabel lblEspecialidadEA3;
    private javax.swing.JLabel lblEspecialidadEstudios;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEstadoD;
    private javax.swing.JLabel lblEstadoEA1;
    private javax.swing.JLabel lblEstadoEA2;
    private javax.swing.JLabel lblEstadoEA3;
    private javax.swing.JLabel lblEstadoEstudios;
    private javax.swing.JLabel lblEstadoReferencia1;
    private javax.swing.JLabel lblEstadoReferencia2;
    private javax.swing.JLabel lblEstadoReferencia3;
    private javax.swing.JLabel lblEstadoReferencia4;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblEstudioCurso;
    private javax.swing.JLabel lblExterior;
    private javax.swing.JLabel lblExteriorEA1;
    private javax.swing.JLabel lblExteriorEA2;
    private javax.swing.JLabel lblExteriorEA3;
    private javax.swing.JLabel lblExteriorReferencia1;
    private javax.swing.JLabel lblExteriorReferencia2;
    private javax.swing.JLabel lblExteriorReferencia3;
    private javax.swing.JLabel lblExteriorReferencia4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFotoFrente;
    private javax.swing.JLabel lblFotoPerfilDerecho;
    private javax.swing.JLabel lblFotoPerfilIzquierdo;
    private javax.swing.JLabel lblFotoSocioeconomico1;
    private javax.swing.JLabel lblFotoSocioeconomico2;
    private javax.swing.JLabel lblFuncionesEA1;
    private javax.swing.JLabel lblFuncionesEA2;
    private javax.swing.JLabel lblFuncionesEA3;
    private javax.swing.JLabel lblIfeClave;
    private javax.swing.JLabel lblIfeFolio;
    private javax.swing.JLabel lblIngresoEA1;
    private javax.swing.JLabel lblIngresoEA2;
    private javax.swing.JLabel lblIngresoEA3;
    private javax.swing.JLabel lblIngresoEstudios;
    private javax.swing.JLabel lblInstitucionEmpresa;
    private javax.swing.JLabel lblInterior;
    private javax.swing.JLabel lblInteriorEA1;
    private javax.swing.JLabel lblInteriorEA2;
    private javax.swing.JLabel lblInteriorEA3;
    private javax.swing.JLabel lblInteriorReferencia1;
    private javax.swing.JLabel lblInteriorReferencia2;
    private javax.swing.JLabel lblInteriorReferencia3;
    private javax.swing.JLabel lblInteriorReferencia4;
    private javax.swing.JLabel lblJefeEA1;
    private javax.swing.JLabel lblJefeEA2;
    private javax.swing.JLabel lblJefeEA3;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblMotivoEA1;
    private javax.swing.JLabel lblMotivoEA2;
    private javax.swing.JLabel lblMotivoEA3;
    private javax.swing.JLabel lblMts;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblMunicipioD;
    private javax.swing.JLabel lblMunicipioEA1;
    private javax.swing.JLabel lblMunicipioEA2;
    private javax.swing.JLabel lblMunicipioEA3;
    private javax.swing.JLabel lblMunicipioEstudios;
    private javax.swing.JLabel lblMunicipioReferencia1;
    private javax.swing.JLabel lblMunicipioReferencia2;
    private javax.swing.JLabel lblMunicipioReferencia3;
    private javax.swing.JLabel lblMunicipioReferencia4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreReferencia1;
    private javax.swing.JLabel lblNombreReferencia2;
    private javax.swing.JLabel lblNombreReferencia3;
    private javax.swing.JLabel lblNombreReferencia4;
    private javax.swing.JLabel lblNumeroCartilla;
    private javax.swing.JLabel lblNumeroImss;
    private javax.swing.JLabel lblOcupacionReferencia1;
    private javax.swing.JLabel lblOcupacionReferencia2;
    private javax.swing.JLabel lblOcupacionReferencia3;
    private javax.swing.JLabel lblOcupacionReferencia4;
    private javax.swing.JLabel lblParentescoReferencia1;
    private javax.swing.JLabel lblParentescoReferencia2;
    private javax.swing.JLabel lblParentescoReferencia3;
    private javax.swing.JLabel lblParentescoReferencia4;
    private javax.swing.JLabel lblPasaporte;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPlacaEA1;
    private javax.swing.JLabel lblPlacaEA2;
    private javax.swing.JLabel lblPlacaEA3;
    private javax.swing.JLabel lblPostal;
    private javax.swing.JLabel lblPromedioEstudios;
    private javax.swing.JLabel lblPuestoEA1;
    private javax.swing.JLabel lblPuestoEA2;
    private javax.swing.JLabel lblPuestoEA3;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblRangoCategoriaEA1;
    private javax.swing.JLabel lblRangoCategoriaEA2;
    private javax.swing.JLabel lblRangoCategoriaEA3;
    private javax.swing.JLabel lblSalidaEA1;
    private javax.swing.JLabel lblSalidaEA2;
    private javax.swing.JLabel lblSalidaEA3;
    private javax.swing.JLabel lblSangre;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSueldoEA1;
    private javax.swing.JLabel lblSueldoEA2;
    private javax.swing.JLabel lblSueldoEA3;
    private javax.swing.JLabel lblTelefonoReferencia1;
    private javax.swing.JLabel lblTelefonoReferencia2;
    private javax.swing.JLabel lblTelefonoReferencia3;
    private javax.swing.JLabel lblTelefonoReferencia4;
    private javax.swing.JLabel lblTelefonosEA1;
    private javax.swing.JLabel lblTelefonosEA2;
    private javax.swing.JLabel lblTelefonosEA3;
    private javax.swing.JLabel lblTipoCurso;
    private javax.swing.JLabel lblY;
    private javax.swing.JLabel lblYearsReferencia1;
    private javax.swing.JLabel lblYearsReferencia2;
    private javax.swing.JLabel lblYearsReferencia3;
    private javax.swing.JLabel lblYearsReferencia4;
    private javax.swing.JPanel pActaNacimiento;
    private javax.swing.JPanel pBuscaFotos;
    private javax.swing.JPanel pCartaAntecedentes;
    private javax.swing.JPanel pCartaRecomendacionEntrega;
    private javax.swing.JPanel pCartaResguardoEntrega;
    private javax.swing.JPanel pCartillaEntrega;
    private javax.swing.JPanel pCartillaMilitar;
    private javax.swing.JPanel pComprobanteDom;
    private javax.swing.JPanel pComprobanteEstudios;
    private javax.swing.JPanel pComprobanteMedicoEntrega;
    private javax.swing.JPanel pContratoEntrega;
    private javax.swing.JPanel pCurpYRfc;
    private javax.swing.JPanel pCursos;
    private javax.swing.JPanel pDatosPersonales;
    private javax.swing.JPanel pDocEntregados;
    private javax.swing.JPanel pDocEntregados2;
    private javax.swing.JPanel pDocumentos;
    private javax.swing.JPanel pDocumentos2;
    private javax.swing.JPanel pDomicilio;
    private javax.swing.JPanel pEstudios;
    private javax.swing.JPanel pEstudiosMaximos;
    private javax.swing.JPanel pExperienciaLaboral1;
    private javax.swing.JPanel pExperienciaLaboral2;
    private javax.swing.JPanel pExperienciaLaboral3;
    private javax.swing.JPanel pFotos;
    private javax.swing.JPanel pHojaDatos;
    private javax.swing.JPanel pIfe;
    private javax.swing.JPanel pMapaDomicilioEntrega;
    private javax.swing.JPanel pNacimiento;
    private javax.swing.JPanel pNumeroImssEntrega;
    private javax.swing.JPanel pPsicologicoEntrega;
    private javax.swing.JPanel pReferenciaPersonal1;
    private javax.swing.JPanel pReferenciaPersonal2;
    private javax.swing.JPanel pReferenciaPersonal3;
    private javax.swing.JPanel pReferenciaPersonal4;
    private javax.swing.JPanel pReferenciasLaborales;
    private javax.swing.JPanel pReferenciasPersonales;
    private javax.swing.JPanel pRegistroElemento;
    private javax.swing.JPanel pSexo;
    private javax.swing.JPanel pSocioeconomicoEntrega;
    private javax.swing.JPanel pSocioeconomicoEntrega2;
    private javax.swing.JPanel pSolicitud;
    private javax.swing.JPanel pToxicologicoEntrega;
    private javax.swing.JPanel pTrabajoAnterior1;
    private javax.swing.JPanel pTrabajoAnterior2;
    private javax.swing.JPanel pTrabajoAnterior3;
    private javax.swing.JPanel panelRegistroSep;
    private javax.swing.JRadioButton rbActaNacimientoEntregaC;
    private javax.swing.JRadioButton rbActaNacimientoEntregaN;
    private javax.swing.JRadioButton rbActaNacimientoEntregaO;
    private javax.swing.JRadioButton rbCartaAntecedentesEntregaC;
    private javax.swing.JRadioButton rbCartaAntecedentesEntregaN;
    private javax.swing.JRadioButton rbCartaAntecedentesEntregaO;
    private javax.swing.JRadioButton rbCartaRecomendacionEntregaC;
    private javax.swing.JRadioButton rbCartaRecomendacionEntregaN;
    private javax.swing.JRadioButton rbCartaRecomendacionEntregaO;
    private javax.swing.JRadioButton rbCartaResguardoEntregaC;
    private javax.swing.JRadioButton rbCartaResguardoEntregaN;
    private javax.swing.JRadioButton rbCartaResguardoEntregaO;
    private javax.swing.JRadioButton rbCartillaEntregaC;
    private javax.swing.JRadioButton rbCartillaEntregaN;
    private javax.swing.JRadioButton rbCartillaEntregaO;
    private javax.swing.JRadioButton rbCartillaLiberada;
    private javax.swing.JRadioButton rbComprobanteDomEntregaC;
    private javax.swing.JRadioButton rbComprobanteDomEntregaN;
    private javax.swing.JRadioButton rbComprobanteDomEntregaO;
    private javax.swing.JRadioButton rbComprobanteEstudiosEntregaC;
    private javax.swing.JRadioButton rbComprobanteEstudiosEntregaN;
    private javax.swing.JRadioButton rbComprobanteEstudiosEntregaO;
    private javax.swing.JRadioButton rbComprobanteMedicoEntregaC;
    private javax.swing.JRadioButton rbComprobanteMedicoEntregaN;
    private javax.swing.JRadioButton rbComprobanteMedicoEntregaO;
    private javax.swing.JRadioButton rbContratoEntregaC;
    private javax.swing.JRadioButton rbContratoEntregaN;
    private javax.swing.JRadioButton rbContratoEntregaO;
    private javax.swing.JRadioButton rbCurpYRfcEntregaC;
    private javax.swing.JRadioButton rbCurpYRfcEntregaN;
    private javax.swing.JRadioButton rbCurpYRfcEntregaO;
    private javax.swing.JRadioButton rbCursoConcluido;
    private javax.swing.JRadioButton rbCursoEncurso;
    private javax.swing.JRadioButton rbCursoImpartido;
    private javax.swing.JRadioButton rbCursoInconcluso;
    private javax.swing.JRadioButton rbCursoRecibido;
    private javax.swing.JRadioButton rbCursoSolicitud;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbHojaDatosEntregaC;
    private javax.swing.JRadioButton rbHojaDatosEntregaN;
    private javax.swing.JRadioButton rbHojaDatosEntregaO;
    private javax.swing.JRadioButton rbIfeEntregaC;
    private javax.swing.JRadioButton rbIfeEntregaN;
    private javax.swing.JRadioButton rbIfeEntregaO;
    private javax.swing.JRadioButton rbMapaDomicilioEntregaC;
    private javax.swing.JRadioButton rbMapaDomicilioEntregaN;
    private javax.swing.JRadioButton rbMapaDomicilioEntregaO;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbNoAplica;
    private javax.swing.JRadioButton rbNumeroImssEntregaC;
    private javax.swing.JRadioButton rbNumeroImssEntregaN;
    private javax.swing.JRadioButton rbNumeroImssEntregaO;
    private javax.swing.JRadioButton rbPreCartilla;
    private javax.swing.JRadioButton rbPsicologicoEntregaC;
    private javax.swing.JRadioButton rbPsicologicoEntregaN;
    private javax.swing.JRadioButton rbPsicologicoEntregaO;
    private javax.swing.JRadioButton rbSepCertificadoN;
    private javax.swing.JRadioButton rbSepCertificadoS;
    private javax.swing.JRadioButton rbSocioeconomicoEntrega2C;
    private javax.swing.JRadioButton rbSocioeconomicoEntrega2N;
    private javax.swing.JRadioButton rbSocioeconomicoEntrega2O;
    private javax.swing.JRadioButton rbSocioeconomicoEntregaC;
    private javax.swing.JRadioButton rbSocioeconomicoEntregaN;
    private javax.swing.JRadioButton rbSocioeconomicoEntregaO;
    private javax.swing.JRadioButton rbSolicitudEntregaC;
    private javax.swing.JRadioButton rbSolicitudEntregaN;
    private javax.swing.JRadioButton rbSolicitudEntregaO;
    private javax.swing.JRadioButton rbToxicologicoEntregaC;
    private javax.swing.JRadioButton rbToxicologicoEntregaN;
    private javax.swing.JRadioButton rbToxicologicoEntregaO;
    private javax.swing.JScrollPane spAlergias;
    private javax.swing.JScrollPane spRegistroElemento;
    private javax.swing.JTable tCursosTomados;
    private javax.swing.JTextArea taMotivoEA1;
    private javax.swing.JTextArea taMotivoEA2;
    private javax.swing.JTextArea taMotivoEA3;
    private javax.swing.JTabbedPane tpRegistroElemento;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtAreaEA1;
    private javax.swing.JTextField txtAreaEA2;
    private javax.swing.JTextField txtAreaEA3;
    private javax.swing.JTextField txtCedulaEstudios;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtCodigoPostalEA1;
    private javax.swing.JTextField txtCodigoPostalEA2;
    private javax.swing.JTextField txtCodigoPostalEA3;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtColoniaEA1;
    private javax.swing.JTextField txtColoniaEA2;
    private javax.swing.JTextField txtColoniaEA3;
    private javax.swing.JTextField txtColoniaReferencia1;
    private javax.swing.JTextField txtColoniaReferencia2;
    private javax.swing.JTextField txtColoniaReferencia3;
    private javax.swing.JTextField txtColoniaReferencia4;
    private javax.swing.JTextField txtComprobanteFolioEstudios;
    private javax.swing.JTextField txtConocerloReferencia1;
    private javax.swing.JTextField txtConocerloReferencia2;
    private javax.swing.JTextField txtConocerloReferencia3;
    private javax.swing.JTextField txtConocerloReferencia4;
    private javax.swing.JTextField txtCorporacionEA1;
    private javax.swing.JTextField txtCorporacionEA2;
    private javax.swing.JTextField txtCorporacionEA3;
    private javax.swing.JTextField txtCuip;
    private javax.swing.JTextField txtCuipEA1;
    private javax.swing.JTextField txtCuipEA2;
    private javax.swing.JTextField txtCuipEA3;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtCursoDuracion;
    private javax.swing.JTextField txtDependenciaEA1;
    private javax.swing.JTextField txtDependenciaEA2;
    private javax.swing.JTextField txtDependenciaEA3;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEA1;
    private javax.swing.JTextField txtDireccionEA2;
    private javax.swing.JTextField txtDireccionEA3;
    private javax.swing.JTextField txtDireccionReferencia1;
    private javax.swing.JTextField txtDireccionReferencia2;
    private javax.swing.JTextField txtDireccionReferencia3;
    private javax.swing.JTextField txtDireccionReferencia4;
    private javax.swing.JTextField txtDivisionEA1;
    private javax.swing.JTextField txtDivisionEA2;
    private javax.swing.JTextField txtDivisionEA3;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresaNombre;
    private javax.swing.JTextField txtEntre;
    private javax.swing.JTextField txtEspecialidadEA1;
    private javax.swing.JTextField txtEspecialidadEA2;
    private javax.swing.JTextField txtEspecialidadEA3;
    private javax.swing.JTextField txtEspecialidadEstudios;
    private javax.swing.JComboBox txtEstadoCivil;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtEstudioCurso;
    private javax.swing.JTextField txtExterior;
    private javax.swing.JTextField txtExteriorEA1;
    private javax.swing.JTextField txtExteriorEA2;
    private javax.swing.JTextField txtExteriorEA3;
    private javax.swing.JTextField txtExteriorReferencia1;
    private javax.swing.JTextField txtExteriorReferencia2;
    private javax.swing.JTextField txtExteriorReferencia3;
    private javax.swing.JTextField txtExteriorReferencia4;
    private javax.swing.JTextField txtFotoFrente;
    private javax.swing.JTextField txtFotoPerfilDerecho;
    private javax.swing.JTextField txtFotoPerfilIzquierdo;
    private javax.swing.JTextField txtFotoSocioeconomico1;
    private javax.swing.JTextField txtFotoSocioeconomico2;
    private javax.swing.JTextField txtFuncionesEA1;
    private javax.swing.JTextField txtFuncionesEA2;
    private javax.swing.JTextField txtFuncionesEA3;
    private javax.swing.JTextField txtIfeClave;
    private javax.swing.JTextField txtIfeFolio;
    private javax.swing.JTextField txtIngresoEstudios;
    private javax.swing.JTextField txtInterior;
    private javax.swing.JTextField txtInteriorEA1;
    private javax.swing.JTextField txtInteriorEA2;
    private javax.swing.JTextField txtInteriorEA3;
    private javax.swing.JTextField txtInteriorReferencia1;
    private javax.swing.JTextField txtInteriorReferencia2;
    private javax.swing.JTextField txtInteriorReferencia3;
    private javax.swing.JTextField txtInteriorReferencia4;
    private javax.swing.JTextField txtJefeEA1;
    private javax.swing.JTextField txtJefeEA2;
    private javax.swing.JTextField txtJefeEA3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEstudios;
    private javax.swing.JTextField txtNombreReferencia1;
    private javax.swing.JTextField txtNombreReferencia2;
    private javax.swing.JTextField txtNombreReferencia3;
    private javax.swing.JTextField txtNombreReferencia4;
    private javax.swing.JTextField txtNumeroCartilla;
    private javax.swing.JTextField txtNumeroImss;
    private javax.swing.JTextField txtOcupacionReferencia1;
    private javax.swing.JTextField txtOcupacionReferencia2;
    private javax.swing.JTextField txtOcupacionReferencia3;
    private javax.swing.JTextField txtOcupacionReferencia4;
    private javax.swing.JTextField txtParentescoReferencia1;
    private javax.swing.JTextField txtParentescoReferencia2;
    private javax.swing.JTextField txtParentescoReferencia3;
    private javax.swing.JTextField txtParentescoReferencia4;
    private javax.swing.JTextField txtPasaporte;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPlacaEA1;
    private javax.swing.JTextField txtPlacaEA2;
    private javax.swing.JTextField txtPlacaEA3;
    private javax.swing.JTextField txtPromedioEstudios;
    private javax.swing.JTextField txtPuestoEA1;
    private javax.swing.JTextField txtPuestoEA2;
    private javax.swing.JTextField txtPuestoEA3;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtRangoCategoriaEA1;
    private javax.swing.JTextField txtRangoCategoriaEA2;
    private javax.swing.JTextField txtRangoCategoriaEA3;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSueldoEA1;
    private javax.swing.JTextField txtSueldoEA2;
    private javax.swing.JTextField txtSueldoEA3;
    private javax.swing.JTextField txtTelefonoReferencia1;
    private javax.swing.JTextField txtTelefonoReferencia2;
    private javax.swing.JTextField txtTelefonoReferencia3;
    private javax.swing.JTextField txtTelefonoReferencia4;
    private javax.swing.JTextField txtTelefonosEA1;
    private javax.swing.JTextField txtTelefonosEA2;
    private javax.swing.JTextField txtTelefonosEA3;
    private javax.swing.JTextField txtTipoCurso;
    private javax.swing.JTextField txtY;
    private javax.swing.JTextField txtYearEgresoSalida;
    // End of variables declaration//GEN-END:variables
}
