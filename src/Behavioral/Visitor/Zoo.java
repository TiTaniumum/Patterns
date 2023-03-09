package Behavioral.Visitor;

public class Zoo implements IPlace{
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
