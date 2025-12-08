package javaproject;

import java.util.Scanner;

public class TwodimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//decalre a two dim array and defining a two dim array
		int arr[][]=new int[2][3];
		//initailize the value to the array
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("enter the value for row"+(i+1)+"column"+(j+1));
				arr[i][j]=sc.nextInt();
				}
			}
//printing the values to the array
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;i++) {
				System.out.println(arr[i][j]+" ");
				}
			System.out.println();
}
}
}
