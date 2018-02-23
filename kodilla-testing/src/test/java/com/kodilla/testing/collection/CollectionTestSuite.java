package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: start testing");
    }

    @After
    public void after() {
        System.out.println("Test Case: testing ended\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator emptyExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyNumbers = new ArrayList<Integer>();
        Assert.assertTrue(emptyExterminator.exterminate(emptyNumbers).isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator normalExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalNumbers = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            normalNumbers.add(i);
        }
        boolean containsOnlyEven = false;
        for (Integer x : normalExterminator.exterminate(normalNumbers)) {
            if (x % 2 == 0) {
                containsOnlyEven = true;
            } else {
                containsOnlyEven = false;
                break;
            }

        }
        Assert.assertTrue(containsOnlyEven);
    }
}

