package home.projects;

public class OrderNumber implements Identifiable{
    private int id;
    private String orderPurchase;

    public OrderNumber(int id, String orderPurchase) {
        this.id = id;
        this.orderPurchase = orderPurchase;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getOrderPurchase() {
        return this.orderPurchase;
    }
}
