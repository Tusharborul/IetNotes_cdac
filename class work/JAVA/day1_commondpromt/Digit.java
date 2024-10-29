import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        for (; n != 0; n /= 10) {
            int rem = n % 10;
            sum = sum + rem;

        }
        System.out.println("Sum of digit is :" + sum);
        sc.close();
    }

}
