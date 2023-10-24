package strategy.tehtava9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tristan
 */
public class Tehtava9 {

    public static void main(String[] args) {
        Context a = new Context(new PrintNewLineEveryTime());
        //Prints every time a new line default as the name tells.
        
        
        ListConverter strategy = new PrintNewLineEverySecond();
        //Prints new line every second time
        
        List<String> list = new ArrayList<>();
        list.add("Jaakko");
        list.add("Pekka");
        list.add("Maija");
        list.add("Maija");
        list.add("Adrina");
        list.add("Adrian");
        list.add("Yamppe");
        list.add("Tristan");
        list.add("Keijo");
        list.add("Jussi");
        list.add("Panu");
        a.setList(list);
        System.out.println(a.listToString(a.getList()));
        
        a.setConverter(strategy);
        
        System.out.println(a.listToString(a.getList()));
        
        ListConverter everyThird = new PrintNewLineEveryThird();
        System.out.println("");
        a.setConverter(everyThird);
        System.out.println(a.listToString(a.getList()));
    }

}
