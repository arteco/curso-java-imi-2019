
package es.imi.shop.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import es.imi.shop.component.SimpleComponent;

@Controller
public class HomeController {

	@Autowired
	SimpleComponent simpleComponent;
	
	@RequestMapping("")
	public String home(Model model) {
		// java.util.List<String> listaMensajes2 = new LinkedList<>();
		List<String> listaMensajes = new ArrayList<>();
		listaMensajes.add("Mensaje 1");
		listaMensajes.add("Mensaje 2");
		listaMensajes.add("Mensaje 3");
		
		model.addAttribute("mensaje", "Hola Mundo!");
		model.addAttribute("mensajes", listaMensajes);
		return "home";
	}
	
	
}
