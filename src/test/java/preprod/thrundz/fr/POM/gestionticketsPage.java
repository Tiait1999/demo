package preprod.thrundz.fr.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gestionticketsPage extends LoginPage {
    public gestionticketsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebDriver driver;
    //locator
    By affichage = By.xpath("//h1[text()='Gestion des tickets & annonces']");
    // methode 

    public By getAffichage(){
        return this.affichage;
    }
}
