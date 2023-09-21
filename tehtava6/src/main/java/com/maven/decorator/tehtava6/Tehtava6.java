package com.maven.decorator.tehtava6;

import pizza.Juusto;
import pizza.Kinkkusuikale;
import pizza.Pizza;
import pizza.Pizzapohja;
import pizza.Tomaattikastike;
import pizza.Valkosipuli;

/**
 *
 * @author rauliyoung
 */
public class Tehtava6 {

    public static void main(String[] args) {
        System.out.println("Hello Simo Silander, hyvää sunnuntaita!");
        Pizza synttariPizza = new Pizzapohja();
        
        synttariPizza = new Tomaattikastike(synttariPizza);
        synttariPizza = new Kinkkusuikale(synttariPizza);
        synttariPizza = new Juusto(synttariPizza);
        synttariPizza = new Valkosipuli(synttariPizza);
        
        System.out.println(synttariPizza.getKuvaus() + " ja pizzan hinta on " + synttariPizza.getHinta() + " euroa.");
        System.out.println("Voisi melkein ajatella että onko pizzasta maksettu veroja?");
        
    }
}
