
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // int[][] mat = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 1;
        System.out.println("Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // mat[i][j] = cnt++;
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}