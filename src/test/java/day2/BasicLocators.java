package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasicLocators {
    public static void main(String[] args) {

        String Url1 = "https://demo.nopcommerce.com/";
//        String Url2 = "https://www.demoblaze.com/";
//        String Url3 = "https://parabank.parasoft.com/parabank/index.htm";


        // id
//        driver.findElement(By.id("cartur")).click();
//        String pageTitle = driver.getTitle();
//        System.out.println("Page Title is : " + pageTitle);

        //name
//        by name selector
        /*
        first we will hit the url then go to register link, then we will send/enter the input in input fields.
        * */

//        driver.get(Url2);
//
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("Register")).click();
//
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.firstName")).sendKeys("Debojyoti");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.lastName")).sendKeys("Das");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.address.street")).sendKeys("Saltlake City");
//        Thread.sleep(2);
//
//        driver.findElement(By.name("customer.address.city")).sendKeys("Kolkata");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.address.state")).sendKeys("West Bengal");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.address.zipCode")).sendKeys("700091");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.phoneNumber")).sendKeys("8741207845");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.ssn")).sendKeys("41256");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.username")).sendKeys("testuser@yopmail.com");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("customer.password")).sendKeys("Test@123");
//        Thread.sleep(2000);
//
//        driver.findElement(By.name("repeatedPassword")).sendKeys("Test@123");
//
//        driver.findElement(By.xpath("[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
//
//        String expectedTitle = "ParaBank | Customer Created";
//        String actualTitle = driver.getTitle();
//        if(actualTitle.equals(expectedTitle)) {
//            System.out.println("The page Title is correct !! and it is " + actualTitle);
//        }
//        else {
//            System.out.println("The page Title is incorrect !!");
//            System.out.println("Correct page Title is " + expectedTitle);
//        }
//
//        driver.findElement(By.linkText("Log Out")).click();

        // linkText
//        driver.get(Url1);
//        Boolean status = driver.findElement(By.linkText("Cart")).isDisplayed();
//        System.out.println("The text is showing " + status);

//        driver.findElement(By.linkText("Cart")).click();

        // partialLinkText
//         driver.get(Url1);
//        Boolean status = driver.findElement(By.partialLinkText("Ca")).isDisplayed();
//        System.out.println("The text is showing " + status);

//        driver.findElement(By.linkText("Cart")).click();

        // Classname
//        driver.get(Url1);
//        List <WebElement> links = driver.findElements(By.className("navbar-collapse"));
//        System.out.println("Total number of navbar links present are " + links.size());

        // Tagname

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(Url1);

//        List <WebElement> allLinks = driver.findElements(By.tagName("a"));
//        System.out.println("The total number of links present in this page is : " + allLinks.size());

        // no locator present like this example -->>

//        List <WebElement> allImagesLink = driver.findElements(By.tagName("imgaaaa"));
//        System.out.println("The total number of image links present in this page is : " + allImagesLink);


        driver.quit();
    }
}

// Locators matching (Single Web element) => findElement()   in WebElement.
// Locators matching (Multiple Web elements) need to store it in => findElements() in List<WebElement> collection.

// Scenario 1  => If locator matching with single webElement.
//findElement(locators) ==> Single Web Element.
// findElements(locators) ==> Single Web Element.

// Scenario 2  => If locator matching with multiple webElement.
//findElement(locators) ==> Single Web Element(first).
// findElements(locators) ==> multiple Web Element.

// Scenario 1  => If locator matching with no webElement.
//findElement(locators) ==> no such element exception.
// findElements(locators) ==> 0 or blank array [].