package preprod.thrundz.fr.Models;

import java.util.ArrayList;

public class Annonce implements Events, Publicite {

    private EnumTypeAnnonce type_event;
    private String title_Event;
    private String title_publicite, urlImage;
    private ArrayList<Events> listEventsPublicite;

    public Annonce(EnumTypeAnnonce typeEvent, String title_Event, String title_publicite, String urlImage) {
        this.title_Event = title_Event;
        this.title_publicite = title_publicite;
        this.urlImage = urlImage;
        this.listEventsPublicite = new ArrayList<>();
        this.type_event = typeEvent;
    }

    @Override
    public String getUrlImage() {
        return this.urlImage;
    }

    @Override
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public ArrayList<Events> getListEventsPublicite() {
        return this.listEventsPublicite;
    }

    @Override
    public void setListEventsPublicite(Events e) {
        this.listEventsPublicite.add(e);
    }

    @Override
    public String getTitle_Event() {
        return this.title_Event;
    }

    @Override
    public void setTitle_Event(String title_Event) {
        this.title_Event = title_Event;
    }

    @Override
    public String getTitle_publicite() {
        return this.title_publicite;
    }

    @Override
    public void setTitle_publicite(String title_publicite) {
        this.title_publicite = title_publicite;
    }
}