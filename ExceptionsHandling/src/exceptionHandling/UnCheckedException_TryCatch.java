package exceptionHandling;

public class UnCheckedException_TryCatch {
	
	

	public static void main(String[] args) {
		System.out.println("Program started");
		
		try {
			int x = 10/0;
			System.out.println("Division result is"+ x);
		}
		catch(ArithmeticException e) {
			System.out.println("Something went wrong , Please check the issue "+ e.getMessage());
			
		}
		System.out.println("Program End ");

	}

}
