package es.vqs.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HibernateUtils {
	private String url = "jdbc:mysql://178.62.217.41/entornos";

	private String user = "root";
	private String pass = "fempa2018";

	public void imprimirNombres() {
		String nombre;
		String sql;
		try (Connection conn = DriverManager.getConnection(this.url, this.user, this.pass);
				Statement stmt = conn.createStatement()) {
			sql = "SELECT nombre FROM alumnos";
			try (ResultSet rs = stmt.executeQuery(sql)) {
				while (rs.next()) {
					nombre = rs.getString("nombre");
					System.out.println("Alumno:" + nombre);
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}