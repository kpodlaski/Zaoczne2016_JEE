package controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Person;

@Controller
public class FirstController {
	
	@RequestMapping(path = "/hello/{imie},{nazwisko}", method = RequestMethod.GET)
	public ModelAndView firstAddres(@PathVariable String imie, @PathVariable String nazwisko){
		ModelAndView mv= new ModelAndView("Widok");
		mv.addObject("info","Krótka informacja"+imie+nazwisko);
		return mv;
	}

	@RequestMapping(path = "/hello/{imie},{nazwisko}", method = RequestMethod.POST )
	public Person firstAddresPOST(@PathVariable String imie, @PathVariable String nazwisko){
		Person p = new Person();
		p.setImie(imie);
		p.setNazwisko(nazwisko);
		
		return p;
	}
	
	@RequestMapping(path = "/hello/{imie},{nazwisko}", method = RequestMethod.PUT)
	public Object firstAddresPUT(@PathVariable String imie, @PathVariable String nazwisko){
		Person p = new Person();
		p.setImie(imie);
		p.setNazwisko(nazwisko);
		
		return p;
	}
	
}
