package com.maven.proxy.tehtava12;

/**
 *
 * @author tristan
 */
public class RealImage implements Image {

    private final String filename;

    /**
     * Constructor
     *
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Image Data: " + filename);
    }

}
