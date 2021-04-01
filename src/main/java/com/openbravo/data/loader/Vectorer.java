
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public interface Vectorer {
    
    // public int size();

    /**
     *
     * @return
     * @throws BasicException
     */
        public String[] getHeaders() throws BasicException;

    /**
     *
     * @param obj
     * @return
     * @throws BasicException
     */
    public String[] getValues(Object obj) throws BasicException;
}
