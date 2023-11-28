package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassRWbyTest extends BaseTest {
    private PassRWbyPage passRWbyPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://pass.rw.by/ru/");
        passRWbyPage = new PassRWbyPage(driver);
        passRWbyPage.clickButtonPersonalAccount();
    }

    @Test
    public void testPassRWbyAutorisationForm() throws InterruptedException {
        Thread.sleep(500);
        Assertions.assertEquals("Авторизация", passRWbyPage.getTextHeaderTextAutorisation());
    }

    @Test
    public void testPassRWWithEmptyValues() throws InterruptedException {
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassageLoginOrEmail());
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassagePassword());
    }

    @Test
    public void testPassRWWithEmptyEmail() throws InterruptedException {
        passRWbyPage.sendKeysInputPassword("password");
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassageLoginOrEmail());
    }

    @Test
    public void testPassRWWithEmptyPassword() throws InterruptedException {
        passRWbyPage.sendKeysInputLoginOrEmail("login");
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassagePassword());
    }

    @Test
    public void testPassRWWithInvalidValues() throws InterruptedException {
        passRWbyPage.sendKeysInputLoginOrEmail("login");
        Thread.sleep(200);
        passRWbyPage.sendKeysInputPassword("password");
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Пользователь не найден", passRWbyPage.getTextErrorMassageUserNotFound());
    }
}
