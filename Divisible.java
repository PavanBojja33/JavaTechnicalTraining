import java.util.*;

public class Divisible{
    private static boolean isDivisible(int n){
        if((n%3==0 || n%5==0) && !(n%3==0 && n%5==0)){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("Divisible numbers are : ");
        
        for(int i=1;i<=n;i++){
            if(isDivisible(i)) System.out.print(i+" ");
        }
        System.out.println();
    }
}