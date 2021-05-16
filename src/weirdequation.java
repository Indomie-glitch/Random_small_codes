import java.util.Scanner;

public class weirdequation {
    public static void main(String args[]){
        // All the values I need are x w z y t u
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will need a few values for a weird experimental equation");
        System.out.println("What is the value of x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the value of w");
        int w = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the value of z");
        int z = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the value of y");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the value of t");
        int t = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the value of u");
        int u = Integer.parseInt(scanner.nextLine());
        System.out.println("Calculating...");
        double p = 2 * x + 3 * y;
        double q = 5 * w + 6 * z;
        double r = (8 * t) / (5 * u);
        double c = p / q + r;
        System.out.println(Math.pow(c, 4));



    }
}
