import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            
            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (0 >= count) {
                    System.out.println("TASK COMPLETE!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
