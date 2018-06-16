package cb.platform.test.reactiveRest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class UserRouter {

	@Bean
	public RouterFunction<ServerResponse> route(UserService userService) {
		return RouterFunctions.route(RequestPredicates.GET("/user"), userService::getUser);
	}
}
