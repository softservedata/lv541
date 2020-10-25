import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much cost the call of the first country per minute?");
        double c1 = scanner.nextDouble();
        System.out.println("How long have you been talking?");
        double t1 = scanner.nextDouble();
        double result1 = c1*t1;
        System.out.println("The price of the call is " + result1);
        System.out.println("How much cost the call of the second country per minute?");
        double c2 = scanner.nextDouble();
        System.out.println("How long have you been talking?");
        double t2 = scanner.nextDouble();
        double result2 = c2*t2;
        System.out.println("The price of the call is " + result2);
        System.out.println("How much cost the call of the third country per minute?");
        double c3 = scanner.nextDouble();
        System.out.println("How long have you been talking?");
        double t3 = scanner.nextDouble();
        double result3 = c3*t3;
        System.out.println("The price of the call is " + result2);
        System.out.println("The total cost of calls is " + (result1 + result2 + result3));

    }
}
