import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CakeCookerTest {

    @Test
    void cupcakeShouldBeCorrect() {
        Cake cupcake = new Cupcake();
        assertEquals("\uD83E\uDDC1", cupcake
                .getName());
        assertEquals(new BigDecimal(1), cupcake.getPrice());
    }

    @Test
    void cookieShouldBeCorrect() {
        Cake cookie = new Cookie();
        assertEquals("\uD83C\uDF6A", cookie.getName());
        assertEquals(new BigDecimal(2), cookie.getPrice());
    }

    @Test
    void chocolateToppingShouldBeCorrect() {
        // chocolate cupcake
        Cake cupcakeWithChocolate = new ChocolateTopping(new Cupcake());
        assertEquals("\uD83E\uDDC1 with \uD83C\uDF6B", cupcakeWithChocolate
                .getName());
        assertEquals(new BigDecimal("1.1"), cupcakeWithChocolate.getPrice());
        // chocolate cookie
        Cake cookieWithChocolate = new ChocolateTopping(new Cookie());
        assertEquals("\uD83C\uDF6A with \uD83C\uDF6B", cookieWithChocolate
                .getName());
        assertEquals(new BigDecimal("2.1"), cookieWithChocolate.getPrice());
    }

    @Test
    void peanutToppingShouldBeCorrect() {
        // peanut cupcake
        Cake cupcakeWithPeanut = new PeanutTopping(new Cupcake());
        assertEquals("\uD83E\uDDC1 with \uD83E\uDD5C", cupcakeWithPeanut
                .getName());
        assertEquals(new BigDecimal("1.2"), cupcakeWithPeanut.getPrice());
        // peanut cookie
        Cake cookieWithPeanut = new PeanutTopping(new Cookie());
        assertEquals("\uD83C\uDF6A with \uD83E\uDD5C", cookieWithPeanut
                .getName());
        assertEquals(new BigDecimal("2.2"), cookieWithPeanut.getPrice());
    }

    @Test
    void multipleToppingsShouldBeCorrect() {
        // cookie with chocolate and peanut
        Cake cookieWithChocolateAndPeanut = new PeanutTopping(new ChocolateTopping(new Cookie()));
        assertEquals("\uD83C\uDF6A with \uD83C\uDF6B and \uD83E\uDD5C", cookieWithChocolateAndPeanut
                .getName());

        // cookie with peanut and chocolate
        Cake cookieWithPeanutAndChocolate = new ChocolateTopping(new PeanutTopping(new Cookie()));
        assertEquals("\uD83C\uDF6A with \uD83E\uDD5C and \uD83C\uDF6B", cookieWithPeanutAndChocolate
                .getName());
    }

    @Test
    void bundleShouldWork() {
        Cake cupcake = new Cupcake();
        Cake cookie = new Cookie();

        Bundle emptyBundle = new Bundle();
        assertEquals("Bundle is empty", emptyBundle.getName());
        assertEquals(BigDecimal.ZERO, emptyBundle.getPrice().stripTrailingZeros());

        Bundle bundleWith1Cupcake = new Bundle(cupcake);
        assertEquals("Bundle is made of \uD83E\uDDC1", bundleWith1Cupcake.getName());
        assertEquals(new BigDecimal("0.9"), bundleWith1Cupcake.getPrice());

        Bundle bundleWith1CupcakeAnd1Cookie = new Bundle(cupcake, cookie);
        assertEquals("Bundle is made of \uD83E\uDDC1 and \uD83C\uDF6A", bundleWith1CupcakeAnd1Cookie.getName());
        assertEquals(new BigDecimal("2.7"), bundleWith1CupcakeAnd1Cookie.getPrice());

        Bundle bundleWith2CupcakesAnd1Cookie = new Bundle(cupcake, cupcake, cookie);
        assertEquals("Bundle is made of \uD83E\uDDC1 and \uD83E\uDDC1 and \uD83C\uDF6A", bundleWith2CupcakesAnd1Cookie.getName());
        assertEquals(new BigDecimal("3.6"), bundleWith2CupcakesAnd1Cookie.getPrice());
    }
}
