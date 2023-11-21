package pr22.ex2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}
