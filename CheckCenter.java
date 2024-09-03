import java.util.Scanner;

public class CheckCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] bridge = new int[m][2];
        for(int i=0;i<m;i++) {
            bridge[i][0] = sc.nextInt();
            bridge[i][1] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for(int i=0;i<n;i++) {
            int countPaths = 0;
            for(int j=0;j<m;j++) {
                if(bridge[j][0] == i || bridge[j][1] == i) {
                    countPaths++;
                }
                if(countPaths == 2) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count*k);
    }
}
