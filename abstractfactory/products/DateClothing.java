package abstractfactory.products;

import abstractfactory.products.interfaces.Clothing;

public class DateClothing implements Clothing {
    public void wear() {
        System.out.println("Wear dress");
    }
}