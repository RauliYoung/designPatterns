package strategy.tehtava9;

import java.util.List;

/**
 *
 * @author tristan
 */
public class PrintNewLineEveryThird implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String appendString = "";
        String[] array = list.toArray(new String[list.size()]);
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                appendString += array[i] + "\n";
            } else {
                appendString += array[i] + " ";
            }
        }
        return appendString;
    }

}
