package libreria;

import java.sql.Connection;
import java.sql.DriverManager;

public class conector {
/*
 * Atributos de la clase
 */
	Connection conexion;
/*
 * Constructor
 */
	public conector(String loginUsuario, String loginContraseña, String urlBD) {
		// Paso 1: Obtener valores de la interfaz grafica.
		String[] datosConexion = new String[3];
		datosConexion[0] = urlBD;
		datosConexion[1] = loginContraseña;
		datosConexion[2] = urlBD;
		// Paso 2: Obtener el objeto conexion.
		conexion = dameConexion(datosConexion);
		System.out.println("Conectado a la BD correctamente! :D");
	}

/*
 * Funcion "getter" que devuelve un objeto de tipo "Connection" proporcionado
 * por la libreria DriverManager la cual administra los drivers para conectarse
 * a los diferentes motores de base de datos.
 * Este sistema usa por default mySQL.
 * El arreglo de datos de conexion en 0=url de la BD, 1=usuario y 2=contraseña.
 * NOTA: Siempre al usar esta funcion, validar que el objeto "conexion" sea diferente a NULL.
 */
	public Connection dameConexion(String[] datosConexion) {
		Connection conexion = null;
		if (datosConexion.length == 3) {// no vaya a ser que me estes mandando
										// otra cosa.
			if (datosConexion[0].equals("")) {
				System.out
						.println("Error en funcion dameConexion:La cadena Usuario no puede ser campo vacio.");
			} else if (datosConexion[1].equals("")) {
				System.out
						.println("Error en funcion dameConexion:El valor de contraseña no puede ser Campo vacio.");
			} else if (datosConexion[3].equals("")) {
				System.out
						.println("Error en funcion dameConexion:No se ha indicado ruta de la BD, llego en blanco.");
			} else {
				try {
					DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
				} catch (Exception e) {
					System.out
							.println("Error en funcion dameConexion: no se pudo registrar driver.");
				}
				// Se procede con la instaciacion del conector
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.out
							.println("Error en funcion dameConexion: Clase no encontrada.");
				}
				try {
					conexion = DriverManager.getConnection(datosConexion[0],
							datosConexion[1], datosConexion[2]);
				} catch (Exception e) {
					e.printStackTrace();
					System.out
							.println("Error en funcion dameConexion: no se pudo obtener conexion.");
				}
			}
		}
		return conexion;
	}

}
