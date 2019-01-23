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
	
	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String AfficherListeTache(Model model) {
		
		model.addAttribute("liste", listeAFS.recupererListe("mes eleves"));
		
		return "liste";
	}
	
	@RequestMapping(value = "/ajout-liste", method = RequestMethod.GET)
	public String GetAjouterTache() {
		
		return "ajout-liste";
	
	}
	
	@RequestMapping(value = "/delete-liste", method = RequestMethod.GET)
	public String GetDeleteTache() {
		
		return "delete-liste";
	
	}
	
	@RequestMapping(value = "/ajout-liste", method = RequestMethod.POST)
	public String PostAjoutTache(@RequestParam String taches) {
		
		listeAFS.ajouterListe("mes eleves", taches, new Date(), false);
		
		return "redirect:liste";
	
	}
	
	@RequestMapping(value = "/delete-liste", method = RequestMethod.POST)
	public String PostDeleteTache(@RequestParam int id) {
		
		listeAFS.supprimerListe(id);
		
		return "redirect:liste";
	
	}
	
}
