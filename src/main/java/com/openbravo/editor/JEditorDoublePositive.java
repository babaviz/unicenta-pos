

package com.openbravo.editor;

import com.openbravo.format.Formats;

/**
 *
 * @author JG uniCenta
 */
public class JEditorDoublePositive extends JEditorNumber {
    
    /** Creates a new instance of JEditorDoublePositive */
    public JEditorDoublePositive() {
    }
    
    /**
     *
     * @return
     */
    protected Formats getFormat() {
        return Formats.DOUBLE;
    }

    /**
     *
     * @return
     */
    protected int getMode() {
        return EditorKeys.MODE_DOUBLE_POSITIVE;
    }       
}
