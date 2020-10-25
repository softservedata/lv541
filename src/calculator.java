import java.util.Scanner;

public class calculator {
    public static void main (String[] args){
        //Addition
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number for addition: ");
        int a = in.nextInt();
        System.out.println("Enter the second number for addition: ");
        int b = in.nextInt();
        int c = a + b;
        System.out.println("Equals: " + c);

        //Subtraction
        System.out.println("Enter the first number for subtraction: ");
        int d = in.nextInt();
        System.out.println("Enter the second number for subtraction: ");
        int e = in.nextInt();
        int f = d - e;
        System.out.println("Equals: " + f);

        //Multiplication
        System.out.println("Enter the first number for multiplication: ");
        int g = in.nextInt();
        System.out.println("Enter the second number for multiplication: ");
        int h = in.nextInt();
        int i = g * h;
        System.out.println("Equals: " + i);

        //Division
        System.out.println("Enter the first number for division: ");
        int j = in.nextInt();
        System.out.println("Enter the second number for division: ");
        int k = in.nextInt();
        int l = j / k;
        System.out.println("Equals: " + l);
        System.out.println("Your results - " + "Addition: " + c + "; Subtraction: " + f + "; Multiplication: " + i + "; Division: " + l);
    }
}
