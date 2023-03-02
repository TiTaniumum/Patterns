package Stractural.Bridge;

public class Red implements IShapeBridgePattern{
    @Override
    public void ShapeType_IShape() {
        System.out.println("redTriangle -> Shape Type");
    }

    @Override
    public void ShapeColor_IShape() {
        System.out.println("redTriangle -> ShapeColor");
    }
}
