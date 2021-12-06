import java.util.Scanner;

public class PalindromIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while(!text.equals("END")) {

            System.out.println(isPalondrom(text));

            text = scanner.nextLine();
        }
    }

    private static boolean isPalondrom(String text) {
        String reversed = "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            reversed += text.charAt(i);
        }
        if (reversed.equals(text)) {
            return true;
        }
        return false;
    }
}
