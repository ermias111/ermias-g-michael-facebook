/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotest;

/**
 *
 * @author joel
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBnotification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        System.out.println("page title " + driver.getTitle());
        System.out.println("Current url " + driver.getCurrentUrl());
        System.out.println("length " + driver.getPageSource().toString().length());
        
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement login = driver.findElement(By.id("u_0_2"));
        email.sendKeys("ermigebremichael@gmail.com");
        password.sendKeys("e412213");
        login.click();
        
        WebElement notificationC = driver.findElement(By.id("notificationsCountValue"));
        String count = notificationC.getText();
        System.out.println("you have " + count + " notifications    ");
        
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            
        }
        //searchbox.clear();
        
        //driver.close();
        
        
      //  driver.close();
    }
    
}
