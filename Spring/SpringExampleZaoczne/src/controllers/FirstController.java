package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/hello/{imie},{nazwisko}")
	public ModelAndView firstAddres(@PathVariable String imie, @PathVariable String nazwisko){
		ModelAndView mv= new ModelAndView("Widok");
		mv.addObject("info","Krótka informacja"+imie+nazwisko);
		return mv;
	}

}
