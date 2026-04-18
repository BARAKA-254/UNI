import java.util.Scanner;

public class LoanEligibilityProgram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Monthly Salary: ");
        Double salary = scanner.nextDouble();

        if(age >= 21 && salary>= 21000){
            System.out.println("Congratulations " + name + ", You are Eligible for a Loan: ");
        }
        else if(age < 21 || salary < 21000){
            System.out.println("Unfortunately, we are unable to offer you a loan at the time.");
        }
        else{
            System.out.println("Invalid inpuut!! ");
        }

        scanner.close();
    }
}
