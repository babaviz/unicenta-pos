

package com.openbravo.pos.customers;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;

/**
 *
 * @author JG uniCenta
 */
public class CustomerRenderer extends DefaultListCellRenderer {
                
    private final Icon icocustomer;

    /** Creates a new instance of CustomerRenderer */
    public CustomerRenderer() {

        icocustomer = new ImageIcon(getClass().getClassLoader().getResource("com/openbravo/images/customer_sml.png"));
        
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, 
            int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);

        setIcon(icocustomer);
        setText(value.toString());
       
        return this;
    }      
}
