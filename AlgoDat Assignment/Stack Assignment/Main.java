import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan ekspresi infix: ");
            System.out.println("Postfix: " + InfixToPostfix.convert(scanner.nextLine()));
        } catch (IllegalArgumentException exception) {
            System.out.println("Ekspresi tidak valid: " + exception.getMessage());
        }
    }
}
