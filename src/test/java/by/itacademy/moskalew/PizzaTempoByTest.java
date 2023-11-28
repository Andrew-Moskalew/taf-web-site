package by.itacademy.moskalew;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTempoByTest extends BaseTest{

    private PizzaTempoByPage pizzaTempoByPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://www.pizzatempo.by/");
        pizzaTempoByPage = new PizzaTempoByPage(driver);
    }

    @Test
    public void testPizzaTempoByOrderPizzaMargheria() throws InterruptedException {
        pizzaTempoByPage.clickLinkPizza();
        pizzaTempoByPage.clickOrderPizzaMargheria();
        Thread.sleep(500);
        pizzaTempoByPage.clickButtonOrder();
        Thread.sleep(500);
        pizzaTempoByPage.clickLinkBasket();
        Assertions.assertEquals("Пицца \"Маргарита\" (21см)", pizzaTempoByPage.getTextPizzaMargheriaInBasket());
    }

}
