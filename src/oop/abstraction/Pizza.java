package oop.abstraction;

public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    abstract void prepare();
    abstract void sauce();
    abstract void bake();
    abstract void cut();
}
