package jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STANOWISKA database table.
 * 
 */
@Entity
@NamedQuery(name="Stanowiska.findAll", query="SELECT s FROM Stanowiska s")
public class Stanowiska implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STANOWISKA_ID_GENERATOR", sequenceName="STANOWISKA_ID_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STANOWISKA_ID_GENERATOR")
	private long id;

	private String nazwa;

	public Stanowiska() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}