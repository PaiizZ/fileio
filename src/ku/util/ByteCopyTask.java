package ku.util;

/**
 * A ByteCopyTask that copy the input to output by limit the array size.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 3/3/2017 AD.
 */
public class ByteCopyTask extends FileCopyTask {
    /**
     * is a limit size of an array
     */
    private int sizeBlock;

    /**
     * Initialize object and set the input and output
     *
     * @param infilename is a file name.
     * @param outfilename is the directory that will be write file.
     * @param sizeBlock is a limit size of an array.
     */
    public ByteCopyTask(String infilename, String outfilename, int sizeBlock) {
        super.setInput(infilename);
        super.setOutput(outfilename);
        this.sizeBlock = sizeBlock;
    }

    /**
     * Run the copy method.
     */
    public void run() {
        FileUtil.copy(super.in, super.out, this.sizeBlock);
    }

    /**
     * Print a copy message.
     *
     * @return message ti tell about something.
     */
    public String toString() {
        return "Copy file " + this.sizeBlock / Byte.SIZE + " kilobyte at a time";
    }
}
