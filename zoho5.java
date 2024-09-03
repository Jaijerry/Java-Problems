public class zoho5 {
    public static void main(String[] args) {
        String[][] arr = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};
        String name = "ronaldo";
        String child = "";
        int grandchild = 0;
        int l = arr.length;
        for(int i=0;i<l;i++) {
            if(arr[i][1].equals(name)) {
                child = arr[i][0];
                break;
            }
        }

        for(int i=0;i<l;i++) {
            if(arr[i][1].equals(child)) {
                grandchild++;
            }
        }

        System.out.println(grandchild);
    }
}
