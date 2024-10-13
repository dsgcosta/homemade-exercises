package home.projects;

public class Person implements Identifiable{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

}
