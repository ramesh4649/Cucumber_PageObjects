package logger;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		
		Logger log = org.apache.logging.log4j.LogManager.getLogger(LoggerDemo.class);
		
		System.out.println("i implemented logger 1");
		
		log.info("1 info log");
		
		log.error("2 err log");
		
		System.out.println("program ended");
	}

}