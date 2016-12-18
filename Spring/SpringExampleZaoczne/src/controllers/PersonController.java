package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.BazaOsob;

@Controller
public class PersonController {

	@Autowired
	private BazaOsob bazaOsob;
	
	@RequestMapping(path="/person", method=RequestMethod.GET)
	public ModelAndView getAll(){
		ModelAndView mv = new ModelAndView("Spis");
		mv.addObject("osoby", bazaOsob.getAll());
		return mv;
	}
	
	
	@RequestMapping(path="/person/{id}", method=RequestMethod.GET)
	public ModelAndView getOsoba(@PathVariable int id){
		ModelAndView mv = new ModelAndView("Osoba");
		mv.addObject("osoba", bazaOsob.getOsoba(id));
		return mv;
	}
	
}
