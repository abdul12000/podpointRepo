package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    public static int extractAllNumbersFromXter(String xters) {
        int a =0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(xters);
        if(m.find()) {
           a=Integer.parseInt(m.group(0));
        }
        return a;
    }
}
