package cb.platform.test.services;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import cb.platform.test.annotations.AlertOnLongExecutionTime;
import reactor.core.publisher.Mono;

@Component
public class UserService {
	
	@GetMapping("/user")
	@AlertOnLongExecutionTime
	public Mono<ServerResponse> getUser(ServerRequest request){
		return ServerResponse.ok().body(BodyInserters.fromObject("Reactive user"));
	}

}
