package Creational.FactoryMethod;

public class Main {
    public static void main(String[]args){
        SmartPhone iPhone = SmartPhoneFactory.getInstance("IPhone", "SomeIphone");
        SmartPhone samsung = SmartPhoneFactory.getInstance("Samsung", "samsung");
        SmartPhone nokia = SmartPhoneFactory.getInstance("Nokia", "nokia");
        System.out.println(iPhone);
        System.out.println("samsung = " + samsung);
        System.out.println("Nokia = " + nokia);
    }
}
