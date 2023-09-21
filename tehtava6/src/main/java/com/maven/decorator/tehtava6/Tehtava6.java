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
        Pizza darra = new Pizzapohja();
        
        darra = new Tomaattikastike(darra);
        darra = new Kinkkusuikale(darra);
        darra = new Juusto(darra);
        darra = new Valkosipuli(darra);
        
        System.out.println(darra.getKuvaus() + " ja pizzan hinta on " + darra.getHinta() + " euroa.");
        System.out.println("Voisi melkein ajatella että onko pizzasta maksettu veroja?");
        
    }
}
