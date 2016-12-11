package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.model.*;

public class TestJPA {
	public static void main(String[] a){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracownicyDBJPA");
		EntityManager em = emf.createEntityManager();
		Osoba o =  em.find(Osoba.class, 2L);
		System.out.println(o.getImie()+" "+o.getNazwisko());
		System.out.println(o.getJednostki().get(0).getNazwa());
		System.out.println("======================");
		Jednostka j = em.find(Jednostka.class, 1L);
		System.out.println(j);
		System.out.println(j.getOsoby());
		System.out.println("======================");		
		List<Jednostka> jednostki = em.createNamedQuery("Jednostka.findAll").getResultList();
		System.out.println(jednostki);
		System.out.println("======================");
		Query nQ =  em.createNamedQuery("Jednostka.findByNazwa");
		nQ.setParameter("nazwa", "Lab");
		jednostki = nQ.getResultList();
		System.out.println(jednostki);
		if (jednostki.size()>0) {
				j = jednostki.get(0);
				em.getTransaction().begin();
				j.setNazwa("Laboratorium");
				em.getTransaction().commit();
		}
		Jednostka j2 = new Jednostka();
		j2.setNazwa("Magazyn");
		System.out.println(j.getId());		
		em.getTransaction().begin();
		em.persist(j2);
		//j2.setOsoby(j.getOsoby());
		em.getTransaction().commit();
		System.out.println(j.getId());		
		jednostki = em.createNamedQuery("Jednostka.findAll").getResultList();
		System.out.println(jednostki);
		System.out.println("=====================");
		em.close();
		emf.close();
	}
}
