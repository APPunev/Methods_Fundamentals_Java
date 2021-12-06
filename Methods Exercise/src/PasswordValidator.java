import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        boolean length = isValidLength(text);
        boolean content = isValidContent(text);
        boolean digitCount = isValidDigit(text);
        if (!length) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!content) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitCount) {
            System.out.println("Password must have at least 2 digits");
        }
        if (length && content && digitCount) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isValidDigit(String text) {
        int counter = 0;
        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            if (Character.isDigit(symbol)) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }

    private static boolean isValidContent(String text) {
        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidLength(String text) {
        return text.length() >= 6 && text.length() <= 10;
    }
}
