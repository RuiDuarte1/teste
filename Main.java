package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class PG1 {
    public static void test() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Alunos\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.google.com";

        String expectedTitle = "ifce caninde";
        String actualTitle = "";

        driver.get(baseUrl);
        WebElement source = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        source.sendKeys("ifce caninde");
        source.submit();
        WebElement maps = driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a"));
        maps.click();

        new WebDriverWait(driver,8);
        WebElement mapInput = driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]"));//*[@id="searchboxinput"]
        mapInput.click();

        String valor = mapInput.getAttribute("value");
        System.out.println(mapInput.getAttribute("value"));
        // get the actual value of the title
//        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//
//        //close Fire fox
        driver.close();
    }
}

public class Main {
    public static void main(String[] args) {

        PG1.test();
//        PG2.test();
    }
}