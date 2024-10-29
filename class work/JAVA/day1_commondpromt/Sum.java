import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Accept Numbers :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Numbers :");
            int n = sc.nextInt();
            if ((n % 5 == 0) || (n % 3 == 0) || (n % 11 == 0)) {
                sum = sum + n;
            }

        }
        System.out.println("Sum: " + sum); // Print the sum

        sc.close();
    }

}
