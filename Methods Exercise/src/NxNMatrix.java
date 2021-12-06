import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printCol(n);
    }

    private static void printCol(int length) {
        for (int i = 1; i <= length ; i++) {
            System.out.print(length);
            printRow(length);
        }
    }

    private static void printRow(int count) {
        for (int row = 0; row < count - 1; row++) {
            System.out.print(" " + count);
        }
        System.out.println();
    }
}
