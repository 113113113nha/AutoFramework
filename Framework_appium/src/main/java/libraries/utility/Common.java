package libraries.utility;

import org.springframework.util.StopWatch;

/**
 * Created by User on 5/10/2016.
 */
public class Common {
    private static boolean debugFlag = true;
    private static StopWatch watch;

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * get logInfo to console
     *
     * @param text
     */
    public static void logInfo(String text) {
        System.out.println("---" + text);
    }

    public static void logDebug(String text) {
        if (debugFlag) {
            System.out.println("---" + text);
        }
    }

    public static void setDebugLog(boolean value) {
        debugFlag = value;
    }

    public static void startTimeWatcher() {
        watch = new StopWatch();
        watch.start();
    }

    public static void stopTimeWatcher() {
        watch.stop();
    }

    public static void showElapsedTimeInMinutes() {
        Common.logInfo(String.format("Total elapsed execution time: %f minutes.", watch.getTotalTimeSeconds() / 60));
    }

    public static StringBuilder getClassName() {
        StringBuilder name = new StringBuilder(Thread.currentThread().getStackTrace()[2].getClassName());
        return name;
    }

    public static final StringBuilder getMethod() {
        StringBuilder name = new StringBuilder(Thread.currentThread().getStackTrace()[2].getMethodName());
        return name;
    }

}
