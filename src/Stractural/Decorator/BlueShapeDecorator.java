package Stractural.Decorator;

public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(IShape ishape) {
        super(ishape);
    }

    @Override
    public void DrawShape(){
        ishape.DrawShape();
    }

    public void SetRedBorder(){
        System.out.println("BorderColor Blue");
    }
}
