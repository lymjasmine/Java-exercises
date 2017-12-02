import java.util.Scanner;

public class exercise3_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c: ");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double x = (b * b - 4 * a * c);
		
		double r1 = (-b + Math.pow( x ,0.5) ) / 2 * a;
		double r2 = (-b - Math.pow( x ,0.5) ) / 2 * a;

		if (x > 0){
			System.out.println("The equation has two roots: " + r1 + "& "
				+ r2);
		}
		else if (x == 0){
			System.out.println("The equation has one root:" + r1 );
		}
		else (x < 0){
			System.out.println("The equation has no real roots.");
		}
	}
}
