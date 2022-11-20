package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void TrueUsernameChemist() {
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        List<String> usernames = new ArrayList<>();
        usernames.add(new String("Walter White"));
        usernames.add(new String("Gale Boetticher"));
        assertEquals(usernames, result);
        assertEquals(2, result.size());
    }


    @Test
    public void testGetUsersOlderThan() {
        //when
        List<String> result = UsersManager. getUsersOlderThan(56);
        //then
        List<String> usernames = new ArrayList<>();
        usernames.add(new String("Mike Ehrmantraut"));
        assertEquals(1, result.size());
    }
}


