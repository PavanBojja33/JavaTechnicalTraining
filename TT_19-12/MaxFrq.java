
import java.util.Scanner;

public class MaxFrq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10];
        while (n > 0) {
            a[n % 10]++;
            n /= 10;
        }
        int max = 0, j = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
                j = i;
            }
        }
        System.out.println(j);
    }
}
