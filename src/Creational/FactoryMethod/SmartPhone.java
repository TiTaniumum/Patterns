package Creational.FactoryMethod;

public abstract class SmartPhone {
    @Override
    public String toString() {
        return "Model: " + this.getModel();
    }
    public abstract String getModel();
}
