package ian.mvc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão	aberta!");
		connection.close();

	}

}
