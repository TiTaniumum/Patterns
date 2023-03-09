package Behavioral.Command;

public class Main {
    public static void main(String[]Args){
        Stock stock =  new Stock();
        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrder();
    }
}