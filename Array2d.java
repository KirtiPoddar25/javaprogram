package javaproject;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,3,4},{1,5,2},{2,4,5}};
		int sum=0;
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				sum=sum+arr[i][j]; 
				System.out.print(sum+" ");
			}
			
			System.out.println();
		}

	}

}
