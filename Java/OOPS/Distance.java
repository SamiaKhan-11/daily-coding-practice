
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int f1, f2;
        int i1, i2;

        System.out.print("Enter first distance (feet inches): ");
        f1 = sc.nextInt();
        i1 = sc.nextInt();

        System.out.print("Enter second distance (feet inches): ");
        f2 = sc.nextInt();
        i2 = sc.nextInt();

        int totalFeet = f1 + f2;
        int totalInches = i1 + i2;

        // Adjustment (1 foot = 12 inches)
        if (totalInches >= 12) {
            totalFeet = totalFeet + 1;
            totalInches = totalInches - 12;
        }

        System.out.println("Sum of Distances = " 
                + totalFeet + " feet " 
                + totalInches + " inches");
    }
}