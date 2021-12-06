public class demo {
    public static void main(String[] args) {
        int n = -12345;
        int oddSum = 0;
        for (int i = n; i >= 0 ; i--) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                oddSum += Math.abs(lastDigit);
            }
            n /= 10;
        }
        System.out.println(oddSum);
    }
}
