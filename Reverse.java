
import java.util.*;
public class Reverse{
    public static void main(String[] args){
        int[][][] a={
            {1,2,3},{4,5,6},{7,8,9},      
        };
        int n=a.length,t=n;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i%2==0){
                System.out.print(a[i][j]+" ");
                }else{
                    System.out.print(a[i][t-1]+" ");
                    t--;
                }
            }System.out.println();
        }
    } 
   
}