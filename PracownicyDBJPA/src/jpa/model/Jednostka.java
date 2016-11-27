package jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the JEDNOSTKA database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name="Jednostka.findAll", query="SELECT j FROM Jednostka j"),
		@NamedQuery(name="Jednostka.findByNazwa", query="SELECT j FROM Jednostka j WHERE j.nazwa LIKE :nazwa")}
)
public class Jednostka implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="JEDNOSTKA_ID_GENERATOR", sequenceName="JEDNOSTKA_ID_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="JEDNOSTKA_ID_GENERATOR")
	private long id;

	private String nazwa;

	//bi-directional many-to-many association to Osoba
	@ManyToMany(mappedBy="jednostki")
	private List<Osoba> osoby;

	public Jednostka() {
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

	public List<Osoba> getOsoby() {
		return this.osoby;
	}

	public void setOsoby(List<Osoba> osoby) {
		this.osoby = osoby;
	}

	public String toString(){
		return nazwa;
	}
}