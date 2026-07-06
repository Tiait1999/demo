package preprod.thrundz.fr.Models;

import java.util.ArrayList;

public class Ticket {
    private String titreTicket;
    private ArrayList<Annonce> listAnnonces;

    public Ticket(String titreTicket) {
        this.titreTicket = titreTicket;
        this.listAnnonces = new ArrayList<>();
    }

    public String getTitreTicket() {
        return titreTicket;
    }

    public void setTitreTicket(String titreTicket) {
        this.titreTicket = titreTicket;
    }

    public ArrayList<Annonce> getListAnnonces() {
        return listAnnonces;
    }

    public void setListAnnonces(Annonce a) {
        this.listAnnonces.add(a);
    }

    
    



}
