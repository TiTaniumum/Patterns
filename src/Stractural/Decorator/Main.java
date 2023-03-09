package Stractural.Decorator;

public class Main {
    public static void main(String[]args){
        IShape circle = new Circle();
        IShape redCircle = new RedShapeDecorator(new Circle());
        IShape square = new Square();
        IShape blueSquare = new BlueShapeDecorator(new Square());

        BlueShapeDecorator blueShapeDecorator = new BlueShapeDecorator(square);
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);

        System.out.println("Circle with normal border ...");
        circle.DrawShape();

        System.out.println("Circle with red border....");
        redCircle.DrawShape();

        System.out.println(" ------------------------------------------  ");

        System.out.println("square with normal border ...");
        square.DrawShape();

        System.out.println("Square with blue border....");
        blueSquare.DrawShape();

        blueShapeDecorator.SetRedBorder();
        redShapeDecorator.SetRedBorder();
    }
}
