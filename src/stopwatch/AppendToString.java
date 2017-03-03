package stopwatch;

/**
 * AppendToString, this is task to measure the elapsed time between combining CHAR to String.
 * You can change the count of a counter.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public class AppendToString implements Runnable {

    private String result;

    /**
     * Constructor for a new AppendToString.
     * Set new count for run in loop.
     *
     * @param count is the counter, type is int
     */
    public AppendToString(int count) {
        this.result = "";
        TaskTimer.count = count;
    }

    /**
     * to run this task that combining CHAR to String.
     */
    public void run() {
        int k = 0;
        while (k++ < TaskTimer.count) {
            this.result = this.result + TaskTimer.CHAR;
        }
    }

    /**
     * To print the describes the task and a constructor to initialize the task.
     *
     * @return a string of information and count.
     */
    public String toString() {
        return String.format("Append %,d chars to String\n", TaskTimer.count) + String.format("final string length = " + this.result.length());
    }

}
