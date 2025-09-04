import java.util.Scanner;

public class anotherHomework3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x >= 0) {
            for (int i = 0; i <= x; i++) {
                sum += 1;
            }
        }else {
            for (int i = 0; i >= x; i--) {
                sum += 1;
            }
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum );
    }
}
