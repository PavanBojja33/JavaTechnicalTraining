import java.util.*;

public class ArmstrongNumber{
    public static List<Integer> armstrong(int n){
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int j=i;
            int sum=0;
            while(j>0){
                int r=j%10;
                sum+=(int)Math.pow(r,3);
                j/=10;
            }
            if(sum==i) res.add(i);
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        List<Integer> res=armstrong(n);
        System.out.println("Armstrong Numbers:");
        for(int l:res){
            System.out.println(l);
        }
    }
}