package abstractfactory.products;

import abstractfactory.products.interfaces.Accessories;

public class WFHAccessories implements Accessories {
    public void wear() {
        System.out.println("Wear headset");
    }
}