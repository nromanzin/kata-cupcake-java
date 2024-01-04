import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CakeCookerTest {

    @Test
    void cupcakeNameShouldBeCorrect() {
        Cake cupcake = new Cupcake();
        Assertions.assertEquals("\uD83E\uDDC1", cupcake.name);
    }

    @Test
    void cupcakePriceShouldBeCorrect() {
        Cake cupcake = new Cupcake();
        Assertions.assertEquals(1L, cupcake.price);
    }

    @Test
    void cookieNameShouldBeCorrect() {
        Cake cookie = new Cookie();
        Assertions.assertEquals("\uD83C\uDF6A", cookie.name);
    }

    @Test
    void cookiePriceShouldBeCorrect() {
        Cake cookie = new Cookie();
        Assertions.assertEquals(2L, cookie.price);
    }
}
