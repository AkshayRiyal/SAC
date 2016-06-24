package ttnd;
class Customer
{
    private int customerId;
    
    public Order placeOrder(Coffee coffee);

    public void payCash(Order order);

    public Boolean isReady();

    public void collectOrder();
}

class Cashier extends
{     int orderId;

    public Order takeOrder(Coffee coffee);

    public void takeCash(Order order);

    public void createOrder(Coffee coffee);

    public void token();
}

class Barista {
    public void getNextOrder();

    public void prepare(Coffee coffee);

    public void placeInOrderQueue();

    public Boolean orderready();
}

class Order {
    private int orderId;
    private int orderAmount;
    private int tokenNumber;

    public int getOrderId();

    public void setOrderId(int orderId); 
    public int getOrderAmount() ;
      
    

    public void setOrderAmount(int orderAmount);

    public int getTokenNumber();

    public void setTokenNumber(int tokenNumber);

}

class Coffee {
    private String coffee;
    private int price;

    public String getCoffee();

    public void setCoffee(String coffee) ;

    public int getPrice();

    public void setPrice(int price);

}
