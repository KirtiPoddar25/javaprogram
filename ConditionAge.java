package javaproject;
import java.util.Scanner;
public class ConditionAge {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
			int age = sc.nextInt();
	if (age >= 0 && age <= 12) {
	
	    System.out.println("kid");
	
	} else if (age >= 13 && age <= 19) {
	
	    System.out.println("teenager");
	
	} else if (age >= 20 && age <= 40) {
	
	    System.out.println("youngster");
	
	} else if (age >= 41 && age <= 55) {
	
	    System.out.println("aged man");
	
	} else if (age >= 56 && age <= 70) {
	
	    System.out.println("old man");

	} else {
	
	    System.out.println("Invalid age");
	
	}
	
	}
	
	}
			
