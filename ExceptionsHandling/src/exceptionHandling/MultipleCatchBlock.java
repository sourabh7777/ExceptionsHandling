package exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int studentID[] = new int[5];
			studentID[0] = 15103022;
			studentID[1] = 15103023;
			studentID[2] = 15103024;
			studentID[3] = 15103025;
			studentID[4] = 15103026;
			
			System.out.println(studentID[6]);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound exception occured");
		}
		catch(Exception e) {
			System.out.println("Parent Exception Occured");
		}
		System.out.println("Rest of the code");
		

	}

}
