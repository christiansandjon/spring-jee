package com.smc.listes;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("login")
public class ListeController {
	
	@Autowired
	ListeAFS listeAFS;
	
	// afficher liste 
	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String AfficherListeTache(Model model) {
		
		model.addAttribute("liste", listeAFS.recupererListe("mes eleves"));
		
		return "liste";
	}
	
	// ajouter tache get
	@RequestMapping(value = "/ajout-liste", method = RequestMethod.GET)
	public String AjouterTache() {
		
		return "ajout-liste";
	
	}
	
	// ajouter tache Post 
	@RequestMapping(value = "/ajout-liste", method = RequestMethod.POST)
	public String AjouterTache(@RequestParam String taches) {
		
		listeAFS.ajouterListe("mes eleves", taches, new Date(), false);
		
		return "redirect:liste";
	
	}
	
	// supprimer tache 
	@RequestMapping(value = "/delete-liste", method = RequestMethod.GET)
	public String SupprimerTache(@RequestParam int id) {
		
		listeAFS.supprimerListe(id);
		
		return "redirect:liste";
	
	}
	
}
