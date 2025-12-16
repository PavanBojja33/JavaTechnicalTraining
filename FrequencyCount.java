import java.util.*;

public class FrequencyCount{
    public static int[] freqCount(long n){
        int[] a=new int[10];
        while(n>0){
            int r=(int)n%10;
            a[r]+=1;
            n/=10;
        }
        return a;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        long n=sc.nextLong();
        int[] a=freqCount(n);
        System.out.println("Frequency Count:");
        for(int i=0;i<10;i++){
            if(a[i]==0) continue;
            System.out.println(i+" -> "+a[i]);
        }
    }
}