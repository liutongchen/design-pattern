package abstractfactory.factories;

/**
 * Abstract Factory
 */
public interface OutfitFactory {
    Clothing createClothing();
    Footwear createFootwear();
    Accessories createAccessories();
}