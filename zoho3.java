public class zoho3 {
    public static void main(String[] args) {
        String str = "WELCOMETOZOHOCORPORATION";
        char[][] mat = new char[5][5];
        int strindex = 0;
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                mat[i][j] = str.charAt(strindex);
                strindex++;
                if(strindex >= str.length()) {
                    break;
                }
            }
        }

        int[] startindex = new int[2];
        int[] endindex = new int[2];
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(mat[i][j] == 'T' && (i+2 < 5 && j+2 < 5)) {
                    startindex[0] = i;
                    startindex[1] = j;
                    if(mat[i+1][j] == 'O' && mat[i+2][j] =='O') {
                        endindex[0] = i+2;
                        endindex[1] = j;
                    } 
                    else if(mat[i][j+1] == 'O' && mat[i][j+2] == 'O') {
                        endindex[0] = i;
                        endindex[1] = j+2;
                    }
                }
            }
        }

        for(int i=0;i<2;i++) {
            System.out.print("startindex[" + i + "]: " + startindex[i] + " ");
            System.out.print("endindex[" + i + "]: " + endindex[i] + " ");
        }
        System.out.println();

        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
