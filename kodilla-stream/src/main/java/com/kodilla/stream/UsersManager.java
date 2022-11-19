package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
/*
    public static List<Integer> filterUserAge() {
        List<Integer> userage = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge().equals())
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userage;
    }
*/

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
