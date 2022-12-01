package ThucHanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    private static final String NAME_REGEX="^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(NAME_REGEX);
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        Matcher matcher= pattern.matcher(name);
        System.out.println(matcher.matches());
    }
}

