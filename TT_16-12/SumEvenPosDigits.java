import java.util.*;

public class SumEvenPosDigits {
    public static int Sum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i += 2) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = Sum(n);
        System.out.println("Sum of digits in even positions : " + sum);
    }
}
