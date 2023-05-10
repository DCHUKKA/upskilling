package day2;

public class SumOfMatrices {
	public static void main(String[] args) {
		
		int arr1[][]= {{2,3,4},{5,2,3},{4,6,9}};
		System.out.println("Matrix 1:");
		for(int i=0;i<arr1.length;i++) { 
			
			for(int j=0;j<arr1.length;j++) {
				
			System.out.print(arr1[i][j]+" ");
			}
		System.out.println();
		
		
	} 
		System.out.println();
		System.out.println("Matrix 2:");
		int arr2[][]= {{4,5,3},{5,6,3},{8,1,5}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matrix 1+Matrix 2:");
		int array=3;
		int arr[][]=new int[array][array];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		


}
}
