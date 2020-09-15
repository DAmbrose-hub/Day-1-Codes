package Inheritance;

class Calculation {

	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("Sum of given 2 numbers is : " + z);
	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("Subtraction of given 2 numbers is : " + z);

	}
}

public class My_Calculation extends Calculation {

	public void multiplication(int x, int y) {

		z = x * y;
		System.out.println("The product of 2 given numbers is : " + z);
	}

	public static void main(String[] args) {

		int a = 30;
		int b = 34;

		My_Calculation mycal = new My_Calculation();
		Calculation cal = new My_Calculation();
		
		
		System.out.println("METHOD CALL FROM SUB CLASS\n");
		mycal.addition(a, b);
		mycal.subtraction(a, b);
		mycal.multiplication(a, b);
		
		System.out.println("M\nETHOD CALL FROM SUPER CLASS\n");
		cal.addition(a, b);
		cal.subtraction(a, b);
	}
}
