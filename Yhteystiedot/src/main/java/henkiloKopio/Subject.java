
package henkiloKopio;

/**
 *
 * @author tristan
 */
public class Subject implements Cloneable {

    private String sub;

    public Subject(String sub) {
        this.sub = sub;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
