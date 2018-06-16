package cb.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cb.platform.services.test.UserService;

@SpringBootApplication
@ComponentScan
public class BaseApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}
}
