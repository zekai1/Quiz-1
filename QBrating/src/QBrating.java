import java.util.Scanner;

public class QBrating {
	
	double TD;
	double YDS;
	double INT;
	double COMP;
	double ATT;
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter number of TD:");
		double TD = input.nextDouble();
		
		System.out.print("Enter number of YDS:");
		double YDS = input.nextDouble();
		
		System.out.print("Enter number of INT:");
		double INT = input.nextDouble();
		
		System.out.print("Enter number of COMP:");
		double COMP = input.nextDouble();
		
		System.out.print("Enter number of ATT:");
		double ATT = input.nextDouble();
		
		
		double a = (COMP / ATT - 0.3) * 5;
		double b = (YDS / ATT - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375-(INT / ATT * 25);
		double passer = ((a + b + c + d) / 6) * 100;
		
		System.out.println("The passer rating is " + passer);
	}
	
}
