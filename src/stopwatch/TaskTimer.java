package stopwatch;

/**
 * A Tasktimer is setup the test of each tasks.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public class TaskTimer {

    /**
     * a word CHAR for test(can be changed).
     */
    public static final char CHAR = 'a';
    /**
     * size of the array used in floating point tasks.
     */
    static final int ARRAY_SIZE = 500000;
    /**
     * the loop counter used in the tasks (can be changed).
     */
    public static int count = 0;

    /**
     * Create timer for use StopWatch.
     */
    public static Stopwatch timer = new Stopwatch();

    /**
     * measureAndPrint is working of each tasks
     *
     * @param runnable is the task for test.
     */
    public static void measureAndPrint(Runnable runnable) {
        timer = new Stopwatch();
        timer.start();
        runnable.run();
        timer.stop();
        System.out.println(runnable.toString());
        System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
    }

}
