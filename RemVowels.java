import java.util.Scanner;

public class RemVowels {
    public static void main(String[] args) {
        String vowels = "aeiou";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for(char c  : str.toCharArray()) {
            if(vowels.indexOf(c) == -1) {
                res+=c;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
