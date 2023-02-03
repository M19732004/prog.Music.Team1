package Main;

import Music.Songs;

import java.sql.Time;
import java.util.*;

import static Main.Main.Stopwatch.interval;
import static Main.Main.Stopwatch.timer;

public class Main {
    public static void main(String[] args) {


        List<Songs> songsList = new ArrayList<>();
        songsList.add(new Songs("Bohemian Rhapsody",6));
        songsList.add(new Songs("Sweet Child O', Mine",5.03));



        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds => : ");
        String secs = sc.nextLine();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());

            }
        }, delay, period);
    }


    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
    public class Stopwatch {
        static int interval;
        static Timer timer;
    }
}
