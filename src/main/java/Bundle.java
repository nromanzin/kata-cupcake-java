import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Bundle implements Cake {
    private static final BigDecimal BUNDLE_REDUCTION = new BigDecimal("0.9");
    private final List<Cake> cakes;

    public Bundle(Cake... cakes) {
        super();
        this.cakes = List.of(cakes);
    }

    @Override
    public String getName() {
        if (cakes.isEmpty()) {
            return "Bundle is empty";
        }
        return "Bundle of " + cakes.stream().map(Cake::getName).collect(Collectors.joining(" and "));
    }

    @Override
    public BigDecimal getPrice() {
        return cakes.stream()
                .map(Cake::getPrice)
                .map(price -> price.multiply(BUNDLE_REDUCTION))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
