import java.util.Scanner;

public class BankWithdrawalLogic{
    public static void main(String[] args){

        int balance = 1000;
        int amount = 0;
      
        System.out.println("***ATM WITHDRAWAL LOGIC***");
        Scanner scanner = new Scanner(System.in);

        while (balance > amount){
            System.out.print("Enter amount to withdraw: ");
            amount = scanner.nextInt();

            balance -= amount;
            
            System.out.println("Balance: " + balance);
        }

        scanner.close();
    }
}