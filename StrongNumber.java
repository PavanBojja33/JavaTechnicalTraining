import java.util.*;

public class StrongNumber {
    public static boolean isStrong(int n) {
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum+=i;
        }
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        boolean b=isStrong(n);
        System.out.println("Is 'n' is strong number "+b);
    }
}