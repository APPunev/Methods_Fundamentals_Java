import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 8) {
            for (int i = 17; i <= n; i++) {
                String textNumber = String.valueOf(i);
                if (sumOfDigits(textNumber) && checkOddDigit(textNumber)) {
                    System.out.println(i);
                }
            }
        }

    }

    private static boolean checkOddDigit(String num) {
        for (int i = 0; i < num.length() ; i++) {
            char current = num.charAt(i);
            int convertedNumber = Character.getNumericValue(current);
            if (convertedNumber % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean sumOfDigits(String number) {
        int sum = 0;
        for (int index = 0; index < number.length(); index++) {
            char current = number.charAt(index);
            int convertedNumberInt = Character.getNumericValue(current);
            sum += convertedNumberInt;
        }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }
}
