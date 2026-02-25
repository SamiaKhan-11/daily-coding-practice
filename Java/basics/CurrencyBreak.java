import java.util.Scanner;

public class CurrencyBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int n2000 = amount / 2000;
        amount = amount % 2000;

        int n500 = amount / 500;
        amount = amount % 500;

        int n200 = amount / 200;
        amount = amount % 200;

        int n100 = amount / 100;
        amount = amount % 100;

        int n50 = amount / 50;
        amount = amount % 50;

        int n20 = amount / 20;
        amount = amount % 20;

        int n10 = amount / 10;
        amount = amount % 10;

        int n5 = amount / 5;
        amount = amount % 5;

        int n1 = amount;

        System.out.println("\nBreakdown of amount:");
        System.out.println("2000 X " + n2000);
        System.out.println("500 X " + n500);
        System.out.println("200 X " + n200);
        System.out.println("100 X " + n100);
        System.out.println("50 X " + n50);
        System.out.println("20 X " + n20);
        System.out.println("10 X " + n10);
        System.out.println("5 X " + n5);
        System.out.println("1 X " + n1);

        sc.close();
    }
}
