package practice_programs_java.bin;
import java.util.*;
public class IntersectionOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array 1:");		
		int n1 = sc.nextInt();		
		int[] arr1 = new int[n1];
		
		System.out.println("Enter the elements of arr1:");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		
		
		System.out.println("Enter sizr of array 2:");		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];		
		
		System.out.println("Enter the elements of arr2");
		for(int j=0;j<n2;j++) {
			arr2[j] = sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + " ");
					arr2[j] = Integer.MAX_VALUE;
					break;
				}
			}
			
		}

		
		
		
/* ANOTHER METHOD		
		int i = n1-1;
		int j = n2-1;
		
		while(i>-1 && j>-1) {
			if(arr1[i] != arr2[i]) {
				System.out.println(arr1[i+1]);
				break;
			}
			i--;
			j--;
		}
		
		*/
		
		sc.close();

	}

}
