package strategy.tehtava9;

import java.util.List;

/**
 *
 * @author tristan
 */
public class PrintNewLineEveryTime implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String appendedString = "";
        for (String item : list) {
            appendedString += item + "\n";
        }
        return appendedString;
    }

}
