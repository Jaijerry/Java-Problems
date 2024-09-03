import java.util.Scanner;

public class SuitUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] benefits = new int[n];
        for(int i=0;i<n;i++) {
            benefits[i] = sc.nextInt();
        }
        sc.close();
        if(n==1) {
            System.out.println(0);
            return;
        }
        int start = 0;
        int j = 1;
        int max = 0;
        int min = 0;
        int groupBenSum = 0;
        while(j<n) {
            if(benefits[start] <= benefits[j]) {
                max = benefits[j];
                min = benefits[start];
                j++;
                while(start<j && j<n) {
                    if(benefits[j] < max) {
                        start = j;
                        break;
                    }
                    else {
                        max = benefits[j];
                        j++;
                    }
                }
                groupBenSum+=(max-min);
            }
            else {
                max = benefits[start];
                min = benefits[j];
                j++;
                while(start<j && j<n) {
                    if(benefits[j] > min) {
                        start = j;
                        break;
                    }
                    else {
                        min = benefits[j];
                        j++;
                    }
                }
                groupBenSum+=(max-min);
            }
        }
        System.out.println(groupBenSum);
    }
}
