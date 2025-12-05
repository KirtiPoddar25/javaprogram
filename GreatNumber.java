package javaproject;

import java.util.Scanner;

public class GreatNumber {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a: ");
		        int a = sc.nextInt();

		        System.out.print("Enter b: ");
		        int b = sc.nextInt();

		        boolean result = (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6);
		        System.out.println(result);
		    }
		
		
		
	}


