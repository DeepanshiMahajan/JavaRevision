//In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
import java.util.*;
public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No :");
        int n1= sc.nextInt();
        
        System.out.print("Enter Second No :");
        int n2 = sc.nextInt();
        
        System.out.print("Enter Third No :");
        int n3 = sc.nextInt();

        int average = (n1 + n2 + n3)/3;
        System.out.println("Average of 3 numbers is "+ average);

    }
}