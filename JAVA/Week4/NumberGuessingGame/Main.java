import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int guess = 0;
        int answer = -1;
        System.out.println("**************************");
        System.out.println("***NUMBER GUESSING GAME***");
        System.out.println("**************************");
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        answer = random.nextInt(20);

        while(guess != answer){
            System.out.print("Enter you guess(1-20): ");
            guess = scanner.nextInt();

            if(guess > answer){
                System.out.println("Too High!! Try Again!! ");
            }
            else{
                System.out.println("Too Low!! Try Again!!");
            }
        }
        
        System.out.println("GOT IT!! Answer: " + answer);
        
        scanner.close();
        
    }
}
