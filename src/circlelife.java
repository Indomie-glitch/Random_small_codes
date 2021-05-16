import java.util.Scanner;

public class circlelife {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will help you find the area AND circumference of a circle with just the radius");
        System.out.println("Please stat the radius of the circle");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Calculating");
        //Area is pi r ^2
        double Pi = 3.141592653589793;
        double area = (radius*radius) * Pi;
        System.out.println("This is the area = " + area);
        //Cir is 2xpixr
        double circumference = 2 * Pi * radius;
        System.out.println("This is the circumference = " + circumference);





    }
}
