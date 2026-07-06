package preprod.thrundz.fr.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    //locators
    By email = By.cssSelector("input=[placeholder='admin@thrundrz.fr']");
    By pass = By.cssSelector("input=[type='password']");
    By login = By.xpath("//button[@value='Se connecter']");
    // methode 

    
}
