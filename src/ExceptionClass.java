import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionClass implements Cloneable{

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("ali");
            var value = reader.read();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            reader.close();
        }
    }
}