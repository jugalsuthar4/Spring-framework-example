package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmv.service.UserService;
import springmvc.model.User;
import springmv.service.UserService;
@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header","learn code with jugal");
		model.addAttribute("desc","it is spring framework");
	}
   
	@RequestMapping("/contact")
	public String showForm(Model model) {
		
		//model.addAttribute("Header","Learn code with Jugal");
		
		return "contact";
				
	}
	
/*	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, 
			@RequestParam("username") String username,
			@RequestParam("password") String password,Model model) {
		
		User user=new User();
		
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		
		System.out.println(user);
		
		/*System.out.println("email is  : "+email);
		System.out.println("username is : "+username);
		System.out.println("password is : "+password);
		model.addAttribute("name",username);
		model.addAttribute("email",email);
		model.addAttribute("password",password);*/
		
		//model.addAttribute("user",user);
		//return "success";
//	}
//*/
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		//model.addAttribute("user")
		
		//it will send data to view as well automatically
		
	/*	model.addAttribute("Header","learn code with jugal");
		model.addAttribute("desc","it is spring framework");*/
		
		this.userService.createUser(user);
		System.out.println(user);
		return "success";
	}
	
}
