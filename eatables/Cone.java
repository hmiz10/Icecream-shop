package be.intecbrussel.eatables;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {

    }

    public Cone(Flavor[] flavors) {
        this.balls = flavors;
    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE

    }

    @Override
    public void eat() {

    }
}
