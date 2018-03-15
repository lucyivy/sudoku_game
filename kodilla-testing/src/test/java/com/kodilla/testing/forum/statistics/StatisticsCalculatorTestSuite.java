package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsForZeroValues(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList <String> usersNames = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(0 == statisticsCalculator.getNumberOfPosts() && 0 == statisticsCalculator.getNumberOfComments() && 0 == statisticsCalculator.getNumberOfUsers() );
    }
    @Test
    public void testCalculateAdvStatisticsForNoZeroValuesAndLessCommentsThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList <String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            usersNames.add("Name " + i);
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(900);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(1000 == statisticsCalculator.getNumberOfPosts() && statisticsCalculator.getNumberOfPosts() > statisticsCalculator.getNumberOfComments() && 100 == statisticsCalculator.getNumberOfUsers() );
    }
    @Test
    public void testCalculateAdvStatisticsForNoZeroValuesAndMoreCommentsThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList <String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 85; i++){
            usersNames.add("Name " + i);
        }

        when(statisticsMock.postsCount()).thenReturn(150);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(150 == statisticsCalculator.getNumberOfPosts() && statisticsCalculator.getNumberOfPosts() < statisticsCalculator.getNumberOfComments() && 85 == statisticsCalculator.getNumberOfUsers() );
    }
    @Test
    public void testCalculateAdvStatisticsForZeroValueOfUsersAndNoZeroValueOfOthers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList <String> usersNames = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(6);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(5 == statisticsCalculator.getNumberOfPosts() && statisticsCalculator.getNumberOfPosts() < statisticsCalculator.getNumberOfComments() && 0 == statisticsCalculator.getNumberOfUsers() );
    }
}
