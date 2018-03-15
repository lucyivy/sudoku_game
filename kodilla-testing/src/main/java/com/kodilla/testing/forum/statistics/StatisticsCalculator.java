package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private Integer numberOfUsers;
    private Integer numberOfPosts;
    private Integer numberOfComments;
    private Double averagePostsPerUser;
    private Double averageCommentsPerUser;
    private Double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
    this.numberOfUsers = statistics.usersNames().size();
    this.numberOfPosts = statistics.postsCount();
    this.numberOfComments = statistics.commentsCount();
    this.averagePostsPerUser = (double) numberOfPosts / (double)numberOfUsers;
    this.averageCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
    this.averageCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
    }

    public void showStatistics(){
        System.out.println("Number of users:" + numberOfUsers + "\nNumber of posts:" + numberOfPosts + "\nNumber of comments:" + numberOfComments + "\nAverage posts per user" + averageCommentsPerUser + "\nAverage comments per user" + averageCommentsPerUser + "\nAverage comments per post" + averageCommentsPerPost);
    }

    public Integer getNumberOfUsers() {
        return numberOfUsers;
    }

    public Integer getNumberOfPosts() {
        return numberOfPosts;
    }

    public Integer getNumberOfComments() {
        return numberOfComments;
    }

    public Double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public Double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public Double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
