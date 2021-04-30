import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static void main(final String[] args) {
        readFile();
    }

    private static void readFile() {
        final List<Integer> vertices = new ArrayList<>();
        try (var reader = new BufferedReader(new FileReader("src/main/resources/kruskal-test1.txt"))) {
            final var verticesArray = reader.readLine().split(",");
            for (String number : verticesArray) {
                vertices.add(Integer.valueOf(number));
            }
            vertices.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("File Read Error");
        }
    }
}
