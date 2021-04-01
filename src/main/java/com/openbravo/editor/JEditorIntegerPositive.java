

package com.openbravo.editor;

import com.openbravo.format.Formats;

/**
 *
 * @author JG uniCenta
 */
public class JEditorIntegerPositive extends JEditorNumber {
    
    /** Creates a new instance of JEditorIntegerPositive */
    public JEditorIntegerPositive() {
    }
    
    /**
     *
     * @return
     */
    protected Formats getFormat() {
        return Formats.INT;
    }

    /**
     *
     * @return
     */
    protected int getMode() {
        return EditorKeys.MODE_INTEGER_POSITIVE;
    }      
}
