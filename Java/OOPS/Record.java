import java.util.Scanner;

class Record 
{
    // Data Members
    String name[] = new String[50];
    int rnk[] = new int[50];

    // Constructor
    Record() 
    {
        // Arrays are already initialized
    }

    // Method to read values
    void readvalues() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (max 50): ");
        int n = sc.nextInt();
        sc.nextLine();   // consume newline

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            name[i] = sc.nextLine();

            System.out.print("Enter rank of student " + (i + 1) + ": ");
            rnk[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    // Method to display all records
    void display() 
    {
        System.out.println("\nStudent Records:");
        for (int i = 0; i < name.length && name[i] != null; i++) 
        {
            System.out.println("Name: " + name[i] + "  Rank: " + rnk[i]);
        }
    }
}