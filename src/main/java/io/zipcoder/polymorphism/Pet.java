package io.zipcoder.polymorphism;

public class Pet {

    String name;
    String speak;

    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "\n" + name + " says " + speak();
    }

}
