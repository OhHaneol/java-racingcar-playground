import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    int sum(String[] text) {
        int sum = 0;
        for(int i = 0;i < text.length;i++) {
            sum += Integer.parseInt(text[i]);
        }
        return sum;
    }

    int splitAndSum(String text) throws Exception {

        int number;
        boolean isNumeric = text.matches("[+-]?\\d*(\\.\\d+)?");


        if(text == null)  return 0;

        if(isNumeric) {
            return number = Integer.parseInt(text);
        }

        if() {
            String[] numbers = text.split(",");
            sum(numbers);
        }

        if() {
            String[] tokens = text.split(",|:");
            sum(tokens);
        }

        if() {
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
            if(m.find()) {
                String customDelimiter = m.group(1);
                String[] tokens = m.group(2).split(customDelimiter);
                sum(tokens);
            }
        }

    }



    public static void main(String[] args) {

        int splitAndSum()

    }
}
