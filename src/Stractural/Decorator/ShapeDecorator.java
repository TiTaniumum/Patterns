package Stractural.Decorator;

import Stractural.Bridge.IShapeBridgePattern;

public class ShapeDecorator implements IShape{
    protected IShape ishape;

    public ShapeDecorator(IShape ishape) {
        this.ishape = ishape;
    }

    @Override
    public void DrawShape() {
        ishape.DrawShape();
    }
}
