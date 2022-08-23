package com.company;

public class Car {

    private int id;
    private String numberOfAuto;

    public Car(int id, String numberOfAuto) {
        this.id = id;
        this.numberOfAuto = numberOfAuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfAuto() {
        return numberOfAuto;
    }

    public void setNumberOfAuto(String numberOfAuto) {
        this.numberOfAuto = numberOfAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberOfAuto='" + numberOfAuto + '\'' +
                '}';
    }
}
