package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Forum {

    public static List<ForumUser> getList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser(7897, "John Smith", 'M', LocalDate.of(1997, 03, 04), 56));
        theList.add(new ForumUser(4455, "Dorothy Newman", 'F' , LocalDate.of(1990, 11, 22), 889));
        theList.add(new ForumUser(5777, "John Wolkowitz", 'M', LocalDate.of(2005, 12,05),962));
        theList.add(new ForumUser(5547, "Lucy Riley", 'F', LocalDate.of(1986,04,02), 6));
        theList.add(new ForumUser(7555, "Owen Rogers", 'M',LocalDate.of(1975,05,02),0));
        theList.add(new ForumUser(5897,"Declan Booth", 'M', LocalDate.of(1965, 10,31), 55));
        return new ArrayList<ForumUser>(theList);
    }
}
