package strategy.tehtava9;

import java.util.List;

/**
 *
 * @author tristan
 */
public class PrintNewLineEverySecond implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String appendedString = "";

        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) % 2 == 0) {
                appendedString += list.get(i) + "\n";
            }else {
                appendedString += list.get(i);
            }
        }

        return appendedString;
    }

}
