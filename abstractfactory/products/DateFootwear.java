package abstractfactory.products;

import abstractfactory.products.interfaces.Footwear;

public class DateFootwear implements Footwear {
    public void wear() {
        System.out.println("Wear high heels");
    }
}