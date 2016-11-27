package jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OSOBA database table.
 * 
 */
@Entity
@NamedQuery(name="Osoba.findAll", query="SELECT o FROM Osoba o")
public class Osoba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OSOBA_ID_GENERATOR", sequenceName="OSOBA_ID_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OSOBA_ID_GENERATOR")
	private long id;

	private String fotka;

	private String imie;

	private String nazwisko;

	@Temporal(TemporalType.DATE)
	private Date wiek;

	//uni-directional many-to-one association to Stanowiska
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="STANOWISKO")
	private Stanowiska stanowisko;

	//bi-directional many-to-many association to Jednostka
	@ManyToMany
	@JoinTable(
		name="OS_JEDN_LNK"
		, joinColumns={
			@JoinColumn(name="ID_OSOBA")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_JEDN")
			}
		)
	private List<Jednostka> jednostki;

	public Osoba() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFotka() {
		return this.fotka;
	}

	public void setFotka(String fotka) {
		this.fotka = fotka;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Date getWiek() {
		return this.wiek;
	}

	public void setWiek(Date wiek) {
		this.wiek = wiek;
	}

	public Stanowiska getStanowisko() {
		return this.stanowisko;
	}

	public void setStanowisko(Stanowiska stanowisko) {
		this.stanowisko = stanowisko;
	}

	public List<Jednostka> getJednostki() {
		return this.jednostki;
	}

	public void setJednostki(List<Jednostka> jednostki) {
		this.jednostki = jednostki;
	}
	
	public String toString(){
		return imie + " " + nazwisko;
	}

}