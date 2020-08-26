package abstractfactory.factories;

import abstractfactory.products.WFHAccessories;
import abstractfactory.products.WFHClothing;
import abstractfactory.products.WFHFootwear;
import abstractfactory.products.interfaces.Accessories;
import abstractfactory.products.interfaces.Clothing;
import abstractfactory.products.interfaces.Footwear;

public class WFHOutfitFactory implements OutfitFactory {
    
    @Override
    public Clothing createClothing() {
        return new WFHClothing();
    }

    @Override
    public Footwear createFootwear() {
        return new WFHFootwear();
    }

    @Override
    public Accessories createAccessories() {
        return new WFHAccessories();
    }
}