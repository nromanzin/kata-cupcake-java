import java.math.BigDecimal;

public class ChocolateTopping extends CakeTopping {
    public ChocolateTopping(Cake source) {
        super(source);
    }

    @Override
    protected String getToppingName() {
        return "\uD83C\uDF6B";
    }

    @Override
    protected BigDecimal getToppingPrice() {
        return new BigDecimal("0.1");
    }
}
