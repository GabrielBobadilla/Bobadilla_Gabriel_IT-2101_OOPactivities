import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the multiplication table: ");
        int mt = scanner.nextInt();
        
        int[][] table = new int[mt][mt];
        
        for (int i = 0; i < mt; i++) {
            for (int j = 0; j < mt; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        
        System.out.println("Multiplication Table: ");
        for (int i = 0; i < mt; i++) {
            for (int j = 0; j < mt; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
