import java.util.Scanner;

public class Floyds_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
