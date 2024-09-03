import java.util.*;

public class RoundOff {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r= n%10;
        int result = (r<5) ?( r ): (10-r);
        System.out.println(n+result);
        sc.close();
    }
}
