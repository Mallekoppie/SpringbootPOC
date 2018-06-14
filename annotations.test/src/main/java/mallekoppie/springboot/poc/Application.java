package mallekoppie.springboot.poc;

import java.lang.annotation.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		checkAnnotations();
	}
	
	private static void checkAnnotations(){
		Class<TestService> test = TestService.class;
		
		Annotation[] annotations = test.getAnnotations();
		
		for (Annotation annotation : annotations) {
			System.out.println("Annotation name: " + annotation.toString());
			
			System.out.println(annotation.annotationType());
			
			if (annotation.annotationType() == ServiceInfo.class){
				ServiceInfo info = (ServiceInfo)annotation;
				
				System.out.println("Service name: " +  info.serviceName());
				System.out.println("Port number: " + info.portNumber());
			}
		}
	}
}
