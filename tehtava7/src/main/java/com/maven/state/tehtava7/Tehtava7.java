/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.maven.state.tehtava7;

/**
 *
 * @author rauliyoung
 */
public class Tehtava7 {

    public static void main(String[] args) {
        Pokemon charmander = new Pokemon();
        
        while(Pokemon.stage < 3) {
            charmander.attack();
            charmander.train();
            System.out.println(charmander.getXp());
       
        }
        
        System.out.println("You are the champion of Pokemon trainers..");
    }
}
