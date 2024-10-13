package home.projects;

public class Main {
    public static void main(String[] args) {
        OrderNumber firstOrderNumber = new OrderNumber(22, "620-01");
        Document firstOrderDocument = new Document(firstOrderNumber, "First Order");

        System.out.println(firstOrderDocument.getId() + "" + firstOrderDocument.getTitle() + firstOrderDocument.getOrderNumber());
    }
}
