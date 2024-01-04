import java.math.BigDecimal;

public class Cupcake implements Cake {

    @Override
    public String getName() {
        return "\uD83E\uDDC1";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1);
    }
}
