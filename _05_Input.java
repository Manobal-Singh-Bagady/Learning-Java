import java.util.Scanner;

public class _05_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a input : ");
        int a = sc.nextInt();
        String b = sc.nextLine();
        System.out.println("The Number Entered: " + a);
        System.out.println("The String Entered: " + b);
    }
}
