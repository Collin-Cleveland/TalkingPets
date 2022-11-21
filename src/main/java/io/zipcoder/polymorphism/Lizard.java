package io.zipcoder.polymorphism;

public class Lizard extends Pet {

    public Lizard(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "ssss";
    }
}
