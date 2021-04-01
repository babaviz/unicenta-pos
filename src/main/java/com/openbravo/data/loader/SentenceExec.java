
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public interface SentenceExec {
    
    /**
     *
     * @return
     * @throws BasicException
     */
    public int exec() throws BasicException;

    /**
     *
     * @param params
     * @return
     * @throws BasicException
     */
    public int exec(Object params) throws BasicException;

    /**
     *
     * @param params
     * @return
     * @throws BasicException
     */
    public int exec(Object... params) throws BasicException;
}
