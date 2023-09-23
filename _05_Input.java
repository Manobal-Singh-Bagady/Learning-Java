import java.util.Scanner;

public class _05_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking integer input.
        System.out.print("Enter an Integer : ");
        int a = sc.nextInt();
        sc.nextLine();

        // taking String input.
        System.out.print("Enter a String : ");
        String b = sc.nextLine();

        System.out.println("The String Entered: " + b);
        System.out.println("The Number Entered: " + a);
    }
}
