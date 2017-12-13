/* 3.8 (Sort three integers) Write a program that prompts the user to enter three 
integers and display the integers in non-decreasing order. 
先确定最小值，再对比其余的两个数值*/

import java.util.Scanner;

public class exercise3_8 {
	public static void main(String[] args) {

		System.out.println(" Enter three integers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a < b ){
			if (b > c)
				System.out.println(" The order is: " + a + "," + c + "," + b);
			else 
				System.out.println(" The order is : " + a + "," + b + "," + c); 

		}

		else if ( b < a){
			if (a < c)
				System.out.println(" The order is: " + b + "," + a + "," + c);
			else
				System.out.println(" The order is : " + b + "," + c + "," + a); 
		}

		else if (c < a ){
			if (a < b)
				System.out.println(" The order is : " + c + "," + a + "," + b); 
			else 
				System.out.println(" The order is : " + c + "," + b + "," + a); 
		}

		}
	}
