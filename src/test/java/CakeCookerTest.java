import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CakeCookerTest {

    @Test
    void cupcakeNameShouldBeCorrect() {
        Cake cupcake = new Cupcake();
        Assertions.assertEquals("\uD83E\uDDC1", cupcake
                .getName());
    }

    @Test
    void cupcakePriceShouldBeCorrect() {
        Cake cupcake = new Cupcake();
        Assertions.assertEquals(1L, cupcake.getPrice());
    }

    @Test
    void cookieNameShouldBeCorrect() {
        Cake cookie = new Cookie();
        Assertions.assertEquals("\uD83C\uDF6A", cookie.getName());
    }

    @Test
    void cookiePriceShouldBeCorrect() {
        Cake cookie = new Cookie();
        Assertions.assertEquals(2L, cookie.getPrice());
    }
}
