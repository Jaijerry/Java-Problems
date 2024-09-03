import java.util.Arrays;
import java.util.Scanner;

public class FoodGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        for(int i=0;i<n;i++) {
            v[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(v);
        int count = 0;
        int start = 0;
        int end = start+k-1;
        boolean firstCheck = false;
        while(start<n-k && end<n) {
            int max = v[end];
            int min = v[start];
            if(max-min<=m) {
                firstCheck = true;
                end++;
            }
            else {
                if(!firstCheck){
                    start++;
                    end = start+k-1;
                }
                else {
                    start = end;
                    end = start+k-1;
                    firstCheck = false;
                    count++;
                }
            }
        }
        if(firstCheck) count++;
        if(count == 0) System.out.println(-1);
        else System.out.println(count);
    }
}
