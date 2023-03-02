package Stractural.Bridge;

public class Square implements IShapeBridgePattern{
    public Square() {
    }

    @Override
    public void ShapeType_IShape()
    {
        System.out.println("SQR -> ShapeType");
    }

    @Override
    public void ShapeColor_IShape() {
        System.out.println("SQR -> ShapeColor");
    }
}
