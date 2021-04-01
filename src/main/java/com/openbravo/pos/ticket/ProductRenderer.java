

package com.openbravo.pos.ticket;

import com.openbravo.format.Formats;
import com.openbravo.pos.util.ThumbNailBuilder;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author uniCenta 2017
 *
 */
public class ProductRenderer extends DefaultListCellRenderer {
                
    ThumbNailBuilder tnbprod;

    /** Creates a new instance of ProductRenderer */
    public ProductRenderer() {   
//        tnbprod = new ThumbNailBuilder(48,48, "com/openbravo/images/package.png");
        tnbprod = new ThumbNailBuilder(48,48, "com/openbravo/images/null.png");        
      
       
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);
        
        ProductInfoExt prod = (ProductInfoExt) value;
       
        if (prod != null) {
                        
            setText("<html><center>" 
                    + prod.getReference() 
                    + " - " 
                    + prod.getName() + " - " + Formats.CURRENCY.formatValue(prod.getPriceSell())
//                    + "<br>" + prod.getStockUnits() + " | " + Formats.DATE.formatValue(prod.getMemoDate()) + " | " + prod.getPriceSellTax(tax)
                    );
            
            Image img = tnbprod.getThumbNail(prod.getImage());
            setIcon(img == null ? null :new ImageIcon(img));
        }
        return this;
    }      
}
