/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.maven.proxy.tehtava12;

/**
 *
 * @author rauliyoung
 */
public class Tehtava12 {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        
        ValokuvaAlbumi perhekuvat = new ValokuvaAlbumi();
        
        perhekuvat.addImage(image1);
        perhekuvat.addImage(image2);
        
        perhekuvat.showAlbumData();
        perhekuvat.displayAlbumImages();
        
        System.out.println("");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }
}
