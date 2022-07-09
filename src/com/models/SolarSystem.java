package com.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolarSystem {
    private final Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private final Set<HeavenlyBody> planets = new HashSet<>();

    public SolarSystem() {
        HeavenlyBody tempBody = new HeavenlyBody("Earth", 365);
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 28);
        solarSystem.put("Earth", tempBody);
        planets.add(tempBody);
        tempBody.addMoon(tempMoon);

        tempBody = new HeavenlyBody("Mars", 687);
        solarSystem.put("Mars", tempBody);
        planets.add(tempBody);
        tempMoon = new HeavenlyBody("Deimos", 1.3);
        tempBody.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Phobos", 0.3);
        tempBody.addMoon(tempMoon);

        tempBody = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put("Jupiter", tempBody);
        planets.add(tempBody);
        tempMoon = new HeavenlyBody("Io", 1.8);
        tempBody.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Europa", 3.5);
        tempBody.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        tempBody.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Callisto", 16.7);
        tempBody.addMoon(tempMoon);


        tempBody = new HeavenlyBody("Saturn", 10759);
        solarSystem.put("Jupiter", tempBody);
        planets.add(tempBody);

        tempBody = new HeavenlyBody("Uranus", 30660);
        solarSystem.put("Jupiter", tempBody);
        planets.add(tempBody);

        tempBody = new HeavenlyBody("Neptune", 165);
        solarSystem.put("Jupiter", tempBody);
        planets.add(tempBody);

        tempBody = new HeavenlyBody("Pluto", 248);
        solarSystem.put("Jupiter", tempBody);
        planets.add(tempBody);

    }

    public void showAllPlanets() {
        for(HeavenlyBody planet : planets) {
            System.out.print(planet.getName() + "\t");
        }
        System.out.println();
    }

    public void showMoonsOfPlanet(String planet) {
        Set<HeavenlyBody> moons = solarSystem.get(planet).getSatellites();

        if(moons != null) {
            for(HeavenlyBody moon : moons) {
                System.out.print(moon.getName() + "\t");
            }
        } else {
            System.out.println(planet + " has no moons");
        }
    }


    public void showAllMoons() {
        Set<HeavenlyBody> allMoons = new HashSet<>();

        for(HeavenlyBody planet : planets) {
            allMoons.addAll(planet.getSatellites());
        }

        System.out.println("All Solar System moons are:");

        for(HeavenlyBody moon : allMoons) {
            System.out.println("\t" + moon.getName());
        }

        System.out.println();
    }


    public void showAllHeavenlyBodies() {
        System.out.println("All Solar System heavenly bodies:");
        Set<HeavenlyBody> moons = new HashSet<>();

        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
            moons = planet.getSatellites();

            if(!moons.isEmpty()) {
                System.out.println("\t\tMoons:");
                int counter = 1;

                for(HeavenlyBody moon : moons) {
                    System.out.println("\t\t\t" + counter + ". " + moon.getName());
                    counter++;
                }
            }
        }

        System.out.println();
    }
}
