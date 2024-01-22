import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bundle implements Cake {
    private static final BigDecimal BUNDLE_REDUCTION = new BigDecimal("0.9");
    private final List<Cake> cakes;
    private boolean isRoot = true;

    public Bundle(Cake... cakes) {
        super();
        List<Bundle> bundles = Stream.of(cakes).filter(cake -> cake instanceof Bundle).map(cake -> (Bundle) cake).toList();
        for (Bundle bundle : bundles) {
            bundle.isRoot = false;
        }
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
                .map(price -> price.multiply(isRoot ? BUNDLE_REDUCTION : BigDecimal.valueOf(1)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
