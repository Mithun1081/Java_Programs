package practice_programs_java.bin;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The reversed array:");
		for(int j = n-1;j>=0;j--) {
			
			System.out.println(arr[j] + " ");
		}
		sc.close();

	}

}
