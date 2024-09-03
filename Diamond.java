import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(j<n-i) System.out.print("  ");
                else System.out.print("* ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(j<i+1) System.out.print("  ");
                else System.out.print("* ");
            }
            for(int j=0;j<n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
