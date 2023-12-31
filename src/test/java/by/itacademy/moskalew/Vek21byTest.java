package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Vek21byTest extends BaseTest {
    private Vek21byPage vek21byPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://www.21vek.by/");
        vek21byPage = new Vek21byPage(driver);
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonAccount();
        vek21byPage.clickButtonLogin();
    }

    @Test
    public void test21vekbyEmptyValues() {
        vek21byPage.clickButtonEnter();
        Assertions.assertEquals("Электронная почта не указана", vek21byPage.getTextErrorMassageEmail());
        Assertions.assertEquals("Пароль не указан", vek21byPage.getTextErrorMassagePassword());
    }

    @Test
    public void test21vekEmptyPassword() throws InterruptedException {
        Thread.sleep(500);
        vek21byPage.sendKeysInputEmail("test@test.by");
        vek21byPage.clickButtonEnter();
        Assertions.assertEquals("Пароль не указан", vek21byPage.getTextErrorMassagePassword());
    }

    @Test
    public void test21vekEmptyEmail() throws InterruptedException {
        Thread.sleep(500);
        vek21byPage.sendKeysInputPassword("testpassword");
        vek21byPage.clickButtonEnter();
        Assertions.assertEquals("Электронная почта не указана", vek21byPage.getTextErrorMassageEmail());
    }

    @Test
    public void test21vekInvalidValues() throws InterruptedException {

        Thread.sleep(500);
        vek21byPage.sendKeysInputEmail("test@test.by");
        vek21byPage.sendKeysInputPassword("testpassword");
        vek21byPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?",
                vek21byPage.getTextErrorMassagePassword());
    }

    @Test
    public void test21vekInvalidEmailFormat() throws InterruptedException {

        Thread.sleep(500);
        vek21byPage.sendKeysInputEmail("testInvalidEmail");
        vek21byPage.sendKeysInputPassword("testpassword");
        vek21byPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный формат электронной почты", vek21byPage.getTextErrorMassageEmail());
    }

}
