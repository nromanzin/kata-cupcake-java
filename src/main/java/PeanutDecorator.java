import java.math.BigDecimal;

public class PeanutDecorator extends CakeDecorator {
    public PeanutDecorator(Cake source) {
        super(source);
    }

    @Override
    public String getName() {
        return super.getName() + " with \uD83E\uDD5C";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal("0.2"));
    }
}
