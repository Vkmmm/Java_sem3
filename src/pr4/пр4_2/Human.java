package pr4.пр4_2;

class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public void describe() {
        System.out.println("Человек с головой: волосы - " + head.getHairColor() +
                ", глаза - " + head.getEyeColor() +
                ", ногой длиной " + leg.getLength() +
                " и рукой с " + hand.getFingersCount() + " пальцами.");
    }

    public void speak(String message) {
        head.speak(message);
    }

    public void walk() {
        leg.walk();
    }

    public void wave() {
        hand.wave();
    }
}
