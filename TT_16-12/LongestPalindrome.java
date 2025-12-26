import java.util.*;

public class LongestPalindrome{
    private static boolean isPalindrome(String s){
        if(s.length() <= 1) return true;
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        String p="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1)) && p.length()<j-i+1){
                    p=s.substring(i,j+1);
                }
            }
        }
        System.out.println("Longest Palindromic substring : "+p);
    }
}