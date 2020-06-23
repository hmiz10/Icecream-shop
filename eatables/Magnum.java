package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum(){

    }

    public Magnum (MagnumType magnumType){
        this.type = magnumType;
    }

    public MagnumType getType() {
        return type;
    }

    public enum MagnumType{
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES
    }

    @Override
    public void eat() {

    }
}
