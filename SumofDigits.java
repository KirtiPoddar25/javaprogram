package javaproject;
public class SumofDigits {
    public static void main(String[] args) {
        int number = 12345; // The number to find the sum of digits for
        int sum = 0;
        int temp = number; // Use a temporary variable to avoid modifying the original number

        while (temp > 0) {
            // 1. Get the last digit: 'temp % 10'
            int digit = temp % 10;
            
            // 2. Add the digit to the sum
            sum = sum + digit;
            
            // 3. Remove the last digit: 'temp / 10'
            temp = temp / 10; 
        }

        System.out.println("The sum of digits for " + number + " is: " + sum);
    }
}

