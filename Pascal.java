import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print(fact(i)/(fact(j)*fact(i-j)) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int fact(int n) {
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
