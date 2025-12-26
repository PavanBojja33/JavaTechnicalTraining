
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the String :");
        String str=sc.next();
        int i=0,j=str.length()-1;
        boolean flag=true;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("String is not a palindrome");
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag) System.out.println("String is a palindrome");
    }    
}
