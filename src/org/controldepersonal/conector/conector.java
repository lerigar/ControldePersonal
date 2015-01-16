package org.controldepersonal.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.controldepersonal.HasMaps.Elemento;

public class conector {
    /*
     * Atributos de la clase
     */

    private static final int RESULTADOSMAX = 999;
    Connection conexion;
    private boolean estaVivo;
    Exception ecepcion;
    MySQL libreriaSQL;
    /*
     * Constructor
     */

    public conector(String loginUsuario, String loginContrasena, String IPServidor) {
        estaVivo = false;
        //DEBUG - Para hacer testing localmente.
        String urlBD = "jdbc:mysql://" + IPServidor + "/controldepersonal";
        System.out.println("Usuario:" + loginUsuario);
        System.out.println("Contrasena:" + loginContrasena);
        // Paso 1: Obtener valores de la interfaz grafica.
        String[] datosConexion = new String[3];
        datosConexion[0] = urlBD;
        datosConexion[1] = loginUsuario;
        datosConexion[2] = loginContrasena;
        // Paso 2: Obtener el objeto conexion.
        conexion = dameConexion(datosConexion);
        if (conexion == null) {
            System.out.println("Algo salio mal... :(");
            estaVivo = false;
        } else {
            System.out.println("Conectado a la BD correctamente! :D");
            libreriaSQL = new MySQL(conexion);
            estaVivo = true;
        }
    }
    /*
     * Funcion "getter" que devuelve un objeto de tipo "Connection"
     * proporcionado por la libreria DriverManager la cual administra los
     * drivers para conectarse a los diferentes motores de base de datos. Este
     * sistema usa por default mySQL. El arreglo de datos de conexion en 0=url
     * de la BD, 1=usuario y 2=contrase�a. NOTA: Siempre al usar esta funcion,
     * validar que el objeto "conexion" sea diferente a NULL.
     */

    private Connection dameConexion(String[] datosConexion) {
        conexion = null;
        if (datosConexion.length == 3) {// no vaya a ser que me estes mandando
            // otra cosa.
            if (datosConexion[0].equals("")) {
                ecepcion = new Exception("Error en funcion dameConexion:La cadena Usuario no puede ser campo vacio.");
            } else if (datosConexion[1].equals("")) {
                ecepcion = new Exception("Error en funcion dameConexion:El valor de contrasena no puede ser Campo vacio.");
            } else if (datosConexion[2].equals("")) {
                ecepcion = new Exception("Error en funcion dameConexion:No se ha indicado ruta de la BD, llego en blanco.");
            } else {
                try {
                    DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
                } catch (Exception e) {
                    ecepcion = e;
                }
                // Se procede con la instaciacion del conector
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    ecepcion = e;
                }
                try {
                    conexion = DriverManager.getConnection(datosConexion[0],
                            datosConexion[1], datosConexion[2]);
                } catch (Exception e) {
                    ecepcion = e;
                }
            }
        }
        return conexion;
    }
    /*
     * Funcion basica y creada para el testing y desarrollo del sistema. Se
     * ingresa directamente el qwerty como cadena y regresando cualquier valor a
     * cadena. NOTA: solo regresa el valor de 1 columna.
     */

    public String[] ejecutaQWERTY(String qwerty) {
        java.sql.Statement statement = null;
        try {
            statement = conexion.createStatement();
        } catch (SQLException e) {
            ecepcion = e;
        }
        // inicializacion de los resultados.
        ResultSet resultados = null;
        // se ejecuta el qwerty:
        try {
            resultados = statement.executeQuery(qwerty);
        } catch (SQLException e) {
            ecepcion = e;
        }
        // se inicializa variable de retorno
        String resultado[] = new String[RESULTADOSMAX];
        // Se almacenan los resultados en la variable de retorno.
        try {
            for (int i = 0; resultados.next(); i++) {
                resultado[i] = resultados.getString(1);
            }
        } catch (SQLException e) {
            ecepcion = e;
        }
        return resultado;
    }
    /*
     *Funcion getter que devuelve true si hay conexion a la BD, false de lo contratio.
     */

    public boolean estasVivo() {
        return estaVivo;
    }
    /*
     Funcion que devuelve la ultima excepcion ocurridad en la clase.
     */

    public Exception dameExcepcion() {
        return ecepcion;
    }
    /*
     Funcion que devuelve un String[] de los estados de la republica.
     */

    public String[] dameEstadosRepublica() {
        // Los parametros son: Tabla, columna (es la tercera)
        return libreriaSQL.dameArregloString("Estados", "nombre");
    }
    /*
     Busqueda anidada que obtiene el String[] de los municiops del estado dado por parametro.
     */

    public Object[] dameMunicipios(String estado) {
        // Los parametros son: Tabla, columna y condicion
        return libreriaSQL.dameArregloString("municipios m, estados e WHERE m.estado_id=e.id"
                + " AND e.nombre='" + estado + "'", "m.nombre ");
    }

    public Elemento dameDatosElemento(int numeroElemento) {
        return libreriaSQL.obtenDatos(new Elemento(), numeroElemento);
    }
    
    public String[] dameClientes(){
        return libreriaSQL.dameArregloString("empresa_nivel1", "nombre_empresa");
    }
    
    public String[] dameElementos(){
        return libreriaSQL.dameArregloString("empleados_nivel1", "nombre_empleado");
    }
    
    public Object[] dameServicios(String cliente){
        return libreriaSQL.dameArregloString("empresa_nivel1,servicios_nivel1 where empresa_nivel1.id_empresa=servicios_nivel1.id_empresa and empresa_nivel1.nombre_empresa='"+cliente+"'", "servicios_nivel1.nombre_servicio");
    }
    
    public Object[] dameElemento(String servicio){
        return libreriaSQL.dameArregloString("empleados_nivel1,servicios_nivel1 where empleados_nivel1.id_servicios=servicios_nivel1.id_servicio and servicios_nivel1.nombre_servicio='"+servicio+"'", "empleados_nivel1.nombre_empleado");
    }
    
    public String[] dameAsistenciaElementos(){
        return libreriaSQL.dameArregloString("empleados_nivel1", "nombre_empleado");
    }
    
    public boolean guardaDatosElemento(Elemento elementoNuevo) {
        return libreriaSQL.guardaElementoNuevo(elementoNuevo);
    }
    
    /*     *******************************               CAMBIOS MIOS DE MI              */
    
    public int buscaIDElemento(String nombre){
        return libreriaSQL.buscaIDElemento(nombre);
    }
    
    public boolean registraAsistencia(int id_empleado,String fecha,String Asistencia){
        return libreriaSQL.registraAsistencia(id_empleado, fecha, Asistencia);
    }
    
    public String[] dameElementos(String servicio){
        int id_servicio = libreriaSQL.buscaIDServicio(servicio);
        System.out.println(id_servicio);
        return libreriaSQL.dameArregloString("empleados_nivel1,enlace_empleado_servicio where enlace_empleado_servicio.id_servicio="+id_servicio+" and enlace_empleado_servicio.id_empleado=empleados_nivel1.id_empleado ", "empleados_nivel1.nombre_empleado");
    }
    
    public boolean justificaAsistencia(int id_elemento,String fecha,String Asistencia){
        return libreriaSQL.registraAsistencia(id_elemento, fecha, Asistencia);
    }

}
