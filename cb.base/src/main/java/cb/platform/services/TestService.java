package cb.platform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cb.platform.contract.ILogger;
import cb.platform.services.test.UserService;

@RestController
public class TestService {

	@Autowired
	UserService service;
	
	@Autowired
	ILogger _logger;
	
	@GetMapping(path = "/test")
	public String getTest() {
		_logger.WriteInfo("Call made to test");
		return "TestUser";
	}
}
