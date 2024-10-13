package home.projects;

public class Cat extends Animal {

    private boolean isSweet;

    public Cat(String name, int age, boolean isSweet){
        super(name, age);
        this.isSweet = isSweet;
    }

    @Override
    void addOneYear() {
       age++;
    }
}
