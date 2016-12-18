package model;

import java.util.ArrayList;
import java.util.List;

public class BazaOsob {

	private List<Person> osoby = new ArrayList<Person>();
	
	public List<Person> getAll(){
		return osoby;
	}
	
	public Person getOsoba(int id){
		if (id>osoby.size()-1) return null;
		return osoby.get(id);
	}
	
	public Person addOsoba(Person p){
		p.setId(osoby.size());
		osoby.add(p);
		return p;
	}
	
	public Person updateOsoba(Person p){
		if (p.id>osoby.size()-1) return addOsoba(p); 
		Person pOrig = osoby.get(p.id);
		pOrig.setImie(p.imie);
		pOrig.setNazwisko(p.nazwisko);
		return pOrig;
	}
	
	public boolean deleteOsoba(int id){
		Person o = osoby.remove(id);
		return o==null; 
	}
	
	public BazaOsob(){
		addOsoba(new Person("Anna","Maj"));
		addOsoba(new Person("Tomasz","Kwiecieñ"));
	}
}
