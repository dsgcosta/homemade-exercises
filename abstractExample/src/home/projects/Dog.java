package home.projects;

public class Dog extends Animal {
    boolean isDangerous;

    public Dog(String name, int age, boolean isDangerous) {
        super(name, age);
        this.isDangerous = isDangerous;
    }

    @Override
    void addOneYear(){
        age = age + 2;
    }
}
