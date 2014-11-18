package org.controldepersonal.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conector {

	/*
	 * Atributos de la clase
	 */
	Connection conexion;
	private static final int RESULTADOSMAX = 99;

	/*
	 * Constructor
	 */
	public conector(String loginUsuario, String loginContrasena, String urlBD) {
		// Paso 1: Obtener valores de la interfaz grafica.
		String[] datosConexion = new String[3];
		datosConexion[0] = urlBD;
		datosConexion[1] = loginContrasena;
		datosConexion[2] = urlBD;
		// Paso 2: Obtener el objeto conexion.
		conexion = dameConexion(datosConexion);
		if (conexion == null) {
			System.out.println("Algo salio mal... :(");
		} else {
			System.out.println("Conectado a la BD correctamente! :D");
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
		Connection conexion = null;
		if (datosConexion.length == 3) {// no vaya a ser que me estes mandando
										// otra cosa.
			if (datosConexion[0].equals("")) {
				System.out
						.println("Error en funcion dameConexion:La cadena Usuario no puede ser campo vacio.");
			} else if (datosConexion[1].equals("")) {
				System.out
						.println("Error en funcion dameConexion:El valor de contrase�a no puede ser Campo vacio.");
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
			e.printStackTrace();
			System.out
					.println("Error en funcion ejecutaQWERTY: error en la creacion de statement;");
		}
		// inicializacion de los resultados.
		ResultSet resultados = null;
		// se ejecuta el qwerty:
		try {
			resultados = statement.executeQuery(qwerty);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out
					.println("Error en funcion ejecutaQWERTY: el qwerty parece estar mal escrito.");
		}
		// se inicializa variable de retorno
		String resultado[] = new String[RESULTADOSMAX];
		// Se almacenan los resultados en la variable de retorno.
                try {
			for (int i = 0; resultados.next(); i++) {
				resultado[i] = resultados.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out
					.println("Error en funcion ejecutaQWERTY: No se pudo almacenar el resultado en variable.");
		}
		return resultado;
	}
}
