package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzbyTest {
    @Test
    public void testOzbyEnter() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzbyPage ozbyPage = new OzbyPage(driver);
        ozbyPage.clickButtonLogin();
        Assertions.assertEquals("Вход", ozbyPage.getTextHeaderTextEnter());
        driver.close();
    }

    @Test
    public void testOzbyInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzbyPage ozbyPage = new OzbyPage(driver);
        ozbyPage.clickButtonLogin();
        ozbyPage.clickTabLinkEmail();
        ozbyPage.sendKeysInputEmail("example@test.by");
        ozbyPage.sendKeysInputPassword("testPassword");
        ozbyPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться",
                ozbyPage.getTextErrorMassage());
        driver.close();
    }

    @Test
    public void testOzbyTestEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzbyPage ozbyPage = new OzbyPage(driver);
        ozbyPage.clickButtonLogin();
        ozbyPage.clickTabLinkEmail();
        ozbyPage.sendKeysInputEmail("test@test.by");
        ozbyPage.sendKeysInputPassword("testPassword");
        ozbyPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Неверный пароль. Если вы потеряли или забыли пароль — восстановите его",
                ozbyPage.getTextErrorMassage());
        driver.close();
    }

}
