import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        printTop(weight);
        printBottom(weight);
    }

    private static void printTop(int weight) {
        for (int length = 1; length < weight; length++) {
            printSingleLine(length);
        }
    }

    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printBottom(int weight) {
        for (int length = weight; length >= 1 ; length--) {
            printSingleLine(length);
        }
    }
}
