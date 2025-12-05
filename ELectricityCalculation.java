package javaproject;

import java.util.Scanner;

public class ELectricityCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit:");
		int units=sc.nextInt();
		double cost=0;
		if(units<30) { 
			cost=units*3.5;
		}
		if(units>=30&&units<50) {
			cost =units*4.25;
		}
		if(units>=50&&units<100) {
			cost=units*5.25;
		}
		if(units>=100) {
			cost=units*5.85;
		}
		System.out.println(" Bill amount:"+cost);
		
	}

}
