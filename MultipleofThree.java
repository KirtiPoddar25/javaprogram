package javaproject;

import java.util.Scanner;

public class MultipleofThree {

	public static void printMultiples(int []arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int element:arr)
		{
			if(element %3==0)
		{
			System.out.println("Multiple of 3 found:"+element);
			count++;
			System.out.println("total count of MUltiples of 3:"+count);
		}}}
		public static void main(String[] args){
			int[] data= {1,5,8,9,18};
			/*Scanner sc=new Scanner(System.in);
			System.out.print("Size: ");
	        int number = sc.nextInt();
	        int[] arr = new int[number];*/
			printMultiples(data);
			
			
		}
		

	}


