package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vek21byTest {
    @Test
    public void test21vekbyEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage(driver);
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonAccount();
        vek21byPage.clickButtonLogin();
        vek21byPage.clickButtonEnter();
        Assertions.assertEquals("Электронная почта не указана", vek21byPage.getTextErrorMassageEmail());
        Assertions.assertEquals("Пароль не указан", vek21byPage.getTextErrorMassagePassword());
        driver.close();
    }

    @Test
    public void test21vekEmptyPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage(driver);
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonAccount();
        vek21byPage.clickButtonLogin();
        Thread.sleep(500);
        vek21byPage.sendKeysInputEmail("test@test.by");
        vek21byPage.clickButtonEnter();
        Assertions.assertEquals("Пароль не указан", vek21byPage.getTextErrorMassagePassword());
        driver.close();
    }

    @Test
    public void test21vekEmptyEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage(driver);
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonAccount();
        vek21byPage.clickButtonLogin();
        Thread.sleep(500);
        vek21byPage.sendKeysInputPassword("testpassword");
        vek21byPage.clickButtonEnter();
        Assertions.assertEquals("Электронная почта не указана", vek21byPage.getTextErrorMassageEmail());
        driver.close();
    }

    @Test
    public void test21vekInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage(driver);
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonAccount();
        vek21byPage.clickButtonLogin();
        Thread.sleep(500);
        vek21byPage.sendKeysInputEmail("test@test.by");
        vek21byPage.sendKeysInputPassword("testpassword");
        vek21byPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?",
                vek21byPage.getTextErrorMassagePassword());
        driver.close();
    }

    @Test
    public void test21vekInvalidEmailFormat() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21byPage vek21byPage = new Vek21byPage(driver);
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonCookieReject();
        vek21byPage.clickButtonAccount();
        vek21byPage.clickButtonLogin();
        Thread.sleep(500);
        vek21byPage.sendKeysInputEmail("testInvalidEmail");
        vek21byPage.sendKeysInputPassword("testpassword");
        vek21byPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный формат электронной почты", vek21byPage.getTextErrorMassageEmail());
        driver.close();
    }

}
