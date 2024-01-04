import java.math.BigDecimal;

public abstract class CakeDecorator implements Cake {
    private Cake wrappee;
    public CakeDecorator(Cake source) {
        this.wrappee = source;
    }

    @Override
    public String getName() {
        return wrappee.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return wrappee.getPrice();
    }
}
