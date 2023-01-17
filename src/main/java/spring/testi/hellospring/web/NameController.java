package spring.testi.hellospring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class NameController {
	// not working
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	public String locationAndName(@RequestParam(name="location", required=false, defaultValue="Moon") String location, 
	@RequestParam(name="name",required=false, defaultValue="John") String name) {
		return "Welcome to the " + location  + " " + name + "!";
	}

}
