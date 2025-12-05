/**
 * Program to display the price of a pizza based on the size ordered
 * using a switch expression (modern, short format).
 */
package javaproject;
import java.util.Scanner;
public class Pizzaprice1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Pizza Menu: S(125), M(250), L(300), V(350) ---");
        System.out.print("Enter size (S, M, L, or V): ");

        // Read input and convert to uppercase
        String size = scanner.nextLine().toUpperCase();
        scanner.close();

        // Use enhanced switch expression to determine price and handle errors concisely
        int price = switch (size) {
            case "S", "SMALL" -> 125;
            case "M", "MEDIUM" -> 250;
            case "L", "LARGE" -> 300;
            case "V", "VERY LARGE" -> 350;
            default -> -1; // Indicate error
        };

        // Display the result
        if (price > 0) {
            System.out.printf("\nThe price for size %s is: $%d\n", size, price);
        } else {
            System.out.println("\nError: Invalid size entered.");
        }
    }
}