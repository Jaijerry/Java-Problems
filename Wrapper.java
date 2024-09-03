public class Wrapper {
    public static void main(String[] args) {
        int a=23;
        double b = 5.33;
        Integer aobj = Integer.valueOf(a);
        Double bobj = Double.valueOf(b);

        if((aobj instanceof Integer)){
            System.out.println("Created a");
        }
        if((bobj instanceof Double)){
            System.out.println("Created b");
        }

        Integer cobj = a;
        System.out.println(cobj);
    }    
}
