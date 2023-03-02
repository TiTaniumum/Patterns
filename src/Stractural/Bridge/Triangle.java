package Stractural.Bridge;

public class Triangle implements IShapeBridgePattern{
    @Override
    public void ShapeType_IShape() {
        System.out.println("Triangle -> Shape Type");
    }

    @Override
    public void ShapeColor_IShape() {
        System.out.println("Triangle -> ShapeColor");
    }
}
