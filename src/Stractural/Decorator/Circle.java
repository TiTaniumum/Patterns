package Stractural.Decorator;

public class Circle implements IShape{
    public Circle() {
    }

    @Override
    public void DrawShape() {
        System.out.println("Circle");
    }
}
