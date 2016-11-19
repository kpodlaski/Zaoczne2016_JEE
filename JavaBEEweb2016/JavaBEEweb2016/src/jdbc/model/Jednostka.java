package jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Jednostka {
	private int id;
	private String nazwa;
	private List<Osoba> pracownicy = new ArrayList<>();
	
	public Jednostka() {}
	public Jednostka(int id, String nazwa){
		this.id=id;
		this.nazwa = nazwa;
	}
	
	public static Jednostka getFormResultSet(ResultSet rs) throws SQLException{
		Jednostka j = new Jednostka();
		j.id = rs.getInt("id");
		j.nazwa = rs.getString("nazwa");
		ResultSet rs2 = rs.getStatement().executeQuery("SELECT * FROM Osoba, Os_Jedn_Lnk WHERE id_osoba = id AND id_jedn="+j.id);
		j.pracownicy.add(Osoba.getOsobaFromResultSet(rs2));
		rs2.close();
		return j;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(" ");
		sb.append(nazwa);
		sb.append("\npracownicy:\n");
		for (Osoba o : pracownicy){
			sb.append("\t");
			sb.append(o);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
}
