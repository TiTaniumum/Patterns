package Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
        orderList.stream().forEach(e -> System.out.println(e.getClass()));
    }
    public void placeOrder(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
