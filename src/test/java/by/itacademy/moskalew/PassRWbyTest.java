package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassRWbyTest {
    @Test
    public void testPassRWbyAutorisationForm() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRWbyPage passRWbyPage = new PassRWbyPage(driver);
        passRWbyPage.clickButtonPersonalAccount();
        Thread.sleep(500);
        Assertions.assertEquals("Авторизация", passRWbyPage.getTextHeaderTextAutorisation());
        driver.close();
    }

    @Test
    public void testPassRWWithEmptyValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRWbyPage passRWbyPage = new PassRWbyPage(driver);
        passRWbyPage.clickButtonPersonalAccount();
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassageLoginOrEmail());
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassagePassword());
        driver.close();
    }

    @Test
    public void testPassRWWithEmptyEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRWbyPage passRWbyPage = new PassRWbyPage(driver);
        passRWbyPage.clickButtonPersonalAccount();
        passRWbyPage.sendKeysInputPassword("password");
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassageLoginOrEmail());
        driver.close();
    }
    @Test
    public void testPassRWWithEmptyPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRWbyPage passRWbyPage = new PassRWbyPage(driver);
        passRWbyPage.clickButtonPersonalAccount();
        passRWbyPage.sendKeysInputLoginOrEmail("login");
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRWbyPage.getTextErrorMassagePassword());
        driver.close();
    }
    @Test
    public void testPassRWWithInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRWbyPage passRWbyPage = new PassRWbyPage(driver);
        passRWbyPage.clickButtonPersonalAccount();
        passRWbyPage.sendKeysInputLoginOrEmail("login");
        Thread.sleep(200);
        passRWbyPage.sendKeysInputPassword("password");
        Thread.sleep(500);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Пользователь не найден", passRWbyPage.getTextErrorMassageUserNotFound());
                driver.close();
    }
}
