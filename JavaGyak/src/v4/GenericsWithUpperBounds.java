package v4;

public class GenericsWithUpperBounds {

    public static void main(String[] args) {

        Star sun = new Star("Nap", "fő sorozati");
        SolarBody solarBody = new SolarBody("<solar body>", null);
        Planet earth = new Planet("Föld", sun);
        GiantPlanet jupiter = new GiantPlanet("Jupiter", sun);

        //Box<Star> starBox = new Box<>(sun);
        //Box<SolarBody> solarBodyBox = new Box<>(solarBody);
        //Box<Planet> planetBox = new Box<>(earth);
        //Box<GiantPlanet> giantPlanetBox = new Box<>(jupiter);

        //System.out.println(starBox);
        //System.out.println(solarBodyBox);
        //System.out.println(planetBox);
        //System.out.println(giantPlanetBox);

    }

}
