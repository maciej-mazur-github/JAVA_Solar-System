package com.models;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private String name;
    private double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

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

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public final int hashCode() {
        int prime = 57;
        int hash = prime + name.hashCode();
        hash += prime + (int)orbitalPeriod;
        hash += prime + satellites.hashCode();

        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        return (this.name.equals(((HeavenlyBody) obj).getName())
                && this.orbitalPeriod == ((HeavenlyBody) obj).getOrbitalPeriod()
                && this.satellites.equals(((HeavenlyBody) obj).getSatellites()));
    }
}
