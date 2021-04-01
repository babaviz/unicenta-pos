

package com.openbravo.data.user;

import java.awt.Component;

/**
 *
 * @author JG uniCenta
 */
public interface EditorRecord extends EditorCreator {
       
    /**
     *
     */
    public void writeValueEOF();

    /**
     *
     */
    public void writeValueInsert(); 

    /**
     *
     * @param value
     */
    public void writeValueEdit(Object value); // not null por definicion.

    /**
     *
     * @param value
     */
    public void writeValueDelete(Object value); // not null por definicion.
    
    /**
     *
     */
    public void refresh();
    
    /**
     *
     * @return
     */
    public Component getComponent(); 
}
