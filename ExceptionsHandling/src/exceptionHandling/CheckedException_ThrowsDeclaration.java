package exceptionHandling;

public class CheckedException_ThrowsDeclaration {
int x = 10;
	
	public void m1() {
		System.out.println("Value of x is : "+ x);
	}

	public static void main(String[] args) throws Exception {
		CheckedExceptions_TryCatch obj = new CheckedExceptions_TryCatch();
		obj.m1();
		
		Thread.sleep(1000);

	}

}
