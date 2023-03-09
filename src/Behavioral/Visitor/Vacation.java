package Behavioral.Visitor;

public class Vacation implements IVisitor{
    public String place;
    @Override
    public void visit(Zoo zoo) {
        place = "Visited Zoo";
    }

    @Override
    public void visit(Cinema cinema) {
        place = "Visited Cinema";
    }

    @Override
    public void visit(Circus circus) {
        place = "Visited Circus";
    }
}
