import java.util.Scanner;

public class CvF {
    public static void main(String args[]){

        Scanner scanner = new Scanner (System.in);
        System.out.println("This is a calculator to convert Fahrenheit to Celsius cause Fahrenheit sucks!");
        System.out.println("Please enter the value for f(Fahrenheit)");
        int f = Integer.parseInt(scanner.nextLine());
        System.out.println("Calculating...");
        int a = f-32;
        double c = a / 1.8;
        System.out.println("That is "+c+ "in CELSIUS ");

    }

}
