import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Accept Numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
