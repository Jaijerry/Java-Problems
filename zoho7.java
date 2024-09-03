public class zoho7 {
    public static void main(String[] args) {
        String exp = "((abd)((ce))";
        StringBuffer expultra = new StringBuffer(exp);
        int open = 0;
        for(int i=0;i<exp.length();i++) {
            if(exp.charAt(i) == '(') {
                open++;
            }
            else {
                open--;
            }
            if(open<0) {
                expultra.deleteCharAt(i);
            }
        }
        exp = expultra.toString();
        int close = 0;
        for(int i=exp.length()-1;i>=0;i--) {
            if(exp.charAt(i) == ')') {
                close++;
            }
            else {
                close--;
            }
            if(close<0) {
                expultra.deleteCharAt(i);
            }
        }
        exp = expultra.toString();
        System.out.println(exp);
    }
}
