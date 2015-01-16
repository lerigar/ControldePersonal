/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.conector;

/**
 *
 * @author Antonio
 * En esta clase esta la deficion de las tablas de la base de datos.
 * se las pedimos en forma de biblioteca que regresa un string
 * con la sentencia en sql exacta para crear TODA la base de datos. :D
 */
public class BasedeDatos {
    public String sentenciaCreaciondeBD(){
        return    "CREATE TABLE `cursos_empleado` ("
                + "  `id_curso` int(11) NOT NULL,"
                + "  `id_empleado` int(11) DEFAULT NULL,"
                + "  `institucion` varchar(80) DEFAULT NULL,"
                + "  `recibido_impartido` tinyint(4) DEFAULT NULL,"
                + "  `duracion` varchar(45) DEFAULT NULL,"
                + "  `estudio_curso` varchar(80) DEFAULT NULL,"
                + "  `tipo_curso` varchar(80) DEFAULT NULL,"
                + "  `status` varchar(50) DEFAULT NULL,"
                + "  `inicio` date DEFAULT NULL,"
                + "  `fin` date DEFAULT NULL,"
                + "  PRIMARY KEY (`id_curso`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + "CREATE TABLE `dependientes_economicos` ("
                + "  `id_empleado` int(11) NOT NULL,"
                + "  `id_dependiente` int(11) NOT NULL,"
                + "  `sexo_dependiente` tinyint(4) DEFAULT NULL,"
                + "  `fecha_nacimiento_dependiente` date DEFAULT NULL,"
                + "  `parentezco` varchar(55) DEFAULT NULL,"
                + "  PRIMARY KEY (`id_empleado`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `empleados_nivel1` ("
                + "  `id_empleado` int(11) NOT NULL,"
                + "  `status_empleado` tinyint(4) NOT NULL,"
                + "  `nombre_empleado` varchar(45) NOT NULL,"
                + " `apellido_paterno_empleado` varchar(45) NOT NULL,"
                + "  `apellido_materno_empleado` varchar(45) NOT NULL,"
                + "  PRIMARY KEY (`id_empleado`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `empleados_nivel2` ("
                + "  `id_empleado` int(11) NOT NULL,"
                + "  `sexo_empleado` tinyint(4) NOT NULL,"
                + "  `edad_empleado` int(11) NOT NULL,"
                + "  `estatura_empleado` float DEFAULT NULL,"
                + "  `peso_empleado` float DEFAULT NULL,"
                + "  `complexion_empleado` varchar(45) DEFAULT NULL,"
                + "  `color_piel_empleado` varchar(25) DEFAULT NULL,"
                + "  `cara_empleado` varchar(25) DEFAULT NULL,"
                + "  `tipo_sangre_empleado` varchar(15) DEFAULT NULL,"
                + "  `numero_empleado` int(11) DEFAULT NULL,"
                + "  `alergias_empleado` varchar(100) DEFAULT NULL,"
                + "  `estado_civil_empleado` varchar(20) DEFAULT NULL,"
                + "          `fecha_nacimiento_empleado` date DEFAULT NULL,"
                + "  `estado_nacimiento_empleado` varchar(15) DEFAULT NULL,"
                + "  `municipio_nacimiento_empleado` varchar(15) DEFAULT NULL,"
                + "  PRIMARY KEY (`id_empleado`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `empleados_nivel3` ("
                + "  `id_empleado` int(11) NOT NULL,"
                + "  `dependencia_ta` varchar(45) DEFAULT NULL,"
                + "  `corporacion_ta` varchar(45) DEFAULT NULL,"
                + "  `direccion_ta` varchar(45) DEFAULT NULL,"
                + "  `interior_ta` varchar(45) DEFAULT NULL,"
                + "  `exterior_ta` varchar(45) DEFAULT NULL,"
                + "  `colonia_ta` varchar(45) DEFAULT NULL,"
                + "  `cp_ta` varchar(45) DEFAULT NULL,"
                + "  `telefono_ta` varchar(45) DEFAULT NULL,"
                + "  `estado_ta` varchar(45) DEFAULT NULL,"
                + "  `municipio_ta` varchar(45) DEFAULT NULL,"
                + "  `fecha_ingreso_ta` date DEFAULT NULL,"
                + "  `fecha_salida_ta` date DEFAULT NULL,"
                + "  `puesto_ta` varchar(45) DEFAULT NULL,"
                + "  `funciones_ta` varchar(125) DEFAULT NULL,"
                + "  `especialidad_ta` varchar(125) DEFAULT NULL,"
                + "  `rango_ta` varchar(45) DEFAULT NULL,"
                + "  `sueldo_base_ta` varchar(45) DEFAULT NULL,"
                + "  `numero_placa_ta` varchar(45) DEFAULT NULL,"
                + "  `area_ta` varchar(45) DEFAULT NULL,"
                + "  `divicion_ta` varchar(45) DEFAULT NULL,"
                + "  `jefe_inmediato_ta` varchar(45) DEFAULT NULL,"
                + "  `curp_jefe_inmediato_ta` varchar(45) DEFAULT NULL,"
                + "  `motivo_salida_ta` varchar(300) DEFAULT NULL,"
                + "          `nombre_ref1` varchar(80) DEFAULT NULL,"
                + "  `parentesco_ref1` varchar(45) DEFAULT NULL,"
                + "  `ocupacion_ref1` varchar(45) DEFAULT NULL,"
                + "  `direccion_ref1` varchar(125) DEFAULT NULL,"
                + "  `interior_ref1` varchar(45) DEFAULT NULL,"
                + "  `exterior_ref1` varchar(45) DEFAULT NULL,"
                + "  `colonia_ref1` varchar(45) DEFAULT NULL,"
                + "  `estado_ref1` varchar(45) DEFAULT NULL,"
                + "  `municipio_ref1` varchar(45) DEFAULT NULL,"
                + "  `nombre_ref2` varchar(80) DEFAULT NULL,"
                + "  `parentesco_ref12` varchar(45) DEFAULT NULL,"
                + "  `ocupacion_ref2` varchar(45) DEFAULT NULL,"
                + "  `direccion_ref2` varchar(125) DEFAULT NULL,"
                + "  `interior_ref2` varchar(45) DEFAULT NULL,"
                + "  `exterior_ref2` varchar(45) DEFAULT NULL,"
                + "  `colonia_ref2` varchar(45) DEFAULT NULL,"
                + "  `estado_ref2` varchar(45) DEFAULT NULL,"
                + "  `municipio_ref2` varchar(45) DEFAULT NULL,"
                + "  `nombre_ref3` varchar(80) DEFAULT NULL,"
                + "  `parentesco_ref3` varchar(45) DEFAULT NULL,"
                + "  `ocupacion_ref3` varchar(45) DEFAULT NULL,"
                + "  `direccion_ref3` varchar(125) DEFAULT NULL,"
                + "  `interior_ref3` varchar(45) DEFAULT NULL,"
                + "  `exterior_ref3` varchar(45) DEFAULT NULL,"
                + "  `colonia_ref3` varchar(45) DEFAULT NULL,"
                + "  `estado_ref3` varchar(45) DEFAULT NULL,"
                + "  `municipio_ref3` varchar(45) DEFAULT NULL,"
                + "  `nombre_ref4` varchar(80) DEFAULT NULL,"
                + "  `parentesco_ref4` varchar(45) DEFAULT NULL,"
                + "  `ocupacion_ref4` varchar(45) DEFAULT NULL,"
                + "  `direccion_ref4` varchar(125) DEFAULT NULL,"
                + "  `interior_ref4` varchar(45) DEFAULT NULL,"
                + "  `exterior_ref4` varchar(45) DEFAULT NULL,"
                + "  `colonia_ref4` varchar(45) DEFAULT NULL,"
                + "  `estado_ref4` varchar(45) DEFAULT NULL,"
                + "  `municipio_ref4` varchar(45) DEFAULT NULL,"
                + "  `nombre_ref5` varchar(80) DEFAULT NULL,"
                + "  `parentesco_ref5` varchar(45) DEFAULT NULL,"
                + "  `ocupacion_ref5` varchar(45) DEFAULT NULL,"
                + "  `direccion_ref5` varchar(125) DEFAULT NULL,"
                + "  `interior_ref5` varchar(45) DEFAULT NULL,"
                + "  `exterior_ref5` varchar(45) DEFAULT NULL,"
                + "  `colonia_ref5` varchar(45) DEFAULT NULL,"
                + "  `estado_ref5` varchar(45) DEFAULT NULL,"
                + "  `municipio_ref5` varchar(45) DEFAULT NULL,"
                + "  `vive_con_familia` tinyint(4) DEFAULT NULL,"
                + "  `total_ingresos_hogar` varchar(45) DEFAULT NULL,"
                + "  `su_domicilio_es` varchar(45) DEFAULT NULL,"
                + "  `especificacion_inmuebles` varchar(200) DEFAULT NULL,"
                + "  `inversiones` varchar(200) DEFAULT NULL,"
                + "  `vehiculo` varchar(200) DEFAULT NULL,"
                + "  `tipo_vivienda` varchar(100) DEFAULT NULL,"
                + "  `cuartos_con_los_que_cuenta` varchar(45) DEFAULT NULL,"
                + "  `sala` tinyint(4) DEFAULT NULL,"
                + "  `bano_privado` tinyint(4) DEFAULT NULL,"
                + "  `comedor` tinyint(4) DEFAULT NULL,"
                + "  `bano_colectivo` tinyint(4) DEFAULT NULL,"
                + "  `cocina` tinyint(4) DEFAULT NULL,"
                + "  `numero_dormitorios` int(11) DEFAULT NULL,"
                + "  `material_predominante_paredes` varchar(100) DEFAULT NULL,"
                + "  `techo` varchar(45) DEFAULT NULL,"
                + "  `piso` varchar(45) DEFAULT NULL,"
                + "  `inmobiliario_vivienda` varchar(45) DEFAULT NULL,"
                + "  `estereo` tinyint(4) DEFAULT NULL,"
                + "  `dvd` tinyint(4) DEFAULT NULL,"
                + "  `lavadora` tinyint(4) DEFAULT NULL,"
                + "  `television` tinyint(4) DEFAULT NULL,"
                + "  `estufa` tinyint(4) DEFAULT NULL,"
                + "  `refrigerador` tinyint(4) DEFAULT NULL,"
                + "  `videocasetera` tinyint(4) DEFAULT NULL,"
                + "  `microondas` tinyint(4) DEFAULT NULL,"
                + "  `computadora` tinyint(4) DEFAULT NULL,"
                + "  `alimentacion` varchar(45) DEFAULT NULL,"
                + "  `luz` varchar(45) DEFAULT NULL,"
                + "  `educacion` varchar(45) DEFAULT NULL,"
                + "  `pretamos_rifas` varchar(45) DEFAULT NULL,"
                + "  `gas_combustible` varchar(45) DEFAULT NULL,"
                + "  `telefono_socioeconomico` varchar(45) DEFAULT NULL,"
                + "  `gastos_medicos` varchar(45) DEFAULT NULL,"
                + "  `creditos_construccion` varchar(45) DEFAULT NULL,"
                + "  `renta_predial` varchar(45) DEFAULT NULL,"
                + "  `celular_socioeconomico` varchar(45) DEFAULT NULL,"
                + "  `recreacion` varchar(45) DEFAULT NULL,"
                + "  `agua` varchar(45) DEFAULT NULL,"
                + "  `trasporte` varchar(45) DEFAULT NULL,"
                + "  `ropa_calzado` varchar(45) DEFAULT NULL,"
                + "  `tiempo` varchar(45) DEFAULT NULL,"
                + "  `total_gastos` varchar(45) DEFAULT NULL,"
                + "  `servicios_medicos` varchar(45) DEFAULT NULL,"
                + "  `imss` tinyint(4) DEFAULT NULL,"
                + "  `issste` tinyint(4) DEFAULT NULL,"
                + "  `centro_salud` tinyint(4) DEFAULT NULL,"
                + "  `dispensario` tinyint(4) DEFAULT NULL,"
                + "  `medico_particular` tinyint(4) DEFAULT NULL,"
                + "  `actividades_de_fin_de_semana` varchar(45) DEFAULT NULL,"
                + "  `deporte` tinyint(4) DEFAULT NULL,"
                + "  `ver_tv` tinyint(4) DEFAULT NULL,"
                + "  `cine` tinyint(4) DEFAULT NULL,"
                + "  `visitar_familia` tinyint(4) DEFAULT NULL,"
                + "  `recreacion_boolean` tinyint(4) DEFAULT NULL,"
                + "  `labores_hogar` tinyint(4) DEFAULT NULL,"
                + "  `actividades_recreativas` varchar(150) DEFAULT NULL,"
                + "  `estudia` tinyint(4) DEFAULT NULL,"
                + "  `que_estudia` varchar(200) DEFAULT NULL,"
                + "  `organizacion_familia` varchar(200) DEFAULT NULL,"
                + "  `comunicacion` varchar(200) DEFAULT NULL,"
                + "  `roles` varchar(150) DEFAULT NULL,"
                + "  `autoridad` varchar(150) DEFAULT NULL,"
                + "  `limites` varchar(150) DEFAULT NULL,"
                + "  `calidad_vida` varchar(200) DEFAULT NULL,"
                + "  `imagen_publica` varchar(200) DEFAULT NULL,"
                + "  `comportamiento_social` varchar(150) DEFAULT NULL,"
                + "  `observaciones` varchar(350) DEFAULT NULL,"
                + "  `nombre_padre` varchar(85) DEFAULT NULL,"
                + "  `nombre_madre` varchar(85) DEFAULT NULL,"
                + "  `nombre_pareja` varchar(85) DEFAULT NULL,"
                + "  `hijos` varchar(45) DEFAULT NULL,"
                + "  PRIMARY KEY (`id_empleado`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `empresa_nivel1` ("
                + "  `id_empresa` int(11) NOT NULL,"
                + "  `nombre_empresa` varchar(45) DEFAULT NULL,"
                + "  PRIMARY KEY (`id_empresa`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `empresa_nivel2` ("
                + "  `id_empresa` int(11) NOT NULL,"
                + "  KEY `Empresa_nivel1-2_idx` (`id_empresa`),"
                + "  CONSTRAINT `Empresa_nivel1-2` FOREIGN KEY (`id_empresa`) REFERENCES `empresa_nivel1` (`id_empresa`) ON DELETE NO ACTION ON UPDATE NO ACTION"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `enlace_empleado_servicio` ("
                + "  `id_empleado` int(11) NOT NULL,"
                + "  `id_servicio` int(11) NOT NULL,"
                + "  KEY `Enlace_Empleado-Servicio_idx` (`id_servicio`),"
                + "  KEY `Enlace_Servicio-Empleado_idx` (`id_empleado`),"
                + "  CONSTRAINT `Enlace_Empleado-Servicio` FOREIGN KEY (`id_servicio`) REFERENCES `servicios_nivel1` (`id_servicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,"
                + "  CONSTRAINT `Enlace_Servicio-Empleado` FOREIGN KEY (`id_empleado`) REFERENCES `empleados_nivel1` (`id_empleado`) ON DELETE NO ACTION ON UPDATE NO ACTION"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + "CREATE TABLE `estados` ("
                + "  `id` int(11) NOT NULL AUTO_INCREMENT,"
                + "  `clave` varchar(2) NOT NULL,"
                + "  `nombre` varchar(45) NOT NULL,"
                + "  PRIMARY KEY (`id`)"
                + ") ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='Tabla de Estados de la República Mexicana';"
                + ""
                + "CREATE TABLE `localidades` ("
                + "  `id` int(11) NOT NULL AUTO_INCREMENT,"
                + "  `municipio_id` int(11) NOT NULL COMMENT 'Relación con municipios',"
                + "  `clave` varchar(4) NOT NULL,"
                + "  `nombre` varchar(110) NOT NULL,"
                + "  `latitud` varchar(6) NOT NULL,"
                + "  `longitud` varchar(7) NOT NULL,"
                + "  `altitud` varchar(4) NOT NULL,"
                + "  PRIMARY KEY (`id`),"
                + "  KEY `municipio_id` (`municipio_id`)"
                + ") ENGINE=MyISAM AUTO_INCREMENT=299639 DEFAULT CHARSET=utf8 COMMENT='Tabla de Localidades de la Republica Mexicana';"
                + ""
                + "CREATE TABLE `municipios` ("
                + "  `id` int(11) NOT NULL AUTO_INCREMENT,"
                + "  `estado_id` int(11) NOT NULL COMMENT 'Relación con estados',"
                + "  `clave` varchar(3) NOT NULL,"
                + "  `nombre` varchar(50) NOT NULL,"
                + "  PRIMARY KEY (`id`),"
                + "  KEY `estado_id` (`estado_id`)"
                + ") ENGINE=MyISAM AUTO_INCREMENT=2493 DEFAULT CHARSET=utf8 COMMENT='Tabla de Municipios de la Republica Mexicana';"
                + ""
                + "CREATE TABLE `servicios_nivel1` ("
                + "  `id_servicio` int(11) NOT NULL,"
                + "  `nombre_servicio` varchar(45) DEFAULT NULL,"
                + "  `id_empresa` int(11) NOT NULL,"
                + "  PRIMARY KEY (`id_servicio`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                + ""
                + "CREATE TABLE `servicios_nivel2` ("
                + "  `id_servicio` int(11) NOT NULL,"
                + "  KEY `Servicios_ nivel1-2` (`id_servicio`),"
                + "  CONSTRAINT `Servicios_ nivel1-2` FOREIGN KEY (`id_servicio`) REFERENCES `servicios_nivel1` (`id_servicio`) ON DELETE NO ACTION ON UPDATE NO ACTION"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
    }
    
}