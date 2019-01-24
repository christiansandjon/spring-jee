package com.smc.listes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListeAFS {
	
	private static List<ListeAF> liste = new ArrayList<ListeAF>();
	public static int totalListed = 3; 

	
	static {
		liste.add(new ListeAF(1,"mes eleves","apprendre jee", new Date(), false));
		liste.add(new ListeAF(2,"mes eleves","continuer apprendre jee", new Date(), false));
		liste.add(new ListeAF(3,"mes eleves","pratiquer jee", new Date(), false));		
	}
	
	// recuperer liste 
	public List<ListeAF> recupererListe(String user){
		List<ListeAF> listeVide = new ArrayList<ListeAF>();
			for (ListeAF elements : liste) {
				if(elements.getUser().equals(user)) {
					listeVide.add(elements);
				}
			}
		return listeVide;
	}
	
	// ajouter liste 
	public void ajouterListe(String user, String taches, Date date, boolean estEffectuee) {
		liste.add(new ListeAF(++totalListed,user,taches,date,estEffectuee));
	}
	
	// supprimer liste 
	
	public void supprimerListe (int id) {
		Iterator<ListeAF> it = liste.iterator();
		while(it.hasNext()) {
			ListeAF list = it.next();
			if(list.getId() == id) {
				it.remove();
			}
		}
	}
}
