import java.util.Scanner;

public class ArrayMean {
    public static double getArrayMean (int[] array){
        int sum = 0;
        for( int num : array){
            sum += num;
        }
    return (double) sum / array.length;
    }
    
    public static void  main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter number:");
            array[i] = scanner.nextInt();
        }
        double mean = getArrayMean(array);
        System.out.printf("Mean of the array is: %.2f", mean);
    }
}