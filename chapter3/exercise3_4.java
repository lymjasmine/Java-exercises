/*Chapter3_4 (Random month) Write a program that randomly generates an integer 
between 1 and 12 and displays the English month name January, February, ..., 
December for the number 1, 2, ..., 12, accordingly. */


import java.util.Scanner;

public class exercise3_4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a integer:");
		int month = input.nextInt();

		switch(month%12 ){
			case 1 : System.out.println( month + " is January.");break;
			case 2: System.out.println( month + " is February.");break;
			case 3: System.out.println( month + " is March.");break;
			case 4: System.out.println( month + " is April.");break;
			case 5 : System.out.println( month + " is May.");break;
			case 6 : System.out.println( month + " is June.");break;
			case 7 : System.out.println( month + " is July.");break;
			case 8 : System.out.println( month + " is August.");break;
			case 9: System.out.println( month + " is September.");break;
			case 10: System.out.println( month + " is October.");break;
			case 11 : System.out.println( month + " is November.");break;
			case 0 : System.out.println( month + " is December.");break;

		}
	}
}