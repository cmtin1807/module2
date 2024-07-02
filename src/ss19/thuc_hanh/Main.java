package ss19.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(https://|http://)+(www.|)+[A-Za-z0-9]+.vn");
        Matcher matcher = pattern.matcher("http://codegym.vn");
        System.out.println(matcher.matches());

    }
}
