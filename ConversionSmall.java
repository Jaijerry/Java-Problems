import java.util.Arrays;
import java.util.Scanner;

public class ConversionSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String[] conv = new String[35];
        for(int i=2;i<=36;i++) {
            conv[i-2] = Integer.toString(n, i); 
        }
        Arrays.sort(conv);
        System.out.print(conv[0]);
    }
}
