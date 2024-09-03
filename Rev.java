import java.util.Scanner;

public class Rev {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String reversedString = reverseWords(inputString);
        System.out.println(reversedString);
        sc.close();
    }

    public static String reverseWords(String input) {
        char[] inputArray = input.toCharArray();
        int start = 0;

        for (int end = 0; end <= inputArray.length; end++) {
            if (end == inputArray.length || inputArray[end] == ' ') {
                reverseWord(inputArray, start, end - 1);
                start = end + 1;
            }
        }

        return new String(inputArray);
    }

    public static void reverseWord(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    
}
