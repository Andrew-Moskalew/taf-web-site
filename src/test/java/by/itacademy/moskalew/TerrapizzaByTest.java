package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TerrapizzaByTest extends BaseTest {

    private TerrapizzaByPage terrapizzaByPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://terrapizza.by/");
        terrapizzaByPage = new TerrapizzaByPage(driver);
    }

    @Test
    public void testTerrapizzaByTestOrder() throws InterruptedException {
        terrapizzaByPage.clickButtonCloseCookies();
        terrapizzaByPage.clickLinkPizza();
        terrapizzaByPage.clickButtonAddPizzaMargheriaToBasket();
        terrapizzaByPage.clickLinkBar();
        terrapizzaByPage.clickButtonAddGingerTeaToBasket();
        Thread.sleep(500);
        terrapizzaByPage.clickButtonBasket();
        Thread.sleep(500);
        Assertions.assertEquals("Пицца Маргарита на тонком 32 см", terrapizzaByPage.getTextPizzaMargheria());
        Assertions.assertEquals("Имбирный чай", terrapizzaByPage.getTextGingerTea());
    }

}
