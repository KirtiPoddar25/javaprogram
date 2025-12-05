//find largest among the given numbers by using ternary operator
package javaproject;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10;
	int b=100;
	int c=300;
	int d=450;
	int e=690;
	String largest=((a>b) && (a>c) && (a>d) && (a>e) ? "a is greater " : (b>c) && (b>d) && (b>e) ? "b is greater" : (c>d) && (c>e) ? "c is greater":(d>e) ? "d is greater":"e is greater");
    System.out.println(largest);		


	}

}
