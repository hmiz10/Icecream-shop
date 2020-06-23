package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {

        if (Magnum.MagnumType.ALPINENUTS == magnumType){
            double priceMagnum = magnumStandardPrice * 1.5;
            return priceMagnum;
        }

        if (Magnum.MagnumType.BLACKCHOCOLATE == magnumType){
            double priceMagnum = magnumStandardPrice * 2;
            return priceMagnum;
        }

        if (Magnum.MagnumType.MILKCHOCOLATE == magnumType){
            double priceMagnum = magnumStandardPrice * 3;
            return priceMagnum;
        }

        if (Magnum.MagnumType.ROMANTICSTRAWBERRIES == magnumType){
            double priceMagnum = magnumStandardPrice * 4;
            return priceMagnum;
        }

        if (Magnum.MagnumType.WHITECHOCOLATE == magnumType){
            double priceMagnum = magnumStandardPrice * 5;
            return priceMagnum;
        }
        return magnumStandardPrice;
    }
    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
