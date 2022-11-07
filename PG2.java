package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Double.parseDouble;


public class PG2 {
    static WebDriver driver;
    public static void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alunos\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        String baseUrl = "https://www.google.com";
        driver.get(baseUrl);



        driver.close();
    }

    double calcular(String op){
        WebElement source = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        source.sendKeys(op);
        source.submit();
        WebElement mapInput = driver.findElement(By.xpath("//*[@id=\"cwos\"]"));
        mapInput.click();

        double resultado = parseDouble(mapInput.getText());
        return resultado;
    }
}


