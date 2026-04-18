import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args){

        System.out.println("****************************");
        System.out.println("**EXAM ELIGIBILITY PROGRAM**");
        System.out.println("****************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Classes Attended: ");
        int attended = scanner.nextInt();

        System.out.print("Enter Student Marks: ");
        int marks = scanner.nextInt();
 
        double attendance = Math.round((attended * 100) / 14);
        System.out.println();

        System.out.printf("Attendance: %.0f \n" , attendance);
        System.out.println("Marks: " + marks);

        if(attendance >= 75 && marks >= 40){
            System.out.println("ELIGIBLE");
        }
        else{
            System.out.println("NOT ELIGIBLE!!");
        }
        
        scanner.close();

    }
}
