package cb.platform.test.filters;

import java.util.Iterator;

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
		
		var result = chain.filter(exchange);
		
		return result;
	}

}
