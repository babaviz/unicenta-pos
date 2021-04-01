
package com.openbravo.editor;

import com.openbravo.format.Formats;

/**
 *
 * @author JG uniCenta
 */
public class JEditorDouble extends JEditorNumber {
    
    /** Creates a new instance of JEditorDouble */
    public JEditorDouble() {
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
        return EditorKeys.MODE_DOUBLE;
    }      
}
