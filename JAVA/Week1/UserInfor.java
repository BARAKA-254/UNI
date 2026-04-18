import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class UserInfor{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your height in cm: ");
        Double height = scanner.nextDouble();

        System.out.print("Enter bank balance: ");
        Double balance = scanner.nextDouble();

        System.out.print("Enter Phone Number: ");
        int number = scanner.nextInt();

        System.out.println("******************");
        System.out.println("**** USER DATA ***");
        System.out.println("******************");
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Bank Balance: " + balance);
        System.out.println("Phone Number: " + number);

        scanner.close();
    }
}