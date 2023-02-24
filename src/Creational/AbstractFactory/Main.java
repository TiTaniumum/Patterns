package Creational.AbstractFactory;

public class Main {
    public static void main(String[]args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        IShape circle = shapeFactory.getShape("Circle");
        circle.drawShape();

        IShape rectange = shapeFactory.getShape("Rectangle");
        rectange.drawShape();
//dhslkdjfkjkjsdkfjlskdf
        IShape triangle = shapeFactory.getShape("Triangle");
        triangle.drawShape();
    }
}
