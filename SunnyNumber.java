import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double next = n+1;
        double s = Math.sqrt(next);
        if(s-Math.floor(s)==0){
            System.out.println(n + " is a sunny number");
        }
        else{
            System.out.println(n + " is not a sunny number");
        }
        sc.close();
    }
    
}
