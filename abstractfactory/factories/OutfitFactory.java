package abstractfactory.factories;

import abstractfactory.products.interfaces.Accessories;
import abstractfactory.products.interfaces.Clothing;
import abstractfactory.products.interfaces.Footwear;

/**
 * Abstract Factory
 */
public interface OutfitFactory {
    Clothing createClothing();
    Footwear createFootwear();
    Accessories createAccessories();
}