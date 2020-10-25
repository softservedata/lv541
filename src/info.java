import java.util.Scanner;

public class info {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = in.nextLine();
        System.out.println("Where are you living?: ");
        String address = in.nextLine();
        System.out.println("Your name is: " + name + ". You are living in: " + address );
    }
 }
