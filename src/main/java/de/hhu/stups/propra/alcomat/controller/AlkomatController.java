package de.hhu.stups.propra.alcomat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.hhu.stups.propra.alcomat.model.Person;

@Controller
@RequestMapping(path = "/")
public class AlkomatController {


	@GetMapping(path = "/")
	public String showForm(Model model) {
		model.addAttribute("person", null);
		return "rechner"; // show the empty Template rechner.html
	}


	@PostMapping(path = "/")
	public String processForm(@ModelAttribute Person person, Model model) {
		model.addAttribute("person", person);
		return "rechner"; // show the filled Template rechner.html
	}
}
