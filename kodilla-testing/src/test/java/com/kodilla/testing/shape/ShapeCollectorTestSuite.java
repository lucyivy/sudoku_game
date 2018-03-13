package com.kodilla.testing.shape;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCouter = 0;

    @Before
    public void beforeEachTest() {
        testCouter++;
        System.out.println("Executing test #" + testCouter);
    }

    @Test
    public void testAddFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4.0, 5.5);

        // When
        shapeCollector.addFigure(triangle);

        // Then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4.0, 5.5);

        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle thisCircle = new Circle(2.5);
        Square square = new Square(4.5);

        //When
        for (int i = 0; i < 10; i++) {
            shapeCollector.listOfShapes.add(square);
        }
        shapeCollector.listOfShapes.add(thisCircle);

        //Then
        Assert.assertEquals(thisCircle, shapeCollector.getFigure(10));
    }

}
