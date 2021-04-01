
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public interface SerializableWrite {
    
    /**
     *
     * @param dp
     * @throws BasicException
     */
    public void writeValues(DataWrite dp) throws BasicException;   
}
