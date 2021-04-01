
package com.openbravo.editor;

import com.openbravo.format.Formats;

/**
 *
 * @author JG uniCenta
 */
public class JEditorCurrencyPositive extends JEditorNumber {
    
    /** Creates a new instance of JEditorCurrencyPositive */
    public JEditorCurrencyPositive() {
    }
    
    /**
     *
     * @return
     */
    @Override
    protected Formats getFormat() {
        return Formats.CURRENCY;

    }

    /**
     *
     * @return
     */
    @Override
    protected int getMode() {
        return EditorKeys.MODE_DOUBLE_POSITIVE;
    }      
}
