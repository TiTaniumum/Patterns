package Creational.FactoryMethod;

public class Nokia extends SmartPhone {
    private String modelName;
    public Nokia(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return modelName;
    }
}
