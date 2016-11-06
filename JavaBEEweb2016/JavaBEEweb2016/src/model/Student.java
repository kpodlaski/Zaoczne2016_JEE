package model;

public class Student {

	private String imie;
	private String nazwisko;
	private int index;
	private String foto; //path to foto
	
	
	/**
	 * @return the imie
	 */
	public String getImie() {
		return imie;
	}
	/**
	 * @param imie the imie to set
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}
	/**
	 * @return the nazwisko
	 */
	public String getNazwisko() {
		return nazwisko;
	}
	/**
	 * @param nazwisko the nazwisko to set
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Student(String imie, String nazwisko, int index, String foto) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.index = index;
		this.foto = foto;
	}
	
	public Student(){
		this("Jane","Doe",123412,"JaneDoe.jpg");
	}
	
}
