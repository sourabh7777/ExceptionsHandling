package exceptionHandling;

public class CheckedExceptions_TryCatch {
	int x = 10;
	
	public void m1() {
		System.out.println("Value of x is : "+ x);
	}

	public static void main(String[] args) {
		CheckedExceptions_TryCatch obj = new CheckedExceptions_TryCatch();
		obj.m1();
		
		try {
			Thread.sleep(10000);	
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
