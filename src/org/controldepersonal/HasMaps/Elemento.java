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
    private final HashMap<String, String> DatosElemento_1;
    private final HashMap<String, String> DatosElemento_2;
    private final HashMap<String, String> DatosElemento_3;
    public String[] DatosNivel_1 = {
        //`controldepersonal`.`empleados_nivel1
        "`id_empleado`",
        "`status_empleado`",
        "`nombre_empleado`",
        "`apellido_paterno_empleado`",
        "`apellido_materno_empleado`",};

    public String[] DatosNivel_2 = {
        //`controldepersonal`.`empleados_nivel2`
        "`id_empleado`",
        "`sexo_empleado`",
        "`edad_empleado`",
        "`estatura_empleado`",
        "`peso_empleado`",
        "`complexion_empleado`",
        "`color_piel_empleado`",
        "`cara_empleado`",
        "`tipo_sangre_empleado`",
        "`numero_empleado`",
        "`alergias_empleado`",
        "`estado_civil_empleado`",
        "`fecha_nacimiento_empleado`",
        "`estado_nacimiento_empleado`",
        "`municipio_nacimiento_empleado`"};

    public String[] DatosNivel_3 = {
        //`controldepersonal`.`empleados_nivel3`
        "`id_empleado`",
        "`dependencia_ta`",
        "`corporacion_ta`",
        "`direccion_ta`",
        "`interior_ta`",
        "`exterior_ta`",
        "`colonia_ta`",
        "`cp_ta`",
        "`telefono_ta`",
        "`estado_ta`",
        "`municipio_ta`",
        "`fecha_ingreso_ta`",
        "`fecha_salida_ta`",
        "`puesto_ta`",
        "`funciones_ta`",
        "`especialidad_ta`",
        "`rango_ta`",
        "`sueldo_base_ta`",
        "`numero_placa_ta`",
        "`area_ta`",
        "`divicion_ta`",
        "`jefe_inmediato_ta`",
        "`curp_jefe_inmediato_ta`",
        "`motivo_salida_ta`",
        "`nombre_ref1`",
        "`parentesco_ref1`",
        "`ocupacion_ref1`",
        "`direccion_ref1`",
        "`interior_ref1`",
        "`exterior_ref1`",
        "`colonia_ref1`",
        "`estado_ref1`",
        "`municipio_ref1`",
        "`nombre_ref2`",
        "`parentesco_ref12`",
        "`ocupacion_ref2`",
        "`direccion_ref2`",
        "`interior_ref2`",
        "`exterior_ref2`",
        "`colonia_ref2`",
        "`estado_ref2`",
        "`municipio_ref2`",
        "`nombre_ref3`",
        "`parentesco_ref3`",
        "`ocupacion_ref3`",
        "`direccion_ref3`",
        "`interior_ref3`",
        "`exterior_ref3`",
        "`colonia_ref3`",
        "`estado_ref3`",
        "`municipio_ref3`",
        "`nombre_ref4`",
        "`parentesco_ref4`",
        "`ocupacion_ref4`",
        "`direccion_ref4`",
        "`interior_ref4`",
        "`exterior_ref4`",
        "`colonia_ref4`",
        "`estado_ref4`",
        "`municipio_ref4`",
        "`nombre_ref5`",
        "`parentesco_ref5`",
        "`ocupacion_ref5`",
        "`direccion_ref5`",
        "`interior_ref5`",
        "`exterior_ref5`",
        "`colonia_ref5`",
        "`estado_ref5`",
        "`municipio_ref5`",
        "`vive_con_familia`",
        "`total_ingresos_hogar`",
        "`su_domicilio_es`",
        "`especificacion_inmuebles`",
        "`inversiones`",
        "`vehiculo`",
        "`tipo_vivienda`",
        "`cuartos_con_los_que_cuenta`",
        "`sala`",
        "`bano_privado`",
        "`comedor`",
        "`bano_colectivo`",
        "`cocina`",
        "`numero_dormitorios`",
        "`material_predominante_paredes`",
        "`techo`",
        "`piso`",
        "`inmobiliario_vivienda`",
        "`estereo`",
        "`dvd`",
        "`lavadora`",
        "`television`",
        "`estufa`",
        "`refrigerador`",
        "`videocasetera`",
        "`microondas`",
        "`computadora`",
        "`alimentacion`",
        "`luz`",
        "`educacion`",
        "`pretamos_rifas`",
        "`gas_combustible`",
        "`telefono_socioeconomico`",
        "`gastos_medicos`",
        "`creditos_construccion`",
        "`renta_predial`",
        "`celular_socioeconomico`",
        "`recreacion`",
        "`agua`",
        "`trasporte`",
        "`ropa_calzado`",
        "`tiempo`",
        "`total_gastos`",
        "`servicios_medicos`",
        "`imss`",
        "`issste`",
        "`centro_salud`",
        "`dispensario`",
        "`medico_particular`",
        "`actividades_de_fin_de_semana`",
        "`deporte`",
        "`ver_tv`",
        "`cine`",
        "`visitar_familia`",
        "`recreacion_boolean`",
        "`labores_hogar`",
        "`actividades_recreativas`",
        "`estudia`",
        "`que_estudia`",
        "`organizacion_familia`",
        "`comunicacion`",
        "`roles`",
        "`autoridad`",
        "`limites`",
        "`calidad_vida`",
        "`imagen_publica`",
        "`comportamiento_social`",
        "`observaciones`",
        "`nombre_padre`",
        "`nombre_madre`",
        "`nombre_pareja`",
        "`hijos`"};
    /*
     Constructor
     */

    public Elemento() {
        DatosElemento_1 = new HashMap();
        DatosElemento_2 = new HashMap();
        DatosElemento_3 = new HashMap();
    }
    /*
     Getter que devuelve todos los datos del elemento.
     */

    public HashMap dameDatosElemento_nivel1() {
        return DatosElemento_1;
    }

    public HashMap dameDatosElemento_nivel2() {
        return DatosElemento_2;
    }

    public HashMap dameDatosElemento_nivel3() {
        return DatosElemento_3;
    }
    /*
     Getter que devuelve un campo en especifico (String)
     */

    public String dameDato_nivel1(String referencia) {
        if (DatosElemento_1.containsValue(referencia)) {
            return (String) DatosElemento_1.get(referencia);
        }
        return (String) referencia + "-Referencia no encontrada";
    }

    public String dameDato_nivel2(String referencia) {
        if (DatosElemento_2.containsValue(referencia)) {
            return (String) DatosElemento_2.get(referencia);
        }
        return (String) referencia + "-Referencia no encontrada";
    }

    public String dameDato_nivel3(String referencia) {
        if (DatosElemento_3.containsValue(referencia)) {
            return (String) DatosElemento_3.get(referencia);
        }
        return (String) referencia + "-Referencia no encontrada";
    }
    /*
     Borrar toda la info del empleado, por si las moscas.
     */

    public boolean borraDatos() {
        DatosElemento_1.clear();
        DatosElemento_2.clear();
        DatosElemento_3.clear();
        return (DatosElemento_1.isEmpty()
                && DatosElemento_2.isEmpty()
                && DatosElemento_3.isEmpty());
    }
    /*
     Valida si la tabla esta vacia
     */

    public boolean estaVacia() {
        return (DatosElemento_1.isEmpty()
                && DatosElemento_2.isEmpty()
                && DatosElemento_3.isEmpty());
    }
    /*
     Funcion que inserta un valor
     */

    public boolean insertaValor_nivel1(String referencia, String valor) {
        DatosElemento_1.put(referencia, valor);
        return true;
    }
    /*
     Funcion que inserta un valor
     */

    public boolean insertaValor_nivel2(String referencia, String valor) {
        DatosElemento_2.put(referencia, valor);
        return true;
    }
    /*
     Funcion que inserta un valor
     */

    public boolean insertaValor_nivel3(String referencia, String valor) {
        DatosElemento_3.put(referencia, valor);
        return true;
    }
}
