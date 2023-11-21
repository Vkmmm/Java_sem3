package pr4.пр4_2;

class Head {
    private String hairColor;
    private String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void speak(String message) {
        System.out.println("Говорит: " + message);
    }
}
