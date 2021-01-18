package com.americanairlines.app11kotlinmvvm;

import java.util.Objects;

public class PersonJava {

    private String name;
    private double height;
    private double weight;
    private PersonKotlin personKotlin = new PersonKotlin("Dalo", 6.7, 193);


    public PersonJava(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        personKotlin.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonJava that = (PersonJava) o;
        return Double.compare(that.height, height) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight);
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
