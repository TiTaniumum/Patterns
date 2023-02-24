package Creational.Singelton;

public class singelton {
    private static singelton uniqueInstance;
    private singelton(){

    }
    public static singelton getInstance(){
        if(uniqueInstance == null){
            return new singelton();
        }
        return uniqueInstance;
    }

    public void getDescription(){
        System.out.println("I'm simple singelton");
    }
}
