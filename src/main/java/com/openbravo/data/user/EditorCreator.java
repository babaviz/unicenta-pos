
package com.openbravo.data.user;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public interface EditorCreator {

    /**
     *
     * @return
     * @throws BasicException
     */
    public Object createValue() throws BasicException;
}
