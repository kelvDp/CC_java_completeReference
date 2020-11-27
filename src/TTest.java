/*
The following program demonstrates Timer and TimerTask. It defines a
timer task whose run( ) method displays the message "Timer task executed."
This task is scheduled to run once every half second after an initial delay of one
second.
*/

import java.util.Timer;
import java.util.TimerTask;

public class TTest {
    public static void main(String[] args) {
        Timer myTimer = new Timer();
        MyTimerTask myTask = new MyTimerTask();

        // set an initial delay of 1 second,
        // then repeat every half second
        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // do something
        }

        myTimer.cancel();
    }
}

class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Timer task executed.");
    }
}