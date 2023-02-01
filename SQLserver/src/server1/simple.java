package server1;

import java.sql.*;

public class simple {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String connectionUrl = "jdbc:sqlserver://ISCHLAPHP21507\\SQLEXPRESS//localhost:1433;databaseName=protect";
//		String connectionUrl = "jdbc:sqlserver://localhost:1433;"+"databaseName=protect;integratedSecurity=true;";//ISCHLAPHP21507\\SQLEXPRESS
//		String username = "surendra";
//		String password = "Suri@1903";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("connection established");
			
			String SQL = "SELECT * FROM Employee";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				System.out.println(rs.getString(1)+ " " +rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
