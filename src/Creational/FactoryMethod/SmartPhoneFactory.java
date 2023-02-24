package Creational.FactoryMethod;

public class SmartPhoneFactory {
    public static SmartPhone getInstance(String name,String modelName){
        if(name == "IPhone"){
            return new IPhone(modelName);
        }else if(name  == "Samsung"){
            return new Samsung(modelName);
        }else if(name  == "Nokia"){
            return new Nokia(modelName);
        }
        return null;
    }
}
