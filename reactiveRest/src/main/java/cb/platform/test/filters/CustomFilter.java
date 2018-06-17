package cb.platform.test.filters;

import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Component
public class CustomFilter implements WebFilter {

	private void log(String text) {
		System.out.println(text);
	}
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		
		log("Executing filter");
	
		ServerHttpRequest request = exchange.getRequest();
		log(request.getPath().toString());
		
		//exchange.getResponse().setStatusCode(HttpStatus.SERVICE_UNAVAILABLE);
		
		
		Mono<Void> first = Mono.first(chain.filter(exchange));
				
		log("end");
		
		return first;
	}

}
