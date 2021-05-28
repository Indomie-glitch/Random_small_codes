import java.util.Random;

public class CvFRandom {

        public static void main(String args[]){

            Random r = new Random();
            System.out.println("This is a calculator to convert Fahrenheit to Celsius cause Fahrenheit sucks!");
            System.out.println("Please enter the value for f(Fahrenheit)");
            int f = r.nextInt(100)+0;
            System.out.println("Calculating...");
            int a = f-32;
            double c = a / 1.8;
            System.out.println("That is "+c+ "in CELSIUS ");

        }
}
