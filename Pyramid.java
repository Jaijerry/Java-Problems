import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int c = i;
            for(int j=0;j<n;j++) {
                if(j<n-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(c);
                    c--;
                }
            }
            c++;
            for(int j=0;j<i-1;j++) {
                c++;
                System.out.print(c);
            }
            System.out.println();
        }

        sc.close();
    }
}
