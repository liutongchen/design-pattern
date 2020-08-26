package abstractfactory.client;

import abstractfactory.factories.DateOutfitFactory;
import abstractfactory.factories.OutfitFactory;
import abstractfactory.factories.WFHOutfitFactory;

import static java.util.Calendar.*;

public class Demo {
    public static void main(String args[]) {
        OutfitFactory outfitFactory;
        if (isWeekend(Integer.valueOf(args[0]))) {
            outfitFactory = new DateOutfitFactory();
        } else {
            outfitFactory = new WFHOutfitFactory();
        }
        final Client client = new Client(outfitFactory);
        client.createOutfit();
    }

    private static Boolean isWeekend(int day) {
        return day == SATURDAY || day == SUNDAY;
    }
}