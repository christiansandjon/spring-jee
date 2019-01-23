package com.smc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.smc.beans.ValidPassword;

@Controller
@SessionAttributes("login")
public class MainController {

	@Autowired
	ValidPassword vp;

	@RequestMapping("/")
	public String homePage() {
		return "connexion";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String PostMethod(@RequestParam String login, @RequestParam String password, Model model) {

		boolean valid = vp.isValid(login, password);

		if (valid) {
			model.addAttribute("login", login);
			model.addAttribute("password", password);
			return "home";
		}
		
		else {
			model.addAttribute("erreur", "login ou mot de passe invalide");
			return "connexion";
		}

	}

}
