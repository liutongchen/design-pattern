package abstractfactory.products;

import abstractfactory.products.interfaces.Footwear;

public class WFHFootwear implements Footwear {
    public void wear() {
        System.out.println("Wear comfy socks");
    }
}