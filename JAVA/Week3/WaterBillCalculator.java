import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number units consumed: ");
        int units = scanner.nextInt();
        int bill;

        if(units >= 0 && units <= 30){
            bill = units * 20;
            System.out.println("Total bill: " + bill);
        }
        else if(units >=31 && units <=60){
            int midLimit = units - 30;

            bill = (30*20) + (midLimit * 25);
            System.out.println("Total bill: " + bill);
        }
        else if(units >= 61){
            int upperLimit = units - 60;

            bill = (30*20) + (30*25) + (upperLimit * 30);
            System.out.println("Total Bill: " + bill);
        }
        else{
            System.out.println("Invalid Input");
        }

        scanner.close();
    }
}
