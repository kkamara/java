import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();
        scanner.close();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (0 > count) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(
            task, 
            0,
            1000
        );
    }
}
