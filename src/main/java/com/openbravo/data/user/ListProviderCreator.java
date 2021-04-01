
package com.openbravo.data.user;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.loader.TableDefinition;
import java.util.*;

/**
 *
 * @author JG uniCenta
 */
public class ListProviderCreator implements ListProvider {
    
    private SentenceList sent;
    private EditorCreator prov;
    private Object params;
    
    /** Creates a new instance of ListProviderEditor
     * @param sent
     * @param prov */
    public ListProviderCreator(SentenceList sent, EditorCreator prov) {
        this.sent = sent;
        this.prov = prov;
        params = null;
    }
    
    /**
     *
     * @param sent
     */
    public ListProviderCreator(SentenceList sent) {
        this(sent, null);
    }
    
    /**
     *
     * @param table
     */
    public ListProviderCreator(TableDefinition table) {        
        this(table.getListSentence(), null);
    }

    /**
     *
     * @return
     * @throws BasicException
     */
    @Override
    public List loadData() throws BasicException {       
        params = (prov == null) ? null : prov.createValue();
        return refreshData();
    }
    
    /**
     *
     * @return
     * @throws BasicException
     */
    @Override
    public List refreshData() throws BasicException {
        return sent.list(params);
    }    
}
