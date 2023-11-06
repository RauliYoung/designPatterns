package com.maven.proxy.tehtava12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tristan
 */
public class ValokuvaAlbumi {
    
    private List<Image> images;

    public ValokuvaAlbumi() {
        this.images = new ArrayList<>();
    }
    
    public void addImage(Image image) {
        images.add(image);
    }
    
    public void showAlbumData() {
        for(Image image: images) {
            image.showData();
        }
    }
    
    public void displayAlbumImages() {
        for(Image image : images) {
            image.displayImage();
        }
    }
    
    
}
