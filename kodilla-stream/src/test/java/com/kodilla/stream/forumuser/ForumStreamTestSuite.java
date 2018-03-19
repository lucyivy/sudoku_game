package com.kodilla.stream.forumuser;

import com.kodilla.stream.StreamMain;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class ForumStreamTestSuite {

    private List<ForumUser> generateListOfNUsers(int usersQuantity) {
        List<ForumUser> resultList = new ArrayList<ForumUser>();
        for (int n = 1; n <= usersQuantity; n++) {
            ForumUser theUser = new ForumUser(n, "Name " + n, 'F', LocalDate.of(1985, 01, 01), 0 + n);
            resultList.add(theUser);
        }
        return resultList;
    }

    @Test
    public void testGetListMethod() {
        //Given
        Forum forum = new Forum();
        List<ForumUser> resultListOf6Users = generateListOfNUsers(6);

        // When
        List<ForumUser> theListOfUsers = forum.getList();

        //Then
        Assert.assertEquals(resultListOf6Users.size(), theListOfUsers.size());
        for (int n = 0; n < resultListOf6Users.size(); n++) {
            assertEquals(resultListOf6Users.get(n).getClass(), theListOfUsers.get(n).getClass());
        }
    }
}
