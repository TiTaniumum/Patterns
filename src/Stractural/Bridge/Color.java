package Stractural.Bridge;

import java.sql.SQLOutput;

public class Color extends ShapeBridge{
    public Color(IShapeBridgePattern iShapeBridgePattern) {
        super(iShapeBridgePattern);
    }

    @Override
    void DrawShape_ShapeBridge() {
        // Do - nothing
    }

    @Override
    void FillColor_ShapeBridge() {
        System.out.println("Color extends ShapeBridge");
        iShapeBridgePattern.ShapeColor_IShape();
    }
}
