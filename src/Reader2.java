import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader2 {

    String read() {
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

/* String read() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("Catch exception");
        }
        return result; */