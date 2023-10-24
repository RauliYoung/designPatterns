package strategy.tehtava9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tristan
 */
public class Context {

    private List context = new ArrayList();
    private ListConverter converter;

    public Context(ListConverter converter) {
        this.converter = converter;
    }

    public void setList(List a) {
        this.context = a;
    }

    public List getList() {
        return context;
    }
    
    public void add(String content) {
        context.add(content);
    }

    public ListConverter getConverter() {
        return converter;
    }

    public void setConverter(ListConverter converter) {
        this.converter = converter;
    }

    public String listToString(List<String> list) {
        return converter.listToString(list);
    }
}
