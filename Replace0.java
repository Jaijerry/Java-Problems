import java.util.Scanner;

public class Replace0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int dig = 0;
        while(num > 0) {
            int r = num%10;
            if( r == 0) {
                n+=(Math.pow(10, dig));
            }
            dig++;
            num/=10;
        }

        System.out.println("Replaced 0: " + n);
        sc.close();
    }
}
