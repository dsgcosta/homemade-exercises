package home.projects;

public class Client implements Identifiable{
    private int id;
    private String clientName;

    public Client(int id, String clientName) {
        this.id = id;
        this.clientName = clientName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getClientName() {
        return this.clientName;
    }
}
