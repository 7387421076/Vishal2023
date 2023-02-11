package Logicalprograms;

import java.util.Scanner;

public class accept_input_from_user {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter num1");
		int num1= scr.nextInt();
		
		System.out.println("Enter num2");
		int num2= scr.nextInt();
		
		
		System.out.println(num1+num2);
	}

}
