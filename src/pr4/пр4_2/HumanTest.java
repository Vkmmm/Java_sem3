package pr4.пр4_2;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("коричневые", "зеленые");
        Leg leg = new Leg(100);
        Hand hand = new Hand(5);

        Human human = new Human(head, leg, hand);
        human.describe();
        human.speak("Привет!");
        human.walk();
        human.wave();
    }
}
