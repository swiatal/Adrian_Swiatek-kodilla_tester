package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("flower", 15, 10,true));
        stamps.add(new Stamp("dogs", 11, 14,true));
        stamps.add(new Stamp("trees", 18, 12,false));
        stamps.add(new Stamp("flower", 15, 10,true));

    System.out.println(stamps.size());
    for(Stamp stamp : stamps)
        System.out.println(stamp);

    }
}
