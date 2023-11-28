package by.itacademy.moskalew;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {

    @Test
    public void testWeightCalcWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WeightCalcPage weightCalcPage = new WeightCalcPage(driver);
        weightCalcPage.clickButtanCalculate();
    }

}
