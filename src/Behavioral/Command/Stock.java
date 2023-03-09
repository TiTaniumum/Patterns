package Behavioral.Command;

public class Stock {
    private String name = "ABC";
    private int quantity =10;
    public void Buy(){
        System.out.println( "Stock [" + name+"], quantity: " + quantity + " was bought!");
    }
    public void Sell(){
        System.out.println( "Stock [" + name+ "], quantity: " + quantity + " was sold!");
    }
}
