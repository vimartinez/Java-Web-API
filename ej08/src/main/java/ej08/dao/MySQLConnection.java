package ej08.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface MySQLConnection {
	
	default Connection conectarBD() {
		Connection conexion = null;
		String url = "jdbc:mysql://localhost:3306/jwa";
		String usr = "root";
		String clave = "";
		
		try {
			conexion = DriverManager.getConnection(url,usr,clave);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
		
	}

}
