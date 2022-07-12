import com.models.SolarSystem;

public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();

        solarSystem.showAllPlanets();
        System.out.println("****************************************");
        solarSystem.showAllHeavenlyBodies();
        System.out.println("****************************************");
        solarSystem.showAllMoons();
        System.out.println("****************************************");
        solarSystem.showMoonsOfPlanet("Mars");
    }
}
