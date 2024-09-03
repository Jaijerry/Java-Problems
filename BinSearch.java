import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        int result = search(a, target);
        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index " + result);
        }
        sc.close();
    }

    public static int search(int[] array, int target){
        int[] sort = sort(array);
        int n = sort.length;
        String s = Arrays.toString(sort);
        System.out.println("Sorted array: " + s);
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target==sort[mid]){
                return mid;
            }
            else if(target>sort[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static int[] sort(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
