package builder.tehtava14;

/**
 *
 * @author tristan
 */
public class Tehtava14 {

    public static void main(String[] args) {
        
    }
}


/*

Builder --> Interface

Concrete Builder ---> Class implements builder

Director ---> Class has a private Ibuilder

Product ----> class or classes as ingredients




Builder: 
Kirjoita ohjelma, jossa rakennat kerroshampurilaisen Builder-mallin mukaisesti.

Toteuta vähintään kaksi konkreettista builderia (Hesburger ja McDonalds).

Toteuta builderit siten, että kummallekin hampurilaiselle on erilainen tietorakennetoteutus.

Toisella esim. ArrayList, johon tallennetaan hampurilaisen osat olioina
 
(määrittele osille omat luokat, esim. salaattia voisi edustaa konkreettisen builderin päässä class JäävuoriSalaatti, josta luodaan ilmentymä listaan)

ja toisella StringBuilder, jossa osia edustavat merkkijonot.
 
Konkreettisilla Buildereilla on oikeaa tyyppiä palauttavat getBurger()-metodit eli ne palauttavat hampurilaisen sellaisena oliona, jona se on luotu. 

*/