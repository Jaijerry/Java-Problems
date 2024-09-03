import java.util.Scanner;

public class zoho1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        char[][] mat = new char[l][l];
        int strindex = 0;
        for(int i=0;i<l;i++) {
            for(int j=0;j<l;j++) {
                if(i==j) {
                    mat[i][j] = str.charAt(strindex);
                    strindex++;
                }
                else {
                    mat[i][j] = ' ';
                }
                
            }
        }

        for(int i=l-1;i>=0;i--) {
            for(int j=0;j<l;j++) {
                if(i==l-j-1) {
                    mat[i][j] = str.charAt(j);
                }
            }
        }

        for(int i=0;i<l;i++) {
            for(int j=0;j<l;j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}