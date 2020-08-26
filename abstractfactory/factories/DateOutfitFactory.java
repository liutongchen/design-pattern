package abstractfactory.factories;

import abstractfactory.products.DateAccessories;
import abstractfactory.products.DateClothing;
import abstractfactory.products.DateFootwear;
import abstractfactory.products.interfaces.Accessories;
import abstractfactory.products.interfaces.Clothing;
import abstractfactory.products.interfaces.Footwear;

public class DateOutfitFactory implements OutfitFactory {
    @Override
    public Clothing createClothing() {
        return new DateClothing();
    }

    @Override
    public Footwear createFootwear() {
        return new DateFootwear();
    }

    @Override
    public Accessories createAccessories() {
        return new DateAccessories();
    }
}