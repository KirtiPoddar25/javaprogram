package java2projects;

import java.util.Scanner;

public class ArrayRangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        // Define the size of the 2D array
		        final int ROWS = 3;
		        final int COLS = 3;
		        int[][] array = new int[ROWS][COLS];

		        // Initialize Scanner object for input
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("--- 3x3 Array Input ---");
		        System.out.println("Enter 9 integer numbers for the 3x3 array:");

		        
		        for (int i = 0; i < ROWS; i++) {
		            for (int j = 0; j < COLS; j++) {
		                System.out.print("Enter number for position [" + i + "][" + j + "]: ");
		                
		                // Input validation loop
		                while (!scanner.hasNextInt()) {
		                    System.out.println("Invalid input. Please enter an integer:");
		                    scanner.next(); 
		                }
		                array[i][j] = scanner.nextInt();
		            }
		        }

		        scanner.close(); // Close the scanner when input is complete

		        // Display the entered array (optional)
		        System.out.println("\n--- Entered Array ---");
		        for (int i = 0; i < ROWS; i++) {
		            for (int j = 0; j < COLS; j++) {
		                System.out.print(array[i][j] + "\t");
		            }
		            System.out.println();
		        }
		        System.out.println("---------------------\n");


		        
		        int count1To50 = 0;
		        int count50To100 = 0;
		        int countAbove100 = 0;

		      
		        System.out.println("--- Counting Results ---");
		        for (int i = 0; i < ROWS; i++) {
		            for (int j = 0; j < COLS; j++) {
		                int number = array[i][j];

		                // Check Range 1: Numbers between 1 and 50 (inclusive)
		                if (number >= 1 && number <= 50) {
		                    count1To50++;
		                }
		                // Check Range 2: Numbers between 50 and 100 
		                // Since 50 is checked in the 'if' above, we check > 50 here.
		                else if (number > 50 && number <= 100) {
		                    count50To100++;
		                }
		                // Check Range 3: Numbers above 100
		                else if (number > 100) {
		                    countAbove100++;
		                }
		                // Numbers <= 0 are automatically ignored by the conditional structure.
		            }
		        }

		        
		        System.out.println("\nExpected output:");
		        System.out.println("In the above array there are " + count1To50 + " number between 1 to 50");
		        System.out.println("In the above array there are " + count50To100 + " number between 50 to 100");
		        System.out.println("In the above array there are " + countAbove100 + " number above 100");
		 }
	}
}
		
