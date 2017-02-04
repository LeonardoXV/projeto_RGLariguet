package servlets;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/Controle")
public class Controle extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private DbManager db = new DbManager();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		    if(request.getParameter("btnCadastrar")!=null){
		    	this.insertBook(request, response);
		    	response.sendRedirect("http://localhost:8080/Servlet_Lariguet/form.jsp");
		    }
		    else{
		    	response.sendRedirect("http://localhost:8080/Servlet_Lariguet/lista.jsp");
		    }
		    
	}
	
	private void insertBook (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try{
			this.db.getConnection();
			this.db.insertBook(request.getParameter("nome"), Integer.parseInt(request.getParameter("numero")), request.getParameter("categoria"));
			this.db.closeConnection();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> findClientes (){
		ArrayList<String> array = new ArrayList<String>();
		try{
			this.db.getConnection();
			array = this.db.selectClientes("select nome from clientes");
			this.db.closeConnection();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return array;
	}
	
}
