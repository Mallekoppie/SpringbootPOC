package cb.platform.test.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestService {
	
	@GetMapping("/test")
	public Mono<String> getTest() {
		
		return Mono.just("testResult");
	}

}
