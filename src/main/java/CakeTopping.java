import java.math.BigDecimal;

public abstract class CakeTopping implements Cake {
    private final Cake wrappee;
    public CakeTopping(Cake source) {
        this.wrappee = source;
    }

    @Override
    public final String getName() {
        return wrappee.getName() + getSeparator() + getToppingName();
    }

    private String getSeparator() {
        return wrappee.getName().contains("with") ? " and " : " with ";
    }

    protected abstract String getToppingName();

    @Override
    public final BigDecimal getPrice() {
        return wrappee.getPrice().add(getToppingPrice());
    }

    protected abstract BigDecimal getToppingPrice();
}
