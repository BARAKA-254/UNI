import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args){

        System.out.println("************************************");
        System.out.println("*** COMPOUND INTEREST CALCULATOR ***");
        System.out.println("************************************");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal Amount: ");
        double Principal = scanner.nextDouble();

        System.out.print("Enter Time(Period): ");
        double time = scanner.nextDouble();

        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();

        double Interest = calculateInterest(Principal, time, rate);

        System.out.println("INTEREST: " + Interest);

        scanner.close();
    }

    public static double calculateInterest(double Principal, double time, double rate){
        return 0;
    }
}
