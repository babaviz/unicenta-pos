

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public interface SentenceFind {
    
    /**
     *
     * @return
     * @throws BasicException
     */
    public Object find() throws BasicException;

    /**
     *
     * @param params
     * @return
     * @throws BasicException
     */
    public Object find(Object params) throws BasicException;

    /**
     *
     * @param params
     * @return
     * @throws BasicException
     */
    public Object find(Object... params) throws BasicException;
}
