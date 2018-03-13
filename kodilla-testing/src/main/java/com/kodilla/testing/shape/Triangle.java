package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private Double side;
    private Double height;

    public Triangle(Double side, Double height) {
        this.side = side;
        this.height = height;
    }

    public String getShapeName(){
        return "Triangle";
    }
    public Double getField(){
        return side * height / 2 ;
    }

}
