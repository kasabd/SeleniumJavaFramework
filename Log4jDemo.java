package DemoLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please lo this statement ");
		logger.info("This is information message");
		logger.error("This is an error that showed up");
		logger.warn("This is a warning message  that showed up");
		logger.fatal("This is a fatal error that showed up");
		System.out.println("completed ");
	}

}
