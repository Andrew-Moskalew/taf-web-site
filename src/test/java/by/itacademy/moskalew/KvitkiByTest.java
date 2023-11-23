package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiByTest {
    @Test
    public void testKvitkiByAutorisatinoForm() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
        kvitkiByPage.clickButtonAcceptCookies();
        kvitkiByPage.clickButtonLogin();
        Thread.sleep(500);
        Assertions.assertEquals("Вход", kvitkiByPage.getTextButtonTabEnter());
        driver.close();
    }

    @Test
    public void testKvitkiByEmptyEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
        kvitkiByPage.clickButtonAcceptCookies();
        kvitkiByPage.clickButtonLogin();
        Thread.sleep(500);
        kvitkiByPage.clickInputEmail();
        kvitkiByPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiByPage.getTextErrorMassageEmail());
        driver.close();
    }

    @Test
    public void testKvitkiByEmptyPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
        kvitkiByPage.clickButtonAcceptCookies();
        kvitkiByPage.clickButtonLogin();
        Thread.sleep(500);
        kvitkiByPage.clickInputPassword();
        kvitkiByPage.clickInputEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiByPage.getTextErrorMassagePassword());
        driver.close();
    }

    @Test
    public void testKvitkiByInvalidEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
        kvitkiByPage.clickButtonAcceptCookies();
        kvitkiByPage.clickButtonLogin();
        Thread.sleep(3000);
        kvitkiByPage.sendKeysInputEmail("email");
        kvitkiByPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiByPage.getTextErrorMassageEmail());
        driver.close();
    }

    @Test
    public void testKvitkiByInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiByPage kvitkiByPage = new KvitkiByPage(driver);
        kvitkiByPage.clickButtonAcceptCookies();
        kvitkiByPage.clickButtonLogin();
        Thread.sleep(2000);
        kvitkiByPage.sendKeysInputEmail("test@email.com");
        kvitkiByPage.sendKeysInputPassword("testpassword");
        kvitkiByPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitkiByPage.getTextErrorMassageNoFindUser());
        driver.close();
    }
}
