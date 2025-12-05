package javaproject;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		int pwd=0;
		do {
			System.out.println("password="+pwd);
			if(pwd==0) 
				System.out.println("Enter your password:");
			
			else 
				System.out.println("Incorrect passsword."+"Enter your password again");
			
			pwd=sc.nextInt();
			i++;
			if(i==3)
				break;
		}
		while(pwd!=1234);
		
		System.out.println("correct pwd");
		}}

	


