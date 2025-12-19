import java.util.*;

public class StrongNumber {
    public static int fact(int n) {
        if (n <= 1)
            return 1;
        int pro = 1;
        while (n > 0) {
            pro *= n;
            n--;
        }
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        int sum = 0;
        int k = n;
        while (k > 0) {
            sum += fact(k % 10);
            k /= 10;
        }
        if (sum == n) {
            System.out.println("Is 'n' is strong number ");
        } else {
            System.out.println("Is 'n' is not strong number ");

        }
    }
}
