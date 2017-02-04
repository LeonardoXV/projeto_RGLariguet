package servlets;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;

public class DbManager {
	private Connection conn;
	private PreparedStatement statement;
	
	public void getConnection() throws ClassNotFoundException, SQLException{

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/Lariguet","root","tobegreat");
			this.conn = conn;
			System.out.println("Conex�o realizada com Sucesso");

	}
	
	public void insertBook(String titulo, int numero, String categoria) throws SQLException{
		String sql = "insert into livros (titulo,categoria,qtd_paginas) values (?,?,?)";

			this.statement = this.conn.prepareStatement(sql);
			statement.setString(1,titulo);
			statement.setString(2,categoria);
			statement.setInt(3, numero);
			this.executeSql(sql);
			
	}
	
	private void executeSql(String sql) throws SQLException{
		
		this.statement.executeUpdate();
		
	}
	
	public void closeConnection() throws SQLException{
		this.conn.close();
	}
	
    public ArrayList<String> selectClientes(String query) throws SQLException{
    	
    	this.statement = this.conn.prepareStatement(query);
    	ResultSet result = this.statement.executeQuery();
    	ArrayList<String> array = new ArrayList<String>();
    	
    	while(result.next()){
    		array.add(result.getString("nome"));
    	}
    	
    	return array;
   
	}
}
