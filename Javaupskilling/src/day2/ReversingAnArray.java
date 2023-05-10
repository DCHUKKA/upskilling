package day2;

public class ReversingAnArray {
	
		public static void main(String[] args) {
			int arr[]= {1,3,5,8,10};
			System.out.println("Original array:");
			for(int i=0;i<arr.length;i++) {
	       System.out.print(arr[i]+" ");
				
			}
			System.out.println();
			System.out.println("Reversing an array:");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}


