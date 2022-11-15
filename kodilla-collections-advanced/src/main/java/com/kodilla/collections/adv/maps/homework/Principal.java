package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String lastname;

    public Principal(String lastname) {
        this.lastname = lastname;
    }
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Principal principal = (Principal) o;
        return Objects.equals(lastname, principal.lastname);
}
@Override
    public int hashCode() {return Objects.hash(lastname);}

    public String getLastname() {return lastname;}
}
