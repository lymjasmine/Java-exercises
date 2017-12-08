/* Exercise 3_6:
(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, 
to let the user enter weight, feet, and inches. For example, if a person is 5 feet 
and 10 inches, you will enter 5 for feet and 10 for inches. PAGE 112 */

import java.util.Scanner;

public class exercise3_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weigt in pounds: ");
		double weight = input.nextDouble();

		System.out.println(" Enter height in inches:");
		double height = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / ( heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);
		if ( bmi < 18.5 ){
			System.out.println("Underweight.");
		}

		else if ( bmi < 25 ){
			System.out.println("Normal.");
		}
		else if ( bmi < 30 ){
			System.out.println("Overweight.");
		}
		else
			System.out.println("Obese.");
		
	}
}
