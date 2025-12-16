import java.util.*;

public class Consecutive{
    public static int seqCount(long n) {
        String s = String.valueOf(n);
        int max=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            int cur=1;
            char ch=s.charAt(i);
            while(s.charAt(i) == ch){
                cur++;
                i++;
            }
            if(cur > max){
                max=cur;
                num=s.charAt(i-1)-'0';
            }
        }
        System.out.println("Number is "+num);
        return max;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        long n=sc.nextLong();
        int max=seqCount(n);
        System.out.println("Longest Count : "+max);
    }
}