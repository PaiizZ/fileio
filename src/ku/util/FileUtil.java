package ku.util;

import java.io.*;

/**
 * FileUtil is a class for copy method of input text and convert it to output.
 * @author Wanchanapon Thanwaranurak
 * @version  3/3/2017 AD.
 */
public class FileUtil {
    /**
     * Copy the input to the output by byte to byte at a time.
     * @param in is an input of a file.
     * @param out is an output of a file.
     */
    static void copy(InputStream in, OutputStream out) {
        int count;
        try {
            do {
                count = in.read();
                if (count < 0) break; // no more input
                out.write(count);
            } while (count >= 0);
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Copy the input to the output using a byte array that size are blocksize.
     * @param in is an input of a file.
     * @param out is an output of a file.
     * @param blocksize is a size of an array.
     */
    static void copy(InputStream in, OutputStream out, int blocksize) {
        byte[] buffer = new byte[blocksize];
        int count;
        try {
            do {
                count = in.read(buffer);
                if (count < 0) break; // no more input
                out.write(count);
            } while (count >= 0);
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    /**
     * Copy the input to the output using BufferedReader to read a file by one line to one line.
     * @param in is an input of a file.
     * @param out is an output of a file.
     */
    static void bcopy(InputStream in, OutputStream out) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        PrintWriter printWriter = new PrintWriter(out);
        String s;
        try {
            do {
                s = bufferedReader.readLine();
                if (s == null) break; // no more input
                printWriter.write(s);
            } while (s != null);
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
