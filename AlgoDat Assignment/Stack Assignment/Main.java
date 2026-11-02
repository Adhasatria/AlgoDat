import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ekspresi infix: ");
        String infix = scanner.nextLine();

        try {
            System.out.println("Postfix: " + InfixToPostfix.convert(infix));
        } catch (IllegalArgumentException exception) {
            System.out.println("Ekspresi tidak valid: " + exception.getMessage());
        }
    }
}
