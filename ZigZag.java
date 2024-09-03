import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int height = (l+1)+((n-2)*l);
        int start = 1;
        int end = n;
        int space = 1;
        for(int i=1;i<=height;i++) {
            for(int j=1;j<=n;j++) {
                if(i == start) {
                    System.out.print("*");
                    start+=((2*n)-2);
                    space++;
                    break;
                }
                else if(i == end){
                    if(j == n) {
                        System.out.print("*");
                        end+=((2*n)-2);
                        space--;
                        break;
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if(start > end) {
                        if(j == space) {
                            System.out.print("*");
                            space++;
                            break;
                        }
                        else System.out.print(" ");
                    }
                    else {
                        if(j == space) {
                            System.out.print("*");
                            space--;
                            break;
                        }
                        else System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
