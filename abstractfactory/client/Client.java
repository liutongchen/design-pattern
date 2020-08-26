package abstractfactory.client;

import abstractfactory.factories.OutfitFactory;
import abstractfactory.products.interfaces.Accessories;
import abstractfactory.products.interfaces.Clothing;
import abstractfactory.products.interfaces.Footwear;

public class Client {
    private Accessories accessories;
    private Clothing clothing;
    private Footwear footwear;

    public Client(OutfitFactory factory) {
        accessories = factory.createAccessories();
        clothing = factory.createClothing();
        footwear = factory.createFootwear();
    }

    public void createOutfit() {
        clothing.wear();
        accessories.wear();
        footwear.wear();
    }
}