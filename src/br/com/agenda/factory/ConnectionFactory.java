package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//nome do usu�rio
	private static final String USERNAME = "root";
	
	//senha do banco
	private static final String PASSWORD = "12123232";
	
	//caminho
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	//Conex�o com o db
	public static Connection createConnectionToMySQL() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		
		//recupera conex�o
		Connection con = createConnectionToMySQL();
		
		if(con!= null) {
			System.out.println("Conex�o obtida com sucesso");
			con.close();
		}
	}
}
