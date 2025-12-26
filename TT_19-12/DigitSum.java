
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int k = n;
        while (k > 0) {
            sum += k % 10;
            k /= 10;
        }
        int cnt = 0;
        while (n > 0) {
            int r = n % 10;
            if (r > sum - r) {
                cnt++;
            }
            n /= 10;
        }
        System.out.println(cnt);
    }
}
