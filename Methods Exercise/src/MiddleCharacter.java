import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (text.length() % 2 != 0) {
            textIsOdd(text);
        }else{
            textIsEven(text);
        }
    }
// s o m e T e x t
// 0 1 2 3 4 5 6 7
    private static void textIsEven(String text) {
        int charIndex = (text.length() - 1) / 2;
        System.out.print(text.charAt(charIndex));
        System.out.print(text.charAt(charIndex + 1));
    }

    private static void textIsOdd(String text) {
        int charIndex = (text.length() - 1) / 2;
        System.out.print(text.charAt(charIndex));
    }
}
