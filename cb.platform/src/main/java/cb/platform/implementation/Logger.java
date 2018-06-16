package cb.platform.implementation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cb.platform.contract.ILogger;

@Configuration
public class Logger implements ILogger {
	
	public Logger() {
		
	}
	
	@Override
	public void WriteInfo(String message) {
		System.out.println(String.format("INFO: %s", message));
		
	}

	@Override
	public void WriteWarn(String message) {
		System.out.println(String.format("INFO: %s", message));
		
	}

	@Override
	public void WriteError(String message) {
		System.out.println(String.format("INFO: %s", message));
		
	}

}
