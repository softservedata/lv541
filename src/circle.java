import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Pi = 3.141592653589793238462643383279502;

        System.out.println("Please enter flower bed radius: ");
        double radius = in.nextInt();
        double perimeter = 2*Pi*radius;
        System.out.println("The perimeter of the flower bed equals: " + perimeter);
    }
}
