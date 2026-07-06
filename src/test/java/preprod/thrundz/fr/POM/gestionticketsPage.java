package preprod.thrundz.fr.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gestionticketsPage extends LoginPage {
   
    
    // locator
    By affichage = By.xpath("//h1[text()='Gestion des tickets & annonces']");
    By nvTitre = By.xpath("//input[@placeholder='Titre du nouveau ticket']");
    By btnAdd = By.xpath("//button[text()='+ Ajouter']");
 
     public gestionticketsPage(WebDriver driver) {
        super(driver);
    }

    // methode

    public By getAffichage() {
        return this.affichage;
    }

    public By getNvTitre() {
        return nvTitre;
    }

    public By getBtnAdd() {
        return btnAdd;
    }

    public void setNvTitre(String titre,WebDriver driver) {
        System.out.println("========> url current===>"+this.driver.getCurrentUrl());
        driver.findElement(this.nvTitre).sendKeys(titre);
    }

    public void setBtnAdd() {
        this.driver.findElement(btnAdd).click();
    }

}
