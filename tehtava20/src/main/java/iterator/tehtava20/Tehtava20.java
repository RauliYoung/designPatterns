/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package iterator.tehtava20;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tristan
 */
public class Tehtava20 {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> cars = new ArrayList<>();
        ArrayList<String> flowers = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Porche");

        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Daisy");
        flowers.add("Lily");
        flowers.add("Sunflower");

        Iterator<String> carIterator = cars.iterator();
        Iterator<String> flowerIterator = flowers.iterator();
        Iterator<String> flower = cars.iterator();

//        Thread carThread = new Thread(() -> iterateCollection(carIterator, "cars"));
//
//        Thread flowerThread = new Thread(() -> iterateCollection(flower, "flowers"));
//
//        flowerThread.start();
//
//        carThread.start();
//
//        carThread.join();
//        flowerThread.join();

        while (carIterator.hasNext()) {
            System.out.println("Iteroidaan");
            String car = carIterator.next();
            System.out.println(car);

            if (car.equals("BMW")) {
                carIterator.remove();
                System.out.println("Removed: " + car);
            }
        }
        System.out.println("Autoja jäljellä..");
        for (String car : cars) {
            System.out.println(car);
        }
        
        flowerIterator.forEachRemaining(System.out::println);

    }

    public static void iterateCollection(Iterator<String> iterator, String collectionName) {
        while (iterator.hasNext()) {
            System.out.println(collectionName + ": " + iterator.next());
            try {

                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
