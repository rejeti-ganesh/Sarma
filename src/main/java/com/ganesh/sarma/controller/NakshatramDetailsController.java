package com.ganesh.sarma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganesh.sarma.dto.PontanaRequestDTO;
import com.ganesh.sarma.service.NakshatramDetailsService;

@Controller
@RequestMapping("/nakshatram")
public class NakshatramDetailsController {

	@Autowired
	NakshatramDetailsService nakshatramDetailsService;
	
	private static Logger logger = LoggerFactory.getLogger(NakshatramDetailsController.class);
	
	@GetMapping("/ponthana")
	  public String ponthanaForm(Model model) {
	    model.addAttribute("pontanaRequestDTO", new PontanaRequestDTO());
	    model.addAttribute("Nakshatrams", nakshatramDetailsService.getNakshatrams());
	    logger.info("opening ponthana form");
	    return "ponthanaRequest";
	}
	
	@PostMapping("/ponthana")
	public String getNakshatramDetails(@ModelAttribute PontanaRequestDTO pontanaRequestDTO, Model model) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		model.addAttribute("Ponthana", nakshatramDetailsService.getPonthanalu(pontanaRequestDTO));
		logger.info("Getting Ponthanalu Comparision Details");
		return "ponthanaResponse";
	}
	
}
