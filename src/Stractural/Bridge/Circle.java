package Stractural.Bridge;

public class Circle implements IShapeBridgePattern{
    @Override
    public void ShapeType_IShape() {
        System.out.println("Circle -> ShapeType");
    }
    @Override
    public void ShapeColor_IShape() {
        System.out.println("Circle -> ShapeColor");
    }
}
