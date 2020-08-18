package abstractfactory.factories;

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