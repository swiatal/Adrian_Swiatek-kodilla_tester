package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        //metoda zwracająca średnią liczbę postów dla użytkowników z dwóch grup wiekowych?
        Double averageNumberPost = getAverageNumberHigher40();
        Double averagePost = getAverageNumberLower40();
        // miejsce wmetodzie main, gdzie mają być wyświetlane wyniki tych metod
        System.out.println(averageNumberPost);
        System.out.println( averagePost);
    }

    public static double getAverageNumberHigher40() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static double getAverageNumberLower40() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}
