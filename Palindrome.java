import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int j = str.length()-1;
        int p = 0;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                p = 1;
                break;
            }
            i++;
            j--;
        }
        if(p==0) {
            System.out.println("Palindrome!");
        }

        sc.close();
    }
}
