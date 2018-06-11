package mallekoppie.springboot.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mallekoppie.springboot.poc.model.User;

@RestController
public class UserController {
	
	@RequestMapping("/")
	public String getIndex(){
		return "Test";
	}
	
	@GetMapping(path="/user")
	public User getUser(){
		return new User("myName", "mySurname");
	}

}
