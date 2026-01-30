public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
            add(1, 2, 3, 4)
        );
        System.out.println(
            average(1, 2, 3, 4)
        );
        System.out.println(
            average()
        );
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;

        if (0 == numbers.length) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
