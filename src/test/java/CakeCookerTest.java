import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CakeCookerTest {

    @Test
    void cupcakeShouldBeCorrect() {
        Cake cupcake = new Cupcake();
        Assertions.assertEquals("\uD83E\uDDC1", cupcake
                .getName());
        Assertions.assertEquals(new BigDecimal(1), cupcake.getPrice());
    }

    @Test
    void cookieShouldBeCorrect() {
        Cake cookie = new Cookie();
        Assertions.assertEquals("\uD83C\uDF6A", cookie.getName());
        Assertions.assertEquals(new BigDecimal(2), cookie.getPrice());
    }

    @Test
    void chocolateToppingShouldBeCorrect() {
        // chocolate cupcake
        Cake chocolateCupcake = new ChocolateDecorator(new Cupcake());
        Assertions.assertEquals("\uD83E\uDDC1 with \uD83C\uDF6B", chocolateCupcake
                .getName());
        Assertions.assertEquals(new BigDecimal("1.1"), chocolateCupcake.getPrice());
        // chocolate cookie
        Cake chocolateCookie = new ChocolateDecorator(new Cookie());
        Assertions.assertEquals("\uD83C\uDF6A with \uD83C\uDF6B", chocolateCookie
                .getName());
        Assertions.assertEquals(new BigDecimal("2.1"), chocolateCookie.getPrice());
    }

    @Test
    void peanutToppingShouldBeCorrect() {
        // peanut cupcake
        Cake peanutCupcake = new PeanutDecorator(new Cupcake());
        Assertions.assertEquals("\uD83E\uDDC1 with \uD83E\uDD5C", peanutCupcake
                .getName());
        Assertions.assertEquals(new BigDecimal("1.2"), peanutCupcake.getPrice());
        // peanut cookie
        Cake peanutCookie = new PeanutDecorator(new Cookie());
        Assertions.assertEquals("\uD83C\uDF6A with \uD83E\uDD5C", peanutCookie
                .getName());
        Assertions.assertEquals(new BigDecimal("2.2"), peanutCookie.getPrice());
    }
}
