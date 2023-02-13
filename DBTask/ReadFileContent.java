package DBTask;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFileContent {
    public static String inputFile = "input.txt";
    public static String resultsFile = "results.txt";

    public int countWordInFile(String wordToBeSearched) throws IOException {
        File file = new File(inputFile);
        String[] words = null;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            words = line.split(" ");
            for (String word : words) {
                if (word.equals(wordToBeSearched)) {
                    count++;
                }
            }
        }

        return count;
    }

    public void writeToFile(String word, File file) throws IOException {
        String toBeWrittenInTxtFile = "The given word " + word + " is present for " + countWordInFile(word) + " times in the file";
        FileWriter fWriter = new FileWriter(resultsFile);
        fWriter.write(toBeWrittenInTxtFile);
        fWriter.close();
        System.out.println("File is created successfully with the content.");
    }

    public void extractResultsInAMap() throws IOException {
        File file = new File(inputFile);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        long lineNumber = 0;
        Map<String, List<Long>> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            lineNumber++;
            if (!map.containsKey(line)) {
                map.put(line, new ArrayList<Long>());
            }
            map.get(line).add(lineNumber);
        }
        br.close();

        for (Map.Entry<String, List<Long>> element : map.entrySet()) {
            System.out.println("Word " + element.getKey() + " was found " + countWordInFile(element.getKey()) + " times on lines: " + element.getValue());
        }

    }
}
