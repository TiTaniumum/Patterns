package Stractural.Bridge;

public abstract class ShapeBridge {
    protected IShapeBridgePattern iShapeBridgePattern;

    public ShapeBridge(IShapeBridgePattern iShapeBridgePattern) {
        this.iShapeBridgePattern = iShapeBridgePattern;
    }
    abstract void DrawShape_ShapeBridge();
    abstract void FillColor_ShapeBridge();
}
