import java.math.BigDecimal;

public class ChocolateDecorator extends CakeDecorator {
    public ChocolateDecorator(Cake source) {
        super(source);
    }

    @Override
    public String getName() {
        return super.getName() + " with \uD83C\uDF6B";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal("0.1"));
    }
}
