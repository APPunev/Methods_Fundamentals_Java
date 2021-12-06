import java.util.Scanner;

public class MultiplyEvenByOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int evenSum = getSumEvenDigits(Math.abs(input));
        int oddSum = getSumOddDigits(Math.abs(input));

        System.out.println(evenSum * oddSum);
    }

    private static int getSumEvenDigits(int number) {
        int evenSum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            number /= 10;
        }
        return evenSum;
    }

    private static int getSumOddDigits(int number) {
        int oddSum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            number /= 10;
        }
        return oddSum;
    }
}
