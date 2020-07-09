package com.martialArtsCoolabs.schools;

public class School {
    private final NameVO name;
    private final LogoVO logo;
    private final Address address;
    private final Master master;
    
    private School() { }

    public static School of() {
        return new School();
    }
}