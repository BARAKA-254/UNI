import java.util.Scanner;

public class InternetBundleMenu {
    public static void main(String[] args){

        System.out.println("*********************");
        System.out.println("*DATA BUNDLE PROGRAM*");
        System.out.println("*********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select data bundle: ");
        System.out.println("1. 100MB @ 50 KES   ");
        System.out.println("2. 500MB @ 200 KES  ");
        System.out.println("3. 1GB   @ 350 KES  ");
        System.out.println("4. 2GB   @ 600 KES  ");

        System.out.print("Enter your choice(1-4): ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 ->   System.out.println("You selected 100MB, Cost: 50");
                
            case 2 ->   System.out.println("You selected 500MB, Cost: 200");

            case 3 ->   System.out.println("You selected 1GB, Cost: 350");

            case 4 ->   System.out.println("You selected 2GB, Cost: 600");
        
            default -> System.out.println("Invalid Choice");
        
        };

        scanner.close();
    }
}
