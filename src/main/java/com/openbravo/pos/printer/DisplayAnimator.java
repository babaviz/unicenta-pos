
package com.openbravo.pos.printer;

/**
 *
 * @author adrianromero
 */
public interface DisplayAnimator {
    
    /**
     *
     * @param i
     */
    public void setTiming(int i);

    /**
     *
     * @return
     */
    public String getLine1();

    /**
     *
     * @return
     */
    public String getLine2();
}
