package cb.platform.test.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@RestController
public class TestService {
	
	@GetMapping("/test")
	public Mono<String> getTest() {
		
		return Mono.just("testResult");
	}
	
	@GetMapping("/test/{id}")
	public Mono<String> getTestWithParam(@PathVariable(name="id") String id) {
		
		return Mono.just("Rest result from ID: " + id);
	}

}
