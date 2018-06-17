package cb.platform.test.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestService {
	
	@GetMapping("/test")
	public Mono<String> getTest() {
		
		return Mono.just("testResult");
	}
	
	@GetMapping("/test/{id}")
	public Mono<ResponseEntity<String>> getTestWithParam(@PathVariable(name="id") String id) {
		
		
		
		return Mono.just(new ResponseEntity<String>("Rest result from ID: " + id, HttpStatus.ACCEPTED));
	}

}
