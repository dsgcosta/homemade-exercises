package home.projects;

public class Document implements Identifiable{
    private int id;
    private String title;
    private String orderNumber;

    public Document(OrderNumber orderNumber, String title) {
        this.id = orderNumber.getId();
        this.title = title;
        this.orderNumber = orderNumber.getOrderPurchase();
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }
}
