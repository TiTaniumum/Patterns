package Behavioral.Visitor;

public class Circus implements IPlace{
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
