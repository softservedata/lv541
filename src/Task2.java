import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String address = scanner.nextLine();
        System.out.println("What is your name?");
        System.out.println("Where do you live, " + name + " ?");
        System.out.println("I live on " + address + " street.");
    }
}
