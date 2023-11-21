package pr6.пр6_3;


public class FurnitureTest {
    public static void main(String[] args) {
        Chair chair = new Chair();
        Wardrobe wardrobe = new Wardrobe();

        FurnitureShop shop = new FurnitureShop();

        shop.displayFurniture(chair);
        shop.displayFurniture(wardrobe);
    }
}
