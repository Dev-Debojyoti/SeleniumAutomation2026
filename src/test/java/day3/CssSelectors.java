package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

    public static void main(String[] args){

        String Url = "https://demo.nopcommerce.com/";

        WebDriver driver = new ChromeDriver();
        driver.get(Url);
        driver.manage().window().maximize();

    //    1. tag.id 1st way

        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Men's Shirts");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // also can be written without tag word
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Men's Shirts");

   //     2. tag.class 2nd way

        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Men's Shirts");
        // also can be written without tag word
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Men's Shirts");

//        3. tag[attribute='value'] 3rd way

        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Men's Shirts");
//         also can be written without tag word
        driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Men's Shirts");

//        4. tag.class[attribute='value'] 4th way

        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Men's Shirts");
//         also can be written without tag word
        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Men's Shirts");

        driver.quit();
    }

}
