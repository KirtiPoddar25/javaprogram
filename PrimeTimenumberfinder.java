package javaproject;

public class PrimeTimenumberfinder {

	public static void main(String[] args) {

		// 1. Module for Prime Number Checking Logic
		class PrimeChecker {
		    /**
		     * Checks if a given number is prime.
		     * @param n The number to check.
		     * @return true if the number is prime, false otherwise.
		     */
		    public static boolean isPrime(int n) {
		        if (n <= 1) {
		            return false; // 0 and 1 are not prime
		        }
		        // Check for divisibility from 2 up to the square root of n
		        for (int i = 2; i * i <= n; i++) {
		            if (n % i == 0) {
		                return false; 
		            }
		        }
		        return true; 
		    }}}}
		

		