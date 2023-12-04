/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package henkiloKopio;

/**
 *
 * @author tristan
 */
public class Henkilo implements Cloneable {

    private String nimi;
    private int ika;
    private Subject sub;

    public Henkilo(String nimi, int ika, String sub) {
        super();
        this.nimi = nimi;
        this.ika = ika;
        this.sub = new Subject(sub);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }
    
    

    @Override
    public String toString() {
        return "Henkilo{" + "nimi=" + nimi + ", ika=" + ika + '}';
    }

}
