package cb.platform.services.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cb.platform.contract.annotations.TrackExecutionTime;
import cb.platform.logger.ILogger;

@RestController
@Configuration
public class UserService {

	@Autowired
	ILogger _logger;
	
	@GetMapping(path = "/user")
	@TrackExecutionTime
	public String getTest() {
		_logger.WriteInfo("Called getTest method");
		return "another user service";
	}
}
