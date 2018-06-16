package cb.platform.base;

import static org.junit.Assert.*;

import org.junit.Test;

import cb.platform.logger.Logger;

public class LoggerTest {

	@Test
	public void writeInfoTest() {
		
		var logger = new Logger();
		logger.WriteInfo("Test message");		
	}

}
