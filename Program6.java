//import stuff here!
import java.util.Scanner;
//Your code here
public class Program4{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter the radius:");
        final double pi = 3.14159;
        double radius = 0;
        double area = 0;
        double circumference = 0;
        radius = myScanner.nextDouble();
        double diameter = radius * 2;
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        area = pi * radius * radius;
        System.out.println("The Area of the circle = " + area);
        circumference = pi * diameter;
        System.out.println("The Circumference of the circle = " + circumference);
    }
}
//Paste console output below:
/*


*/
