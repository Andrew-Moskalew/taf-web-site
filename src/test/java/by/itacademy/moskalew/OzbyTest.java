package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OzbyTest extends BaseTest {

    private OzbyPage ozbyPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://oz.by/");
        ozbyPage = new OzbyPage(driver);
        ozbyPage.clickButtonLogin();
    }

    @Test
    public void testOzbyEnter() {
        Assertions.assertEquals("Вход", ozbyPage.getTextHeaderTextEnter());
    }

    @Test
    public void testOzbyInvalidValues() throws InterruptedException {
        ozbyPage.clickTabLinkEmail();
        ozbyPage.sendKeysInputEmail("example@test.by");
        ozbyPage.sendKeysInputPassword("testPassword");
        ozbyPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться",
                ozbyPage.getTextErrorMassage());
    }

    @Test
    public void testOzbyTestEmail() throws InterruptedException {
        ozbyPage.clickTabLinkEmail();
        ozbyPage.sendKeysInputEmail("test@test.by");
        ozbyPage.sendKeysInputPassword("testPassword");
        ozbyPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Неверный пароль. Если вы потеряли или забыли пароль — восстановите его",
                ozbyPage.getTextErrorMassage());
    }

}
