
package com.openbravo.editor;

import com.openbravo.format.Formats;

/**
 *
 * @author JG uniCenta
 */
public class JEditorCurrency extends JEditorNumber {
    
	private static final long serialVersionUID = 5096754100573262803L;
	
	/** Creates a new instance of JEditorCurrency */
    public JEditorCurrency() {
    }
    
    /**
     *
     * @return
     */
    protected Formats getFormat() {
        return Formats.CURRENCY;
    }

    /**
     *
     * @return
     */
    protected int getMode() {
        return EditorKeys.MODE_DOUBLE;
    }  
}
