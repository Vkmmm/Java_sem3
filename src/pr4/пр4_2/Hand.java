package pr4.пр4_2;

class Hand {
    private int fingersCount;

    public Hand(int fingersCount) {
        this.fingersCount = fingersCount;
    }

    public int getFingersCount() {
        return fingersCount;
    }

    public void wave() {
        System.out.println("Машет рукой");
    }
}
