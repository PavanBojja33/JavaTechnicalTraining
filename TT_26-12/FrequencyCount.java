
import java.util.*;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :");
        String str = sc.next();
        str=str.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        System.out.println("Frequency of each char is : ");
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
        }
    }
}
