package abstractfactory.products;

import abstractfactory.products.interfaces.Accessories;

public class DateAccessories implements Accessories {
    public void wear() {
        System.out.println("Wear necklace");
    }
}