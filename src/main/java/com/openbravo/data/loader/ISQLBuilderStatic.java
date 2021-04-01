

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public interface ISQLBuilderStatic {
    
    /**
     *
     * @param sw
     * @param params
     * @return
     * @throws BasicException
     */
    public String getSQL(SerializerWrite sw, Object params) throws BasicException;     
}
