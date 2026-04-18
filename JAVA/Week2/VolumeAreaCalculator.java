import java.util.Scanner;

public class VolumeAreaCalculator {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double area = circleArea(radius, height);
        double volume = circleVolume(radius, height);


        System.out.println();
        System.out.printf("The Volume of the cylinder is: %.2f \n", volume);
        System.out.printf("The Surface area of the cylinder is: %.2f \n", area);
        scanner.close();
    }

    public static double circleVolume(double radius, double height){
        return Math.PI * radius * radius * height;
    }

    public static double circleArea(double radius, double height){
        return Math.PI * 2 * radius * radius + Math.PI * 2 * radius * height;
    }
}
