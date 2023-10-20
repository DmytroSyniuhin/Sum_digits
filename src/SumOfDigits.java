public class SumOfDigits {
    public static void main(String[] args) {
        int random = (int) (11 + Math.random() * 100_001);

        System.out.println("Випадкове число в діапазоні від 11 до 100_011: " + random);

        int sumOfDigits = 0;

        while (random / 10 - 1 > 0) {
            int newDigits = random % 10;
            sumOfDigits += newDigits;

            random /= 10;

            if (random < 10) {
                sumOfDigits += random;
                break;
            }
        }
        System.out.println("Сума всіх розрядів цього числа: " + sumOfDigits);
    }
}