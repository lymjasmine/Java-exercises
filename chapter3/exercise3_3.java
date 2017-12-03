/* exercise 3_3: (Game: add three numbers) The program in Listing 3.1, 
AdditionQuiz.java, gen- erates two integers and prompts the user to 
enter the sum of these two integers. Revise the program to generate 
three single-digit integers and prompt the user to enter the sum of 
these three integers. */ 


import java.util.Scanner;

public class exercise3_3{
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.println("What is " + number1 + " + " + number2 + 
			" + " + number3 + " ? ");

		int number = input.nextInt();

		int answer = number1+number2+number3;

		System.out.println( number1 + " + " + number2 + " + " 
			+ number3 + " is " + answer);

	}
}