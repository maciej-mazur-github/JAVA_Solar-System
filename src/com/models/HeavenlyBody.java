package com.models;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private String name;
    private double orbitalPeriod;
    private Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        satellites = new HashSet<>();
    }

    void addMoon(HeavenlyBody moon) {
        if(!satellites.add(moon)) {
            System.out.println("\t\"" + moon.getName() + "\" already exists in " + this.name + " satellite set");
        }
    }

    String getName() {
        return name;
    }

    Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }
}
