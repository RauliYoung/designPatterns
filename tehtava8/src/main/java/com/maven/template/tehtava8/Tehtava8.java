/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maven.template.tehtava8;

import java.io.IOException;

/**
 *
 * @author rauliyoung
 */
public class Tehtava8 {

    public static void main(String[] args) throws IOException {
        System.out.println("Template Method");
        Game peli = new Pinko();
        peli.playOneGame(4);
    }
}
