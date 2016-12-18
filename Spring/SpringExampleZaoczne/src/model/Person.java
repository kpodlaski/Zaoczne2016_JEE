package model;


public class Person {
	int id;
	String imie;
	String nazwisko;
	
	
	public Person(){}
	public Person(String imie, String nazwisko){
		this.imie=imie;
		this.nazwisko = nazwisko;
	}
	public Person(int id, String imie, String nazwisko){
		this.id=id;
		this.imie=imie;
		this.nazwisko = nazwisko;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
