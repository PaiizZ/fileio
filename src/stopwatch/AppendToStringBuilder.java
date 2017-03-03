package stopwatch;

/**
 * AppendToString, this is task to measure the elapsed time between combining CHAR to StringBuilder.
 * You can change the count of a counter.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public class AppendToStringBuilder implements Runnable {
    /**
     * The result StringBuilder of combining CHAR.
     */
    private StringBuilder builder = new StringBuilder();

    /**
     * Constructor for a new AppendToStringBuilder.
     * Set new count for run in loop.
     *
     * @param count is the counter, type is int
     */
    public AppendToStringBuilder(int count) {
        TaskTimer.count = count;
    }


    /**
     * to run this task that combining CHAR to StringBuilder.
     */
    public void run() {
        int k = 0;
        while (k++ < TaskTimer.count) {
            builder = builder.append(TaskTimer.CHAR);
        }
    }

    /**
     * To print the describes the task and a constructor to initialize the task.
     *
     * @return a string of information and count.
     */
    public String toString() {
        return String.format("Append %,d chars to StringBuilder", TaskTimer.count) + String.format("final string length = " + this.builder.length());
    }
}
