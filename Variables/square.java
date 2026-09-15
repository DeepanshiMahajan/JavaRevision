import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of a square : ");
        int n = sc.nextInt();

        int sq = n*n;
        System.out.println("Area of a square is:"+sq);
    }
}
