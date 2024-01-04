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
        Cake cupcakeWithChocolate = new ChocolateDecorator(new Cupcake());
        Assertions.assertEquals("\uD83E\uDDC1 with \uD83C\uDF6B", cupcakeWithChocolate
                .getName());
        Assertions.assertEquals(new BigDecimal("1.1"), cupcakeWithChocolate.getPrice());
        // chocolate cookie
        Cake cookieWithChocolate = new ChocolateDecorator(new Cookie());
        Assertions.assertEquals("\uD83C\uDF6A with \uD83C\uDF6B", cookieWithChocolate
                .getName());
        Assertions.assertEquals(new BigDecimal("2.1"), cookieWithChocolate.getPrice());
    }

    @Test
    void peanutToppingShouldBeCorrect() {
        // peanut cupcake
        Cake cupcakeWithPeanut = new PeanutDecorator(new Cupcake());
        Assertions.assertEquals("\uD83E\uDDC1 with \uD83E\uDD5C", cupcakeWithPeanut
                .getName());
        Assertions.assertEquals(new BigDecimal("1.2"), cupcakeWithPeanut.getPrice());
        // peanut cookie
        Cake cookieWithPeanut = new PeanutDecorator(new Cookie());
        Assertions.assertEquals("\uD83C\uDF6A with \uD83E\uDD5C", cookieWithPeanut
                .getName());
        Assertions.assertEquals(new BigDecimal("2.2"), cookieWithPeanut.getPrice());
    }

    @Test
    void multipleToppingsShouldBeCorrect() {
        // cookie with chocolate and peanut
        Cake cookieWithChocolateAndPeanut = new PeanutDecorator(new ChocolateDecorator(new Cookie()));
        Assertions.assertEquals("\uD83C\uDF6A with \uD83C\uDF6B and \uD83E\uDD5C", cookieWithChocolateAndPeanut
                .getName());

        // cookie with peanut and chocolate
        Cake cookieWithPeanutAndChocolate = new ChocolateDecorator(new PeanutDecorator(new Cookie()));
        Assertions.assertEquals("\uD83C\uDF6A with \uD83C\uDF6B and \uD83E\uDD5C", cookieWithPeanutAndChocolate
                .getName());
    }
}
