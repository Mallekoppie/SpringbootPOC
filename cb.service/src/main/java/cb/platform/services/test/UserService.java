package cb.platform.services.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class UserService {

	@GetMapping(path = "/user")
	public String getTest() {
		return "another user service";
	}
}
