
import java.util.Scanner;

public class CountDivPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, i = 1;
        while (n > 0) {
            if ((n % 10) % i == 0)
                cnt++;
            i++;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
