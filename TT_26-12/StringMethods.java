
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Length of String: "+str.length());
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Lowercase: "+str.toLowerCase());
        System.out.println("Character at index 2: "+str.charAt(2));
        System.out.println("Substring from index 2 to 5: "+str.substring(2,5));
        System.out.println("Index of 'a': "+str.indexOf('a'));
        System.out.println("Replace 'a' with 'o': "+str.replace('a','o')); 
        
    }    
}
