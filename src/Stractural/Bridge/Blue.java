package Stractural.Bridge;

public class Blue implements IShapeBridgePattern{
    @Override
    public void ShapeType_IShape() {
        System.out.println("blueTriangle -> Shape Type");
    }

    @Override
    public void ShapeColor_IShape() {
        System.out.println("blueTriangle -> ShapeColor");
    }
}
