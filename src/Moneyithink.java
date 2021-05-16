import java.util.Scanner;

public class Moneyithink {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        //Hello There
        // This is what I am supposed to do
        //WAP to input principal, rate and time and find the compound interest and total amount using following formula -
        //A = p(1 +r/100)t  where A is the total amount
        System.out.println("We are going to find the total amount using this calculator");
        System.out.println("We will need 3 values Principal, Rate and Time");
        System.out.println("What is the Principal");
        int Principal = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the rate");
        int Rate = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the time");
        int Time = Integer.parseInt(scanner.nextLine());
        double middle = 1 + Rate/100;
        double TotalAmount = Principal * middle * Time;
        System.out.println("When you compound " + Principal + " For " + Time + " years long, with a interest rate of " + Rate + " You will get " + TotalAmount + " Whatever currency you are using");

    }
}
