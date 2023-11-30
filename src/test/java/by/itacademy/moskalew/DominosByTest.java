package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DominosByTest extends BaseTest{
    private DominosByPage dominosByPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://dominos.by/");
        dominosByPage = new DominosByPage(driver);
    }

    @Test
    public void testDominosByOrderPizzaMargheria() {
        dominosByPage.clickCloseBunner();
        dominosByPage.clickAcceptCookies();
        dominosByPage.clickbuttonMargheriaToCart();
        dominosByPage.clickButtonCart();
        Assertions.assertEquals("Маргарита", dominosByPage.getTextPizzaMargheriaInCart());
    }

}
