package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        // Given
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // When
        double averageArrayOfNumbers = ArrayOperations.getAverage(arrayOfNumbers);

        // Then
        Assert.assertEquals(5.5, averageArrayOfNumbers, 0);
    }
}