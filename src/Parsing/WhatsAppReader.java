package Parsing;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ben on 23/01/17.
 */
public class WhatsAppReader {
    private DataMap dataMap = new DataMap();
    private List<String> lines = new LinkedList<>();
    private List<String> keywords = new LinkedList<>();

    /*
        Creates a WhatsAppReader from a file and immediately splits the input
        into lines for reading.
     */
    public WhatsAppReader(File inputFile) {
        if (!inputFile.canRead()) {
            System.err.println("Cannot read WhatsApp source file: "
                    + inputFile.toString());
        }
        List<String> lines = splitLines(inputFile);
    }

    /*
        Reads a file and returns a List<String> corresponding to the lines of
        the file.
     */
    private List<String> splitLines(File file) {
        // Initialise list of lines to be returned
        List<String> lines = new LinkedList<>();
        // File reader to access file
        FileReader fReader;

        // Read file if it can be found
        try {
            fReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.err.println("Could not find WhatsApp source file: "
                    + file.toString());
            return null;
        }

        BufferedReader bReader = new BufferedReader(fReader);

        // Loops while the read line is not null and adds it to the list
        String nextLine;
        do {
            try {
                nextLine = bReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                nextLine = null;
            }
            lines.add(nextLine);
        } while (nextLine != null);

        return lines;
    }

    /*
        Counts the occurrances of the keyword in the data and adds it to the
        list of keywords
     */
    private void CountKeyword(String keyword) {

    }
}
