import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first String :");
        String str1=sc.next();
        str1=str1.toLowerCase();
        System.out.print("Enter second String :");
        String str2=sc.next();
        str2=str2.toLowerCase();
        if(str1.length() != str2.length());
        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;    
        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                System.out.println("Strings are not anagram");
                return;
            }
        }
        System.out.println("Strings are anagram");
    }    
}
