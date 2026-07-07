package preprod.thrundz.fr.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gestionticketsPage extends LoginPage {

    // locator
    By affichage = By.xpath("//h1[text()='Gestion des tickets & annonces']");
    By nvTitre = By.xpath("//input[@placeholder='Titre du nouveau ticket']");
    By btnAdd = By.xpath("//button[text()='+ Ajouter']");
    By AjouterAnnonce = By.xpath("(//button[text()='+ Ajouter une annonce'])[1]");

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

    public void setNvTitre(String titre) {
        System.out.println("========> url current===>" + this.driver.getCurrentUrl());
        driver.findElement(this.nvTitre).sendKeys(titre);
    }

    public void setBtnAdd() {
        this.driver.findElement(btnAdd).click();
    }

    public void setAffichage(By affichage) {
        this.affichage = affichage;
    }

    public void setNvTitre(By nvTitre) {
        this.nvTitre = nvTitre;
    }

    public void setBtnAdd(By btnAdd) {
        this.btnAdd = btnAdd;
    }

    public WebElement getElm(String titre) {
        By elm = By.xpath("//span[text()='" + titre + "']");
        return this.driver.findElement(elm);

    }

    public By getAjoutAnnonce() {
        return AjouterAnnonce;
    }

}
