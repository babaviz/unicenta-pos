

package com.openbravo.pos.sales;

import java.awt.Component;

/**
 *
 * @author adrianromero
 */
public interface JProductAttEditI {

    /**
     *
     * @return
     */
    public String getAttribute();

    /**
     *
     * @return
     */
    public String getValue();

    /**
     *
     * @return
     */
    public Component getComponent();

    /**
     *
     */
    public void assignSelection();
}
