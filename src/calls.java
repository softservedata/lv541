import java.util.Scanner;

public class calls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //first country
        System.out.println("Please enter a price for first country per min$: ");
        float a1 = in.nextFloat();
        System.out.println("Please enter phone call duration(min): ");
        float b1 = in.nextFloat();
        float c1 = a1 * b1;
        System.out.println("Price for the first call: " + c1);

        //second country
        System.out.println("Please enter a price for second country per min$: ");
        double a2 = in.nextFloat();
        System.out.println("Please enter phone call duration: ");
        double b2 = in.nextFloat();
        double c2 = a2 * b2;
        System.out.println("Price for the second call: " + c2);

        //third country
        System.out.println("Please enter a price for third country per min$: ");
        double a3 = in.nextFloat();
        System.out.println("Please enter phone call duration: ");
        double b3 = in.nextFloat();
        double c3 = a3 * b3;
        System.out.println("Price for the third call: " + c3);

        //total
        double c4 = c1 + c2 +c3;
        System.out.println("Your total price is: " + c4 + " Because of first call has: " + c1 + "$, Second call has: " + c2 + "$, Third call has: " + c2 + "$.");

    }

}
