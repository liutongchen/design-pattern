package abstractfactory.factories;

public class DateOutfitFactory {
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