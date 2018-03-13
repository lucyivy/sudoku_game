package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> listOfShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public int getFiguresQuantity() {
        return listOfShapes.size();
    }
}

