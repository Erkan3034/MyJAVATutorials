package Inheritance.PolymorphismDemo;

public class FileLogger extends BaseLogger {

	public void log(String message) { 
		//overriding
		System.out.println("Logged to file." + message);
	}
	
}
