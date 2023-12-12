package facade.tehtava21;

/**
 *
 * @author tristan
 */
public class Cpu {

    public void freeze() {
        System.out.println("Cpu freezing..");
    }

    public void jump(long position) {
        System.out.println("Jumped to position " + position);
    }

    public void execute() {
        System.out.println("Executing file....");
    }
}
