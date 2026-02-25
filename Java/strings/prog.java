import java.util.Scanner;

class prog {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        String name[] = new String[5];
        int n = name.length;

        System.out.println("Enter Words in strings : ");
        
        for(int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
        }

        System.out.println("Print the strings that starts with Sa");

        for(int i = 0; i < n; i++) {
            if(name[i].startsWith("Sa")) {
                System.out.println(name[i]);
            }
        }
    }
}
