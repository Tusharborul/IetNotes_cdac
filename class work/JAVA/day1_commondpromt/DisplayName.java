import java.util.*;

class DisplayName {
    public static void main(String[] args) {

        System.out.println("Enter names :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String nm = sc.next();
            System.out.println("Names :" + nm);

        }

        sc.close();

    }
}