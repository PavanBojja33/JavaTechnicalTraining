import java.util.*;

public class Factors {
    public static List<Integer> factors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        List<Integer> res = factors(n);
        System.out.print("Factors of " + n + " are : ");
        for (int factor : res) {
            System.out.print(factor + " ");
        }
    }
}
