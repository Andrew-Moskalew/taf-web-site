package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KvitkiByTest extends BaseTest {

    private KvitkiByPage kvitkiByPage;

    @BeforeEach
    public void testStart() {
        driver.get("https://www.kvitki.by/rus/");
        kvitkiByPage = new KvitkiByPage(driver);
        kvitkiByPage.clickButtonAcceptCookies();
        kvitkiByPage.clickButtonLogin();
    }

    @Test
    public void testKvitkiByAutorisatinoForm() throws InterruptedException {
        Thread.sleep(500);
        Assertions.assertEquals("Вход", kvitkiByPage.getTextButtonTabEnter());
    }

    @Test
    public void testKvitkiByEmptyEmail() throws InterruptedException {
        Thread.sleep(500);
        kvitkiByPage.clickInputEmail();
        kvitkiByPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiByPage.getTextErrorMassageEmail());
    }

    @Test
    public void testKvitkiByEmptyPassword() throws InterruptedException {
        Thread.sleep(500);
        kvitkiByPage.clickInputPassword();
        kvitkiByPage.clickInputEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiByPage.getTextErrorMassagePassword());
    }

    @Test
    public void testKvitkiByInvalidEmail() throws InterruptedException {
        Thread.sleep(3000);
        kvitkiByPage.sendKeysInputEmail("email");
        kvitkiByPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiByPage.getTextErrorMassageEmail());
    }

    @Test
    public void testKvitkiByInvalidValues() throws InterruptedException {
        Thread.sleep(2000);
        kvitkiByPage.sendKeysInputEmail("test@email.com");
        kvitkiByPage.sendKeysInputPassword("testpassword");
        kvitkiByPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitkiByPage.getTextErrorMassageNoFindUser());
    }

}
