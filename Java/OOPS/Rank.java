class Rank extends Record 
{
    // Data Member
    int index;

    // Constructor
    Rank() 
    {
        super();      // calling base class constructor
        index = 0;    // initialize index
    }

    // Method to find highest rank (without sorting)
    void highest() 
    {
        int minRank = rnk[0];  // assume first rank is highest

        for (int i = 1; i < name.length && name[i] != null; i++) 
        {
            if (rnk[i] < minRank)   // smaller rank is better
            {
                minRank = rnk[i];
                index = i;
            }
        }
    }

    // Overriding display method
    void display() 
    {
        super.display();  // display all records first

        System.out.println("\nTopmost Rank Holder:");
        System.out.println("Name: " + name[index] + 
                           "  Rank: " + rnk[index]);
    }
}