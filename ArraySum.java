package javaproject;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner s = new Scanner(System.in);
		        System.out.print("Size: ");
		        int size = s.nextInt();
		        int[] arr = new int[size];
		        int sum = 0;

		        System.out.println("Enter elements:");
		        // Loop to fill arrayS
		        for (int i = 0; i < size; i++) {
		            arr[i] = s.nextInt();
		        }
		        
		        // Loop to calculate sum (using for-each loop)
		        for (int num : arr) {
		            sum += num;
		        }

		        s.close();
		        System.out.println("Sum: " + sum);
		    }
		

	}


