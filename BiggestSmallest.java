package javaproject;
import java.util.Scanner;
public class BiggestSmallest {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("min|max of three numbers");
System.out.println("Enter the 1st numbers");
double num1 =sc.nextDouble();
System.out.println("Enter the 2nd numbers");
double num2 =sc.nextDouble();
System.out.println("Enter the 3rd numbers");
double num3 =sc.nextDouble();
double smallest=Math.min(num1, Math.min(num2, num3));
double biggest=Math.max(num1, Math.max(num2, num3));
System.out.println("\n Results:");
System.out.println("the smallest number is:"+smallest);
System.out.println("the biggest number is:"+biggest);
	}
}
