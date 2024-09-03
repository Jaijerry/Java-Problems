import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=s*b;i++) {
            for(int j=0;j<b;j++) {
                if(i%b == 0 && i!=s*b) {
                    System.out.print("*");
                }
                else {
                    if(j==0 || j==b-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
