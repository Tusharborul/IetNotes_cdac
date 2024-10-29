
class AdditionOfPrime{
    public static void main(){

    int a=97;
    if(prime(a)) {
    	System.out.println("it is prime no");
    }

}  
   public static boolean prime(int n){
    boolean isPrime = true; // Start by assuming n is prime

    if (n <= 1) { // Check for numbers less than or equal to 1
        isPrime = false;
    } else if (n == 2) { // 2 is prime
        isPrime = true;
    } else {
        for (int i = 2; i <n; i++) { // Check up to the square root of n
            if (n % i == 0) {
                isPrime = false; // n is divisible by i, so it's not prime
                break; // Exit the loop
            }
        }
    }  return isPrime;
}
         }
       
