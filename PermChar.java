import java.util.*;

public class PermChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    List<String> ans = new ArrayList<>();
    ans.add(String.valueOf(str.charAt(0)));
    for(int i=1;i<str.length();i++){
      for(int j=ans.size()-1;j>=0;j--){
        String temp = ans.remove(j);
        for(int k=0;k<=temp.length();k++){
          ans.add(temp.substring(0,k)+str.charAt(i)+temp.substring(k));
        }
      }
    }
    Collections.sort(ans);
    System.out.println(ans);
    sc.close();
  }
}

