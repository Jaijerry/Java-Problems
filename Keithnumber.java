import java.util.ArrayList;

public class Keithnumber {
    public static void main(String[] args) {
        int[] arr = {14, 19, 28, 47, 61, 75, 197};
        for (int num : arr) {
            if (isKeith(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isKeith(int n) {
        String strNum = Integer.toString(n);
        int len = strNum.length();
        ArrayList<Integer> sequence = new ArrayList<>();
        for (char c : strNum.toCharArray()) {
            sequence.add(Character.getNumericValue(c));
        }
        while (sequence.size() < n) {
            int sum = 0;
            for (int i = sequence.size() - len; i < sequence.size(); i++) {
                sum += sequence.get(i);
            }
            sequence.add(sum);
        }
        return sequence.contains(n);
    }
}

