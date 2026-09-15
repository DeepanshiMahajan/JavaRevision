package conditional;

import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Number is zero");
        }else if(n > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
