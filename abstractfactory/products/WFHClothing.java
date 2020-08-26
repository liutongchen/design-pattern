package abstractfactory.products;

import abstractfactory.products.interfaces.Clothing;

public class WFHClothing implements Clothing {
    public void wear() {
        System.out.println("Wear pajamas");
    }
}