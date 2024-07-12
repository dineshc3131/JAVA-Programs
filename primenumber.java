import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        System.out.println("Enter The number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println(num25);
        if (num == 0 || num == 1) {
            System.out.println(num + "is not a prime number");
        } else {
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    return;
                }
            }
            System.out.println(num + " is a prime number");
        }
    }
}
