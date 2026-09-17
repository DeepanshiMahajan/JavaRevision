package Functions;

public class PrimeNo {
    public static boolean prime(int n){
        boolean isPrime = true;
        if(n == 2)return true;

        for(int i =2; i< Math.sqrt(n); i++){
            if(n % 2 == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(prime(5));
    } 
}
