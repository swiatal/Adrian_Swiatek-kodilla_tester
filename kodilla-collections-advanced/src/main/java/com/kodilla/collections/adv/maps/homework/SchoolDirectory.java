package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> roaster = new HashMap<>();
        Principal kowalski = new Principal("Kowalski");
        Principal nowak = new Principal("Nowak");
        Principal gawron = new Principal("Gawron");

        School kowalskiSchool = new School(Arrays.asList(30.0, 29.0, 28.0));
        School nowakSchool = new School(Arrays.asList(20.0, 24.0, 19.0));
        School gawronSchool = new School(Arrays.asList(35.0, 33.0, 31.0));

        roaster.put(kowalski, kowalskiSchool);
        roaster.put(nowak, nowakSchool);
        roaster.put(gawron, gawronSchool);

        System.out.println(roaster.get(kowalski));

        for (Map.Entry<Principal, School> principalEntry : roaster.entrySet()) {
            System.out.println(principalEntry.getKey().getLastname() + ", average: " + principalEntry.getValue().getAverage());
        }
        }
    }

