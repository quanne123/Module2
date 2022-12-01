package ThucHanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    private static final String NAME_REGEX="[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$";
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(NAME_REGEX);
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        Matcher matcher= pattern.matcher(name);
        System.out.println(matcher.matches());
    }
}
