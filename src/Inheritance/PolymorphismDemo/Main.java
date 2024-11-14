package Inheritance.PolymorphismDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		/*
		 * DatabaseLogger databaseLogger = new DatabaseLogger();
		 * databaseLogger.log("Database");
		 * 
		 * FileLogger fileLogger = new FileLogger(); fileLogger.log("File");
		 * 
		 */

		
		
		/*
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new BaseLogger() };
		
		for (BaseLogger logger : loggers) {
			logger.log("(LOG)");
		}
		
		*/

		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); 
		customerManager.add();
		
		
	}

}
