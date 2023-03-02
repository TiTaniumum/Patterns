package Stractural.Decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(IShape ishape) {
        super(ishape);
    }
    @Override
    public void DrawShape(){
        ishape.DrawShape();
    }

    public void SetRedBorder(){
        System.out.println("BorderColor Red");
    }
}
