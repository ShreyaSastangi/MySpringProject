package com.springboot.springbootfirstapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shreya
 *
 */
@RestController
public class welcomecontroller {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my first springboot project !!";
		
				
	}

}

