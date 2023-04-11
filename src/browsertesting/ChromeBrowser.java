package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 */
public class ChromeBrowser {public static void main(String[] args) {
    String baseUrl = "https://www.saucedemo.com";
    //Launch the chrome
    WebDriver driver = new ChromeDriver();
    //open url
    driver.get(baseUrl);
    //Maximise the browser
    driver.manage().window().maximize();
    // impilict weight
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    //Get title of page
    String title = driver.getTitle();
    //print title
    System.out.println(title);
    //get the current url
    driver.getCurrentUrl();
    //print url
    System.out.println("Current URL : " + driver.getCurrentUrl());
    //Get page source
    System.out.println("Page source : " + driver.getPageSource());
    //find user name  to username field element
    WebElement userNameField = driver.findElement(By.id("user-name"));
    //Type the user name to username field element
    userNameField.sendKeys("niksen");
    //find the password field element and type the password
    WebElement passwordField = driver.findElement(By.id("password"));
    //Type the password in password field
    passwordField.sendKeys("Nik1234");
    //Close the Browser
    driver.close();


}

}


