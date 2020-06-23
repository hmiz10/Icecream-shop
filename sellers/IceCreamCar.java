package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{


    private PriceList priceList;
    private  Stock stock;
    private  double profit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList = priceList;
        this.stock = stock;
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {
        if (stock.getBalls() < flavors.length) {
            throw new NoMoreIceCreamException("There is no more balls available.");
            
        } else if (stock.getCones() == 0) {
            throw new NoMoreIceCreamException("There is no more Cone available.");
        } else {
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);

            this.profit = profit + (priceList.getBallPrice() * flavors.length);

            return new Cone(flavors);
        }
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() == 0) {
            throw new NoMoreIceCreamException("There is no more icerocket available");
        } else {
            stock.setIceRockets(stock.getIceRockets() - 1);
            this.profit = profit + priceList.getRocketPrice();

            return new IceRocket();
        }
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {

        if (stock.getMagni() == 0){
            throw new NoMoreIceCreamException("There is no magnum available");
        } else {
            stock.setMagni(stock.getMagni() - 1);
            this.profit = profit + priceList.getMagnumPrice(magnumType);

            return new Magnum(magnumType);
        }
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {
        Cone cone = prepareCone(flavors);

        return cone;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {

        IceRocket iceRocket = prepareIceRocket();

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {

        Magnum magnum = prepareMagnum(magnumType);

        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
