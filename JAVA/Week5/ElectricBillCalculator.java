import java.util.Scanner;

public class ElectricBillCalculator{
    public static void main(String[] args){

        double units;
        double totalBill;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units used: ");
        units = scanner.nextInt();

        totalBill = calculateElectricBill(units);

        System.out.printf("Total Bill: Ksh %.2f \n", totalBill);

        scanner.close();
    }

    public static double calculateElectricBill(double units){
        if(units < 0){
            System.out.println("Invalid Input");
            return 0;
        }
        else if(units <= 100){
            return 10 * units;
        }
        else if(units > 100 && units <= 200){
            return (10 * 100) + (15 * (units-100));
        }
        else{
            return (10 * 100) + (15 * 100) + (20 * (units - 200));
        }
    }
}