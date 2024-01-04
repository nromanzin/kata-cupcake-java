import java.math.BigDecimal;

public class Cookie implements Cake {

    @Override
    public String getName() {
        return "\uD83C\uDF6A";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(2);
    }
}
