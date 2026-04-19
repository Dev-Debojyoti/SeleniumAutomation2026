package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpath {

    public static void main(String[] args) {

        String Url= "https://demo.nopcommerce.com/";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(Url);

        // Relative Xpath with single attribute
        // Locating a search text input

//        driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("T-Shirts");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();

//        driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//         We can also write by * instead of tagname, it will work then also.
//        boolean displayStatus = driver.findElement(By.xpath("//*[@alt='nopCommerce demo store']")).isDisplayed();
//        System.out.println("Is the image displayed ? " + displayStatus);

        // Relative Xpath with multiple attribute
//        boolean displayStatus = driver.findElement(By.xpath("//img[@alt='Picture for category Apparel'][@title='Show products in category Apparel']")).isDisplayed();
//        System.out.println("Is the image displayed ? " + displayStatus);

        // Relative Xpath with 'and'  &  'or'  operator with multiple attributes.

        // and
        // works(both have to be true)
//        driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("T-Shirts");

        // will fail (if one attribute doesn't match)
//     driver.findElement(By.xpath("//input[@name='q' and @placeholder='xyz']")).sendKeys("T-Shirts"); // unable to locate exception


        // or
        // works(only one attribute has to be true)
//        driver.findElement(By.xpath("//input[@name='q' or @placeholder='abc']")).sendKeys("T-Shirts");

        // will fail (if both attribute doesn't match)
//     driver.findElement(By.xpath("//input[@name='a' or @placeholder='xyz']")).sendKeys("T-Shirts"); // unable to locate exception


        // Relative Xpath for inner text using text() method. No attribute needed like for h2 div label text. no @ required as it is no attribute

//        boolean status = driver.findElement(By.xpath("//h2[text() = 'Welcome to our store']")).isDisplayed();
//        System.out.println("Text found in page, Response : " + status);

        String text = driver.findElement(By.xpath("//h2[text() = 'Welcome to our store']")).getText();
        System.out.println("The text is : " + text);









    }
}
