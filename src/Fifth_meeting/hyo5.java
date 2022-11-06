package Fifth_meeting;

import java.util.Timer;
import java.util.TimerTask;

public class hyo5 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("beep");
            }
        };
        timer.schedule(timerTask,1000,1000);
    }
}
