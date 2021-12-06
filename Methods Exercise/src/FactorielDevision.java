import java.util.Scanner;

public class FactorielDevision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        long fact1 = getFactorial(a);
        long fact2 = getFactorial(b);
        double result = (double)fact1 / fact2;
        System.out.printf("%.2f",result);
    }

    private static long getFactorial(double n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
//        Scanner scanner = new Scanner(System.in);
//
//        int first = Integer.parseInt(scanner.nextLine());
//        int second = Integer.parseInt(scanner.nextLine());
//
//        System.out.printf("%.2f", (double) factorial(first) / factorial(second));
//    }
//
//    private static double factorial(double n) {
//        if (n == 0)
//            return 1;
//        else
//            return (n * factorial(n - 1));
//    }

}
//https://pastebin.com/knA4nNuf