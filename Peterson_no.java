import java.util.*;
public class Peterson_no{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while(n>0){
            int r= n%10;
            int f=1;
            while(r>0){
                f*=r;
                r--;
            }
            sum+=f;
            n = n/10;
        }
        if(sum==m){
            System.out.println("Peterson");
        }
        else{
            System.out.println("Not Peterson");
        }
        sc.close();
    }
}