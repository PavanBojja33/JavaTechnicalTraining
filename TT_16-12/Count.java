import java.util.*;

public class Count {

    public static void count(int n) {
        int cntE = 0, cntO = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                cntE++;
            } else
                cntO++;
            n /= 10;
        }
        System.out.println("Even Count " + cntE);
        System.out.println("Odd Count " + cntO);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        count(n);
    }
}