package by.itacademy.moskalew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeightCalcPage {

    private String buttinCalculate = "//input[@type='submit']";
    private WebDriver driver;

    public WeightCalcPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtanCalculate() {
        driver.findElement(By.xpath(buttinCalculate)).click();
    }

}
