package strategy.tehtava10;

/**
 *
 * @author tristan
 */
public abstract class Handler {
    
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public void kasittelePalkkaPyynto(PalkkaPyynto maara) {
        if(successor != null) {
            successor.kasittelePalkkaPyynto(maara);
        }
    }

}
