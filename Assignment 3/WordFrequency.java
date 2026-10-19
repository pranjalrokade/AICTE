import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> checked = new ArrayList<>();

        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            sc.useDelimiter("[^a-zA-Z0-9]+");

            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();
                words.add(word);
            }

            sc.close();

            FileWriter fw = new FileWriter("output.txt");

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);

                if (!checked.contains(word)) {
                    int count = 0;

                    for (int j = 0; j < words.size(); j++) {
                        if (word.equals(words.get(j))) {
                            count++;
                        }
                    }

                    fw.write(word + " : " + count + "\n");
                    checked.add(word);
                }
            }

            fw.close();

            System.out.println("Word frequency calculated.");
            System.out.println("Result saved in output.txt");

        } catch (IOException e) {
            System.out.println("File not found or file error.");
        }
    }
}
