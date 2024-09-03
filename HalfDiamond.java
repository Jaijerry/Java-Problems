import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int c = 1;
        for(int i=0;i<(2*n)-1;i++) {
            if(i<n) {
                for(int j=0;j<n;j++) {
                    if(j<=i) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            else {
                for(int j=n;j>c;j--) {
                    System.out.print("* ");
                }
                c++;
            }
            System.out.println();
        }
    }
}
