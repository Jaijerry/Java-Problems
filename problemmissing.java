import java.util.Scanner;

public class problemmissing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p;
        for(int i=1;i<=n;i++){
            p=i;
            for(int j=1;j<=(2*n)-1;j++){
                if(i%2==1){
                    if(j%2==0 || j<i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(p);
                        p++;
                        if(p>n){
                            break;
                        }
                    }
                }
                else{
                    if(j%2==1 || j<i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(p);
                        p++;
                        if(p>n){
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            p=n-i;
            for(int j=1;j<=(2*n)-1;j++){
                if(i%2==1){
                    if(j%2==0 || j<p){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(p);
                        p++;
                        if(p>n){
                            break;
                        }
                    }
                }
                else{
                    if(j%2==1 || j<p){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(p);
                        p++;
                        if(p>n){
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
