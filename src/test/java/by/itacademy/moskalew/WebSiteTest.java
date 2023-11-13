package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {
    @Test
    public void test21vekbyEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Website21vekbyPage website21vekbyPage = new Website21vekbyPage();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonAccount)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonLogin)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonEnter)).click();
        Assertions.assertEquals("Электронная почта не указана", driver.findElement(By.xpath(website21vekbyPage.errorMassageEmailNotFound)).getText());
        Assertions.assertEquals("Пароль не указан", driver.findElement(By.xpath(website21vekbyPage.errorMassagePasswordNotFound)).getText());
        driver.close();
    }

    @Test
    public void test21vekEmptyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Website21vekbyPage website21vekbyPage = new Website21vekbyPage();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonAccount)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonLogin)).click();
        driver.findElement(By.xpath(website21vekbyPage.inputEmail)).sendKeys("test@test.by");
        driver.findElement(By.xpath(website21vekbyPage.buttonEnter)).click();
        Assertions.assertEquals("Пароль не указан", driver.findElement(By.xpath(website21vekbyPage.errorMassagePasswordNotFound)).getText());
        driver.close();
    }

    @Test
    public void test21vekEmptyEmail() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Website21vekbyPage website21vekbyPage = new Website21vekbyPage();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonAccount)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonLogin)).click();
        driver.findElement(By.xpath(website21vekbyPage.inputPassword)).sendKeys("testpassword");
        driver.findElement(By.xpath(website21vekbyPage.buttonEnter)).click();
        Assertions.assertEquals("Электронная почта не указана", driver.findElement(By.xpath(website21vekbyPage.errorMassageEmailNotFound)).getText());
        driver.close();
    }

    @Test
    public void test21vekInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Website21vekbyPage website21vekbyPage = new Website21vekbyPage();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonAccount)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonLogin)).click();
        driver.findElement(By.xpath(website21vekbyPage.inputEmail)).sendKeys("test@test.by");
        driver.findElement(By.xpath(website21vekbyPage.inputPassword)).sendKeys("testpassword");
        driver.findElement(By.xpath(website21vekbyPage.buttonEnter)).click();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?", driver.findElement(By.xpath(website21vekbyPage.errorMassagePasswordInvalid)).getText());
        driver.close();
    }

    @Test
    public void test21vekInvalidEmailFormat() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Website21vekbyPage website21vekbyPage = new Website21vekbyPage();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonCookieReject)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonAccount)).click();
        driver.findElement(By.xpath(website21vekbyPage.buttonLogin)).click();
        driver.findElement(By.xpath(website21vekbyPage.inputEmail)).sendKeys("testInvalidEmail");
        driver.findElement(By.xpath(website21vekbyPage.inputPassword)).sendKeys("testpassword");
        driver.findElement(By.xpath(website21vekbyPage.buttonEnter)).click();
        Thread.sleep(500);
        Assertions.assertEquals("Неправильный формат электронной почты", driver.findElement(By.xpath(website21vekbyPage.errorMassageEmailInvalidFormat)).getText());
        driver.close();
    }
}
