

package com.openbravo.pos.customers;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ListCellRendererBasic;
import com.openbravo.data.loader.ComparatorCreator;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.data.loader.Vectorer;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.data.user.ListProvider;
import com.openbravo.data.user.ListProviderCreator;
import com.openbravo.data.user.SaveProvider;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.panels.JPanelTable;
import javax.swing.ListCellRenderer;

/**
 *
 * @author adrianromero
 */
public class CustomersPanel extends JPanelTable {
    
    private TableDefinition tcustomers;
    private CustomersView jeditor;
    
    /** Creates a new instance of CustomersPanel */
    public CustomersPanel() {    
//        CustomerInfoGlobal.getInstance().setEditableData(bd);
    }
    
    /**
     *
     */
    @Override
    protected void init() {        
        DataLogicCustomers dlCustomers  = (DataLogicCustomers) app.getBean("com.openbravo.pos.customers.DataLogicCustomers");
        tcustomers = dlCustomers.getTableCustomers();        
        jeditor = new CustomersView(app, dirty);
//                System.out.println(tcustomers.getListSQL());
        
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
    
    /**
     *
     * @return
     */
    @Override
    public ListProvider getListProvider() {
        return new ListProviderCreator(tcustomers);
    }
    
    /**
     *
     * @return
     */
    @Override
    public SaveProvider getSaveProvider() {
        return new SaveProvider(tcustomers, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,            
            15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26});        
    }
    
    /**
     *
     * @return
     */
    @Override
    public Vectorer getVectorer() {
        return tcustomers.getVectorerBasic(new int[]{1, 2, 3, 4});
    }
    
    /**
     *
     * @return
     */
    @Override
    public ComparatorCreator getComparatorCreator() {
        return tcustomers.getComparatorCreator(new int[] {1, 2, 3, 4});
    }
    
    /**
     *
     * @return
     */
    @Override
    public ListCellRenderer getListCellRenderer() {
        return new ListCellRendererBasic(tcustomers.getRenderStringBasic(new int[]{3}));
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
        return AppLocal.getIntString("Menu.CustomersManagement");
    }    
}
