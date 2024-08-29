package practice_programs_java.bin;

/*public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {10,20,30,40,50};
		
		double  avg = 0;
		
		 for (int i=0;i<arr.length;i++) {
			 avg+= arr[i];
			 
		 }
		 double average = avg/arr.length;
		 System.out.println("The average of the elements in the array, e.g.,"+ average +".");
		

	}

}*/
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        double[] array = new double[n];
        double sum = 0;

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        // Calculate the average
        double average = sum / n;

        // Output the average
        System.out.println("The average of the array is: " + average);

        // Close the scanner
        scanner.close();
    }
}

