package practice_programs_java.bin;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 5, 20, 20, 4};
		
		int max = a[0];
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		int max2 = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max2 && a[i]!=max) {
				max2 = a[i];
				
			}
		}
		
		System.out.println(max2);
		

	}

}
