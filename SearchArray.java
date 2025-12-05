//search an element if it is there in array or not
package javaproject;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int []arr= {12,15,45,1};
		int searchElement=4;
		boolean value=false;
		for(int element:arr) {
			if(element==searchElement) {
				value=true;
				break;
				
			}
		}
		if(value) {
			System.out.println(searchElement+"is present in the an array");
		}
			else {
				System.out.println(searchElement+"is not present in the an array");
			}	
	}}
		
	


