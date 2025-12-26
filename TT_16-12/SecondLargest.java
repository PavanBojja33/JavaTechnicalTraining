import java.util.*;

public class SecondLargest {
    public static int seclarge(int n) {
        int first = 0, second = 0;
        while (n > 0) {
            int r = n % 10;
            if (r > first) {
                second = first;
                first = r;
            } else if (r > second && r != first) {
                second = r;
            }
            n /= 10;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        int second = seclarge(n);
        System.out.println("Second largest digit in given number : " + second);
    }
}
