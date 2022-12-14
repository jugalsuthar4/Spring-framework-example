package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
     
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home controller method");
		model.addAttribute("name","Deepak Suthar");
		//it returns page name or view name;
		
		List<String> friends=new ArrayList<String>();
		friends.add("jay");
		friends.add("sanket");
		friends.add("suthar");
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
    public String about() {
		System.out.println("about controller");
		return "about";	
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help controller");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","LOKESH KUMAR");
		modelAndView.addObject("city","Mumbai");
		modelAndView.setViewName("help");
		
		
		//marks
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		
		modelAndView.addObject("marks",list);
		return modelAndView;
	}
	
}
