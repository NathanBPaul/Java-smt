import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            long reversed = 0;
            while (number > 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }
            System.out.println("Reversed number = " + reversed);
        }
        sc.close();
    }
}
