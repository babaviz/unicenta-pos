

package com.openbravo.data.user;

import com.openbravo.basic.BasicException;
import java.util.List;

/**
 *
 * @author JG uniCenta
 */
public interface ListProvider {

    /**
     *
     * @return
     * @throws BasicException
     */
    public List loadData() throws BasicException;    

    /**
     *
     * @return
     * @throws BasicException
     */
    public List refreshData() throws BasicException; 
}
