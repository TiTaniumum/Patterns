package Stractural.Bridge;

public class ShapeType extends ShapeBridge{
    public ShapeType(IShapeBridgePattern iShapeBridgePattern) {
        super(iShapeBridgePattern);
    }

    @Override
    void DrawShape_ShapeBridge() {
        System.out.println("inside the public class ShapeType, extends ShapeBridge");
        iShapeBridgePattern.ShapeType_IShape();
    }

    @Override
    void FillColor_ShapeBridge() {
        //Do - Nothing
    }
}
