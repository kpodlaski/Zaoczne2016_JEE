package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/hello.html")
	public ModelAndView firstAddres(){
		ModelAndView mv= new ModelAndView("Widok");
		
		return mv;
	}

}
