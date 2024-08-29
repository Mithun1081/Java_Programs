package practice_programs_java.bin;

public class ZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,1,0,3,12};
		int n = a.length;
		
		int nonZeroIndex = 0;
		
		for(int i =0;i<n;i++) {
			
			if(a[i]!=0) {
				a[nonZeroIndex] = a[i];
				nonZeroIndex++;
				
			}
		}
		while(nonZeroIndex < n) {
			a[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
		System.out.println("Array after moving zeros to the end..");
		for(int i=0;i<n;i++) {
			System.out.println(a[i] + " ");
		}
}

}
