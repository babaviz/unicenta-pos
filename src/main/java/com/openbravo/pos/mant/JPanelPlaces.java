

package com.openbravo.pos.mant;
import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ListCellRendererBasic;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.data.loader.Vectorer;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.data.user.ListProvider;
import com.openbravo.data.user.ListProviderCreator;
import com.openbravo.data.user.SaveProvider;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.panels.JPanelTable;
import javax.swing.ListCellRenderer;

/**
 *
 * @author adrianromero
 */
public class JPanelPlaces extends JPanelTable {
    
    private TableDefinition tplaces;
    private PlacesEditor jeditor;
    
    /** Creates a new instance of JPanelPlaces */
    public JPanelPlaces() {
    }
    
    /**
     *
     */
    @Override
    protected void init() {
        DataLogicSales dlSales = null;
        dlSales = (DataLogicSales) app.getBean("com.openbravo.pos.forms.DataLogicSales");
        
        tplaces = new TableDefinition(app.getSession(),
            "places"
            , new String[] {"ID", "NAME", "SEATS", "X", "Y", "FLOOR", "WIDTH", "HEIGHT"}
            , new String[] {"ID", AppLocal.getIntString("label.name"), 
                AppLocal.getIntString("label.seats"), "X", "Y", 
                AppLocal.getIntString("label.placefloor")}
            , new Datas[] {
                Datas.STRING, Datas.STRING, Datas.STRING, 
                Datas.INT, Datas.INT, 
                Datas.STRING,
                Datas.INT, Datas.INT }
            , new Formats[] {
                Formats.STRING, Formats.STRING, Formats.STRING, 
                Formats.INT, Formats.INT, 
                Formats.NULL,
                Formats.INT, Formats.INT }
            , new int[] {0}
        ); 
        jeditor = new PlacesEditor(dlSales, dirty); 
    }
        
    /**
     *
     * @return
     */
    @Override
    public ListProvider getListProvider() {
        return new ListProviderCreator(tplaces);
    }
    
    /**
     *
     * @return
     */
    @Override
    public SaveProvider getSaveProvider() {
        return new SaveProvider(tplaces);      
    }
    
    /**
     *
     * @return
     */
    @Override
    public Vectorer getVectorer() {
        return tplaces.getVectorerBasic(new int[]{1});
    }
    
    /**
     *
     * @return
     */
    @Override
    public ListCellRenderer getListCellRenderer() {
        return new ListCellRendererBasic(tplaces.getRenderStringBasic(new int[]{1}));
    }
    
    /**
     *
     * @return
     */
    @Override
    public EditorRecord getEditor() {
        return jeditor;
    }

    /**
     *
     * @return
     */
    @Override
    public String getTitle() {
        return AppLocal.getIntString("Menu.Tables");
    }

    /**
     *
     * @throws BasicException
     */
    @Override
    public void activate() throws BasicException {
        jeditor.activate();
        super.activate();        
    }     
}