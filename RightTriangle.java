//Write a java program to display the pattern like a right angle triangle with a number
package javaproject;
import java.util.Scanner;

public class RightTriangle  {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter side a: ");
		        double a = input.nextDouble();

		        System.out.print("Enter side b: ");
		        double b = input.nextDouble();

		        System.out.print("Enter side c (hypotenuse): ");
		        double c = input.nextDouble();

		        // Check using Pythagorean theorem
		        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
		            System.out.println("The triangle is a right-angled triangle.");
		        } else {
		            System.out.println("The triangle is NOT a right-angled triangle.");
		        }   
		    }
	}

