package Stractural.Bridge;

public class Main {
    public static void main(String[]args){
        ShapeBridge square = new ShapeType(new Square());
        ShapeBridge triangle = new ShapeType(new Triangle());
        square.DrawShape_ShapeBridge();
        System.out.println("            -------------     ");
        triangle.DrawShape_ShapeBridge();

        ShapeBridge blueColor = new Color(new Blue());
        blueColor.iShapeBridgePattern.ShapeType_IShape();
        blueColor.iShapeBridgePattern.ShapeColor_IShape();

        ShapeBridge redColor = new Color(new Red());
        redColor.iShapeBridgePattern.ShapeType_IShape();
        redColor.iShapeBridgePattern.ShapeColor_IShape();

    }
}
