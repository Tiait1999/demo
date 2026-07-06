package preprod.thrundz.fr.Models;

import java.util.ArrayList;

public interface Publicite {

    public String getTitle_publicite() ;

    public void setTitle_publicite(String titre);

    public String getUrlImage();

    public void setUrlImage(String urlImage);

    public ArrayList<Events> getListEventsPublicite() ;

    public void setListEventsPublicite(Events e) ;

    

}
