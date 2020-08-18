package abstractfactory.client;

public class Client {
    private Accessories accessories;
    private Clothing clothing;
    private Footwear footwear;

    public Client(OutfitFactory factory) {
        accessories = factory.createAccessories();
        clothing = factory.createClothing();
        footwear = factory.createFootwear();
    }

    public createOutfit() {
        clothing.wear();
        accessories.wear();
        footwear.wear();
    }
}