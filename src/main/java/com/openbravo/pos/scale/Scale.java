
package com.openbravo.pos.scale;

/**
 *
 * @author JG uniCenta
 */
public interface Scale {
    
    /**
     *
     * @return
     * @throws ScaleException
     */
    public Double readWeight() throws ScaleException;
}
