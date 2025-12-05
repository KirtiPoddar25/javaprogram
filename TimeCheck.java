 // Method to print AM or PM
package javaproject;
import java.util.Scanner;
public class TimeCheck {
		public static String printTime(int hour) {
		        if (hour >= 1 && hour <= 12) {
		            return "AM";
		        } else if (hour >= 13 && hour <= 24) {
		            return "PM";
		        } else {
		            return "Invalid hour";
		        }
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter hour (1-24): ");
		        int hour = sc.nextInt();

		        String result = printTime(hour);
		        System.out.println("It is: " + result);
		    }
			}


