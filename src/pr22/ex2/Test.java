package pr22.ex2;

public class Test {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Chair functionalChair = factory.createFunctionalChair();
        Chair magicChair = factory.createMagicianChair();
        Chair victorianChair = factory.createVictorianChair();
        ((MagicChair)magicChair).doMagic();
        System.out.println(((FunctionalChair)functionalChair).sum(10,10));
        System.out.println("Возраст стула: " + ((VictorianChair)victorianChair).getAge() + " лет");
        Client client = new Client();
        client.setChair(magicChair);
        client.sit();
    }
}