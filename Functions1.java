import java.util.Scanner;

public class Functions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int noOfDigits = numDigits(n);
        System.out.println("No of Digits: " + noOfDigits);

        int sumOfDigits = sumDigits(n);
        System.out.println("Sum of Digits: " + sumOfDigits);

        if(n <= 12) {
            int factorial = fact(n);
            System.out.println("Factorial: " + factorial);
        }

        String isPrime = isPrime(n);
        System.out.println(isPrime);

        isArmstrong(n, noOfDigits);

        sc.close();
    }

    public static String isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i == 0) {
                return "Not Prime...";
            }
        }
        return "Prime!";
    }

    public static void isArmstrong(int n, int d) {
        int num = n;
        int sum = 0;
        while(num>0) {
            int rem = num%10;
            sum+=Math.pow(rem, d);
            num/=10;
        }
        if(sum == n) {
            System.out.println("It is Armstrong!");
        }
        else {
            System.out.println("Not Armstrong...");
        }
    }

    public static int fact(int n) {
        int f = n;
        if(f==1) {
            return f;
        }
        return f * fact(f-1);
    }

    public static int sumDigits(int n) {
        int num = n;
        int sum = 0;
        while(num>0) {
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }

    public static int numDigits(int n) {
        int num  = n;
        int count = 0;
        while(num>0) {
            count++;
            num/=10;
        }
        return count;
    }
}
