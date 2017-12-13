/* 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly 
generates a subtraction question. Revise the program to randomly generate an 
addition ques- tion with two integers less than 100. */

import java.util.Scanner;

public class exercise3_10{
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random()* 100);

		if (number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.println(" What is "+ number1+ "-" + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if (number1 - number2 == answer){
			System.out.println("You are correct!");
		}
		else{
			System.out.println(" You are wrong!");
		}
		System.out.println("The answer is " + (number1 - number2));
	}
	
}
