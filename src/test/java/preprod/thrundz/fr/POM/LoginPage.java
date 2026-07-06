package preprod.thrundz.fr.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    //locators
    By email = By.cssSelector("input[placeholder='admin@thrundrz.fr']");
    By pass = By.cssSelector("input[type='password']");
    By login = By.xpath("//button[text()='Se connecter']");
    // methode 
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void saisiremail(String e){
        driver.findElement(email).sendKeys(e);
    }
    public void saisirpass(String p){
    driver.findElement(pass).sendKeys(p);
    }
    public void cliclog(){
    driver.findElement(login).click();
    
}
}