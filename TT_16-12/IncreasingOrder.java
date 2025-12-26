import java.util.*;

public class IncreasingOrder {
    public static boolean isIncreasing(int n) {
        String s = String.valueOf(n);
        if (s.length() == 1)
            return true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - '0' > s.charAt(i + 1) - '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        boolean b = isIncreasing(n);
        System.out.println("Is digits in given number in increasing order : " + b);
    }
}
