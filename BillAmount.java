/*write a program to input total amount in a bill,if amount is greater than 1000 then add discount of 8% to bill amount if amount greater than
2000 then add a discount of 15% to the bill amount. if the amount is less than 
1000 then no discount*/
package javaproject;

import java.util.Scanner;

public class BillAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount:");
int amount=sc.nextInt();
double discount=0;
if(amount>2000) {
    discount= amount*0.15;
    System.out.println(discount);
}
else if(amount>1000) {
	discount=amount*0.08;
    System.out.println(discount);
}
else{
	discount=0;
    System.out.println(discount);
}
double finalamount=amount-discount;
System.out.println("final amount to pay ="+finalamount);

	}}

