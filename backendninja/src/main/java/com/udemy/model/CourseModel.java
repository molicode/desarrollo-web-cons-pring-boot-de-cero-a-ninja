package com.udemy.model;

public class CourseModel {

    private String name;
    private String descripcion;
    private int price;
    private int hours;

    public CourseModel() {
    }

    public CourseModel(String name, String descripcion, int price, int hours) {
        this.name = name;
        this.descripcion = descripcion;
        this.price = price;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}

