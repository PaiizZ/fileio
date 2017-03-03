package stopwatch;

/**
 * SumDuble, this is task to measure the elapsed time between summation the values type DoublePrimitive object.
 * You can change the count of a counter.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public class SumDoublePrimitive implements Runnable {
    /**
     * The array type Double object.
     */
    private double[] values = new double[TaskTimer.ARRAY_SIZE];
    /**
     * The result of summation Double object.
     */
    private double sum = 0.0;

    /**
     * Constructor for a new SumDoublePrimitive.
     * Set new count for run in loop.
     *
     * @param count is the counter, type is int
     */
    public SumDoublePrimitive(int count) {
        TaskTimer.count = count;
    }


    /**
     * to run this task that summation the array of DoublePrimitive object.
     */
    public void run() {
        // create array of values to add, before we start the timer.
        for (int k = 0; k < TaskTimer.ARRAY_SIZE; k++) values[k] = k + 1;
        // count = loop counter, i = array index
        for (int count = 0, i = 0; count < TaskTimer.count; count++, i++) {
            if (i >= TaskTimer.ARRAY_SIZE) i = 0;
            this.sum = this.sum + values[i];
        }
    }

    /**
     * To print the describes the task and a constructor to initialize the task.
     *
     * @return a string of information and count.
     */
    public String toString() {
        return String.format("Sum array of double primitives with count=%,d\nSum = " + this.sum, TaskTimer.count);
    }
}
