package fr.insee.bar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@PropertySource("classpath:application.properties")
public class AccueilController {

	@Value("${name}")
	private String name;

	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public String welcome() {
		return "redirect:/accueil";
	}

	@GetMapping("/accueil")
	public String hello(Model model) {
		model.addAttribute("message", name);
		return "accueil";
	}
}
