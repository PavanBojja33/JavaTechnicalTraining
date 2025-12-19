import java.util.Scanner;

public class CountUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10];
        int cnt = 0;
        while (n > 0) {
            a[n % 10]++;
            n /= 10;
        }
        for (int num : a) {
            if (num == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
