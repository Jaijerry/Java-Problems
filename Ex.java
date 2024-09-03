import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i=0;i<n;i++){
                sum+=a[i];
            }

            System.out.println(sum);
            t--;
        }
    }
}
