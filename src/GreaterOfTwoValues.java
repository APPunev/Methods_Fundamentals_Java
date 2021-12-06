import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        switch (type){
            case "int":
                int firstNum = Integer.parseInt(a);
                int secondNum = Integer.parseInt(b);
                break;
            case "char":
                char firstCh = a.charAt(0);
                char secondCh = b.charAt(0);
                break;
            case "string":
                String first = a;
                String second = b;
                break;
        }
        System.out.println(getMax(a,b));
    }

    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    private static char getMax(char firstCh, char secondCh) {
        if (firstCh > secondCh) {
            return firstCh;
        }
        return secondCh;
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >- 0) {
            return first;
        }
        return second;
    }
}
