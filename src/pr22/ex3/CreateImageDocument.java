package pr22.ex3;

public class CreateImageDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        return new ImageDocument();
    }
}