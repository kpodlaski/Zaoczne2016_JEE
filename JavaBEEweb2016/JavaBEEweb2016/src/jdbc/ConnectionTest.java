package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Jednostka;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		ClassLoader.getSystemClassLoader().loadClass("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.16.80.11:1521:orcl",
				"sys as SYSDBA","oracle");
		Statement st  = con.createStatement();
		st.execute("SELECT id,nazwa FROM Jednostka");
		ResultSet rs = st.getResultSet();
		List<Jednostka> jednostki = new ArrayList<>();
		while(rs.next()){
			jednostki.add(Jednostka.getFormResultSet(rs));
		}
		rs.close();
		st.close();
		con.close();
		System.out.println(jednostki);
	}

}
