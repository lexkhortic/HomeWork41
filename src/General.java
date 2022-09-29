import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите пароль: ");
        String password = reader.readLine();
        if (password.length() < 8) {
            System.out.println("NO");
        } else {
            System.out.println(isReliable(password));
        }
    }

    public static String isReliable(String password) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\d+");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
