package Behavioral.Command;

public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.Sell();
    }
}
