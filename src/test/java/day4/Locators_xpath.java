package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_xpath {

    public static void main(String []args) {

        String Url = "https://www.saucedemo.com/";

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Url);

        // Xpath with Single Attribute

//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("username");
//        driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Password"); // can be written like this without input

        // Xpath with multiple Attribute

//        driver.findElement(By.xpath("//input[@placeholder = 'Password'][@type='password']")).sendKeys("password");
//        driver.findElement(By.xpath("//*[@placeholder = 'Password'][@type = 'password']")).sendKeys("Pass@1234");


        // Xpath with and operator //both have to be correct

//        driver.findElement(By.xpath("//input[@placeholder = 'Password' and @type='password']")).sendKeys("password");

        // not locate as one attribute value is false.
        // driver.findElement(By.xpath("//*[@placeholder = 'Password1' and @type='password']")).sendKeys("password");


        // Xpath with or operator // any one between 2 need to be correct
//         driver.findElement(By.xpath("//*[@placeholder = 'Password1' or @type='password']")).sendKeys("password");

        // xpath if there are inner text available, then we can use text() = 'inner text / link text';
        // no attribute  = value needed no //tag/*[@attribute = 'value'];

//        String text  = driver.findElement(By.xpath("//h4[text() = 'Accepted usernames are:']")).getText();
//        System.out.println("The text is : " + text);

//    boolean displayStatus = driver.findElement(By.xpath("//div[text() = 'Swag Labs']")).isDisplayed();
//    System.out.println("Is the text present in current page (true/false) : " + displayStatus);


        // handling dynamic properties
        // suppose a same attribute id is start and next time is stop
        // or, contains, starts-with

        //   //button[@id = 'start' or @id = 'stop'];
        //   //*[contains(@id, 'st')]
        //   //*[starts-with(@id, 'st')]



       // xpath with contains() method -- will search a partial text of the value for an attribute in a tag
        // contains() will match a value of string with text partially we can use the part of the string anywhere in the string

//       driver.findElement(By.xpath("//input[contains(@placeholder, 'Word')]")).sendKeys("Pass@123");


        // xpath with starts-with() method -- will search a partial text of the value for an attribute in a tag
        // starts-with() need a part of the text string of the value from starting characters of the string value

       driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Pass')]")).sendKeys("Pass@123");


       // chained xpath -- a combination of absolute & relative xpath
        // Suppose, there is an img with no attribute, but we have to locate that, then we can
        // target its parent, if it also has no attribute then w can target its parent

       boolean isVisible = driver.findElement(By.xpath("//*[@id = 'logo']/div/img")).isDisplayed();
       System.out.println("The Image is Visible : " + isVisible);










    }
}
