package javaproject;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter age:");
		int age=scan.nextInt();
		boolean value=MethodDemo.canVote(age);
if(value)
	System.out.println("can vote");
else
	System.out.println("u can't vote");

	}
	public static boolean canVote(int age) {
		if(age>18) {
			return true;}
			else {
				return false;
				
			}
		}
	}


