package ku.util;

/**
 * A LineCopyTask that copy the input to output by using BufferedReader and PrintWriter.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 3/3/2017 AD.
 */
public class LineCopyTask extends FileCopyTask{
    /**
     * Initialize object and set the input and output
     *
     * @param infilename is a file name.
     * @param outfilename is the directory that will be write file.
     */
    public LineCopyTask(String infilename, String outfilename){
        super.setInput(infilename);
        super.setOutput(outfilename);

    }
    /**
     * Run the copy method.
     */
    public void run(){
        FileUtil.bcopy(super.in,super.out);
    }
    /**
     * Print a copy message.
     *
     * @return message ti tell about something.
     */
    public String toString(){
        return "Copy file one line at a time";
    }
}

