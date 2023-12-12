package facade.tehtava21;

/**
 *
 * @author tristan
 */
public class HardDrive {

    public char[] read(long lba, int size) {
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            data[i] = (char) ('A' + i);
        }
        System.out.println("Luetaan tietoja...: " + new String(data));
        return data;
    }

}
