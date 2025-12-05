package javaproject;

public class Multipleoffive {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]data= {10,5,34,87};
fivemultiple(data);
	}
public static void fivemultiple(int arr[]) {
	int count=0;
	for(int element:arr) {
		if(element%5==0) {
			System.out.println("multiple of 5:"+element);
			count++;
			System.out.println("total count of multiples 0f 5:"+count);
		
		}
	}
}
}
