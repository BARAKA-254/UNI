import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("****************************************");
        System.out.println("***PASSWORD AUTHENTICATION SIMULATION***");
        System.out.println("****************************************");
        int setPassword = 1234;
        int password;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter your password: ");
            password = scanner.nextInt();

            System.out.println("Wrong Password!! Try Again!!");
        }while(setPassword != password);
        System.out.println("*********************");
        System.out.println("***Acces Granted!!***");
        System.out.println("*********************");

        scanner.close();
    }
}