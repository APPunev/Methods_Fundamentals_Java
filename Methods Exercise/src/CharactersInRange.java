import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printCharacter(a,b);

    }

    public static void printCharacter (char a, char b){
        if (a < b) {
            printFromTheFirst(a,b);
        } else{
            printFromTheSecond(a,b);
        }
    }

    private static void printFromTheSecond(char a, char b) {
        for (char symbol =  (char)(b + 1); symbol < a; symbol++) {
            System.out.print(symbol + " ");
        }
    }

    private static void printFromTheFirst(char a, char b) {
        for (char symbol =  (char)(a + 1); symbol < b; symbol++) {
            System.out.print(symbol + " ");
        }
    }
}
