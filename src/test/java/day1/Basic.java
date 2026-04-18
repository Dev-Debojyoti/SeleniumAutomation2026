package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

    public static void main(String[] args) {
        String Url = "https://www.wikipedia.org";

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(Url);

        String title = driver.getTitle();
        System.out.println("The title of the page is " + title);

        driver.quit();
    }
}
