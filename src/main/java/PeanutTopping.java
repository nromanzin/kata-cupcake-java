import java.math.BigDecimal;

public class PeanutTopping extends CakeTopping {
    public PeanutTopping(Cake source) {
        super(source);
    }

    @Override
    protected String getToppingName() {
        return "\uD83E\uDD5C";
    }

    @Override
    protected BigDecimal getToppingPrice() {
        return new BigDecimal("0.2");
    }
}
