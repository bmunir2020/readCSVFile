import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    public static void main(final String[] args) {
        readFile();
    }

    private static void readFile() {
        try (var reader = new BufferedReader(new FileReader("src/main/resources/kruskal-test1.txt"))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("File Read Error");
        }
    }
}
