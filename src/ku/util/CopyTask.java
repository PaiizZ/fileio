package ku.util;

/**
 * A CopyTask that copy the input to output by byte to byte.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 3/3/2017 AD.
 */
public class CopyTask extends FileCopyTask {
    /**
     * Initialize object and set the input and output
     *
     * @param infilename  is a file name
     * @param outfilename is the directory that will be write file.
     */
    public CopyTask(String infilename, String outfilename) {
        super.setInput(infilename);
        super.setOutput(outfilename);
    }

    /**
     * Run the copy method.
     */
    public void run() {
        FileUtil.copy(super.in, super.out);
    }

    /**
     * Print a copy message.
     *
     * @return message ti tell about something.
     */
    public String toString() {
        return "Copy file one byte at a time";
    }
}
