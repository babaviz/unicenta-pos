

package com.openbravo.pos.suppliers;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;

/**
 *
 * @author Jack Gerrard
 */
public class SupplierRenderer extends DefaultListCellRenderer {
                
    private Icon icosupplier;

    /** Creates a new instance of SupplierRenderer */
    public SupplierRenderer() {

        icosupplier = new ImageIcon(getClass().getClassLoader().getResource("com/openbravo/images/supplier_sml.png"));
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);
        setText(value.toString());
        setIcon(icosupplier);
        return this;
    }      
}
