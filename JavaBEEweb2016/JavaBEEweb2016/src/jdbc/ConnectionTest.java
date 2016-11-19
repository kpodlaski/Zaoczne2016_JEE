package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		ClassLoader.getSystemClassLoader().loadClass("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.16.80.11:1521:orcl",
				"sys as SYSDBA","oracle");
		Statement st  = con.createStatement();
		st.execute("SELECT id,nazwa FROM Jednostka");
		ResultSet rs = st.getResultSet();
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString("nazwa");
			System.out.println(id + " :: "+name);
		}
		
	}

}
