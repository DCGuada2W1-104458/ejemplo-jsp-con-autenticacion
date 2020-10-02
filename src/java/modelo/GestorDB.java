/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mnava
 */
public class GestorDB {

	private Connection con;
	private final String CON_STR = "jdbc:sqlserver://LAPTOP-0CRE86U4\\SQLEXPRESS:1433;databaseName=Gestoria";
	private final String USER = "sa";
	private final String PASS = "123456";

	private void abrirConexion() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			con = DriverManager.getConnection(CON_STR, USER, PASS);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void cerrarConexion() {
		try {

			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<Servicio> obtenerServicios() {
		ArrayList<Servicio> lista = new ArrayList<Servicio>();
		try {
			abrirConexion();
			String sql = "select * from Servicios";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String tipo = rs.getString("tipo");
				String descripcion = rs.getString("descripcion");
				double costo = rs.getFloat("costo");
				lista.add(new Servicio(id, tipo, descripcion, costo));
			}
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return lista;
	}

	public boolean insertarServicio(Servicio servicio) {
		boolean inserto = false;
		try {
			abrirConexion();
			String sql = "INSERT INTO Servicios (tipo, descripcion, costo) VALUES (?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, servicio.getTipo());
			st.setString(2, servicio.getDescripcion());
			st.setDouble(3, servicio.getCosto());
			st.execute();
			inserto = true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return inserto;
	}
}
