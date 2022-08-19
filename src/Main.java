import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static int validPasswords = 0;

    public static void main(String[] args) {

        // List of Passwords to be taken in type-safe form
        ArrayList<PasswordContainer> arr = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("inputs/input.txt"))) {
            String line;

            Pattern r = Pattern.compile("(\\d+)-(\\d+)\\s+([a-z]):\\s+(\\w+)");

            while ((line = reader.readLine()) != null) {
                Matcher m = r.matcher(line);

                if (m.find()) {
                    arr.add(new PasswordContainer(
                                Integer.parseInt(m.group(1)),
                                Integer.parseInt(m.group(2)),
                                m.group(3).charAt(0),
                                m.group(4))
                    );
                }
            }
        } catch (IOException x) {
            System.err.format("Input file: failed reading %s%n", x);
        }

        // TEST
        for (PasswordContainer p : arr) {
            long count = p.stringC.chars().filter(ch -> ch == p.checkC).count();
            if (count >= p.minC && count <= p.maxC) validPasswords++;
        }

        System.out.println(validPasswords);
    }
}