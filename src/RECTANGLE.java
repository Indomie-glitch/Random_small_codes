import java.util.Scanner;

public class RECTANGLE {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are going to calculate the area and perimeter of a rectangle. \n All we need is the length and width.");
        //WAP to input length and width of a rectangle and find area and perimeter.
        System.out.println("What is the length of the rectangle");
        double length = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the width of the rectangle");
        double width = Integer.parseInt(scanner.nextLine());
        System.out.println("We are going to calculate the Area and perimeter of your rectangle");
        double Perimeter = (2 * length) + (2 * width);
        double Area = length * width;
        System.out.println("The Perimeter of your rectangle is " + Perimeter + "\n" + "The Area of your rectangle is " + Area);


    }
}
