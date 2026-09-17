package Functions;

public class basic {
    public static int changeA(int a){
        a = 5;
        return a;
    }
    public static void main(String[] args) {
        int a = 10;
        changeA(a);
        System.out.println(a);
    }
}
