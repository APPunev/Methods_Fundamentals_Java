import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = vowelsCount(text.toLowerCase());
        System.out.println(count);
    }

    private static int vowelsCount(String text) {
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            char currentSympol = text.charAt(index);
            switch (currentSympol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;

            }
        }
        return count;
    }

}
