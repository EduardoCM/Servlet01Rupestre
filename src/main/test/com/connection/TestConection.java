package com.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import connection.DBConnection;

class TestConection {

	@Test
	public void intert() {
		DBConnection dbConnection = new DBConnection();
		String sql = "INSERT INTO libros (id, titulo, genero, autor, copias, novedad) VALUES(21, \"Don Quijote\", \"Despertar\", \"Miguel Cerventes\", 10, 0)";
		Connection connection = dbConnection.getConnection();		
		Assert.assertNotNull(dbConnection);
	}
	
	@Test
	public void update() throws SQLException {
		DBConnection dbConnection = new DBConnection();
		String sql = "UPDATE libros SET genero = 'Ficcion' WHERE id = 21";	
		Statement st = dbConnection.getConnection().createStatement();
		ResultSet resultado = st.executeQuery(sql);
		
		
		
		String sqlSelect = "SELECT * FROM libros where id = 21";
		
		Statement stSelect = dbConnection.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sqlSelect);
		
		
		while(rs.next()) {
			String genero = rs.getString("genero");
			Assert.assertEquals("Ficcion", genero);
		}
		
	}
	
	public void listarLibros() {
		DBConnection conn = new DBConnection();
		
	}
	
	

}
