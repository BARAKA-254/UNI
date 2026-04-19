import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        // count down program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the higher number to count down from: ");
        int max = scanner.nextInt();

        System.out.print("Enter the lowest number to count upto: ");
        int min = scanner.nextInt();

        for(int i = max; i >= min; i--){
            System.out.println(i);
        }
    }
}