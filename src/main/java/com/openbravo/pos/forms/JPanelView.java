

package com.openbravo.pos.forms;

import com.openbravo.basic.BasicException;
import javax.swing.JComponent;

/**
 *
 * @author adrianromero
 */
public interface JPanelView {
       
    /**
     *
     * @return
     */
    public abstract String getTitle();

    /**
     *
     * @throws BasicException
     */
    public abstract void activate() throws BasicException;

    /**
     *
     * @return
     */
    public abstract boolean deactivate();

    /**
     *
     * @return
     */
    public abstract JComponent getComponent();
}
