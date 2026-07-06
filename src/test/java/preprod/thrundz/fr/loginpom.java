package preprod.thrundz.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import preprod.thrundz.fr.POM.LoginPage;
import preprod.thrundz.fr.POM.gestionticketsPage;

public class loginpom {
    WebDriver driver;// definir une variable globale
    gestionticketsPage gp;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    
        gp = new gestionticketsPage(driver);
        driver.get("https://preprod.thrundrz.fr/admin/login");
    }

    @AfterEach
    public void tearDown() {
       
    }

    @Test
    @Tag("smoke")
    public void loginvalid() {
        gp.saisiremail("admin@thrundrz.fr");
        gp.saisirpass("Admin1234");
        gp.cliclog();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(gp.getAffichage()));
        
        boolean k=driver.getCurrentUrl().endsWith("/admin");
        System.out.println("==========>"+k+driver.getCurrentUrl());
        assertTrue(k); 
       
    }

}
