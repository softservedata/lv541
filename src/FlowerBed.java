import java.util.Scanner;

public class FlowerBed {
    static double square(double a){
        return a*a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * square(radius);
        System.out.println("Flower bed`s perimeter = " + perimeter);
        System.out.println("Flower bed`s area = " + area);
    }
}
