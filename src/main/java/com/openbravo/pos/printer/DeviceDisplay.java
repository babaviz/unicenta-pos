

package com.openbravo.pos.printer;

import javax.swing.JComponent;

/**
 *
 * @author JG uniCenta
 */
public interface DeviceDisplay {

    // INTERFAZ DESCRIPCION

    /**
     *
     * @return
     */
        public String getDisplayName();

    /**
     *
     * @return
     */
    public String getDisplayDescription();

    /**
     *
     * @return
     */
    public JComponent getDisplayComponent();
    
    // INTERFAZ VISOR

    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
        public void writeVisor(int animation, String sLine1, String sLine2);

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    public void writeVisor(String sLine1, String sLine2);

    /**
     *
     */
    public void clearVisor();
}
