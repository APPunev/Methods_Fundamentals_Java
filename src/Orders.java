import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (product){
            case "coffee":
                price = 1.5;
                coffeePrice(price,quantity);
                break;
            case "water":
                price = 1;
                waterPrice(price,quantity);
                break;
            case "coke":
                price = 1.4;
                cokePrice(price,quantity);
                break;
            case "snacks":
                price = 2;
                snackPrice(price,quantity);
                break;
        }
    }

    private static void coffeePrice(double price, double quantity) {
        System.out.printf("%.2f", price*quantity);
    }

    private static void waterPrice(double price, double quantity) {
        System.out.printf("%.2f", price*quantity);    }

    private static void cokePrice(double price, double quantity) {
        System.out.printf("%.2f", price*quantity);    }

    private static void snackPrice(double price, double quantity) {
        System.out.printf("%.2f", price*quantity);    }
}
