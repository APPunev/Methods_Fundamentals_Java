import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int powers = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(mathPowers(number,powers)));
    }

    private static double mathPowers(double number, int powers) {
        double result = Math.pow(number,powers);
        return result;
    }
}
