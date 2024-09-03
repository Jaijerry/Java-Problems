import java.util.*;
 
public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for(int i=0;i<n-2;i++){
                if(s.substring(i, i+3).equals("map") || s.substring(i, i+3).equals("pie")){
                    count++;
                    i+=2;
                }
            }
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}