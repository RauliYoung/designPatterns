package strategy.tehtava9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tristan
 */
public class Tehtava9 {

    public static void main(String[] args) {
        //Prints every time a new line default as the name tells.
        Context a = new Context(new PrintNewLineEveryTime());

        //Prints new line every second time
        ListConverter strategy = new PrintNewLineEverySecond();
        a.add("Jaakko");
        a.add("Pekka");
        a.add("Maija");
        a.add("Maija");
        a.add("Adrina");
        a.add("Adrian");
        a.add("Yamppe");
        a.add("Tristan");
        a.add("Keijo");
        a.add("Jussi");
        a.add("Panu");
        System.out.println(a.listToString(a.getList()));

        //set different strategy
        a.setConverter(strategy);

        System.out.println(a.listToString(a.getList()));

        //Print new line every third time 
        ListConverter everyThird = new PrintNewLineEveryThird();

        System.out.println("");
        
        //set different strategy
        a.setConverter(everyThird);
        
        System.out.println(a.listToString(a.getList()));
    }

}
