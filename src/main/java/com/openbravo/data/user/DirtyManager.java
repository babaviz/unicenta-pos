
package com.openbravo.data.user;

import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.beans.*;

/**
 *
 * @author  adrian
 */
public class DirtyManager implements DocumentListener, ChangeListener, ActionListener, PropertyChangeListener {
    
    private boolean m_bDirty;    

    /**
     *
     */
    protected Vector listeners = new Vector();
    
    /** Creates a new instance of DirtyManager */
    public DirtyManager() {
        m_bDirty = false;
    }
    
    /**
     *
     * @param l
     */
    public void addDirtyListener(DirtyListener l) {
        listeners.add(l);
    }

    /**
     *
     * @param l
     */
    public void removeDirtyListener(DirtyListener l) {
        listeners.remove(l);
    }

    /**
     *
     */
    protected void fireChangedDirty() {
        
        Enumeration e = listeners.elements();
        while (e.hasMoreElements()) {
            DirtyListener l = (DirtyListener) e.nextElement();
            l.changedDirty(m_bDirty);
        }
    }
    
    /**
     *
     * @param bValue
     */
    public void setDirty(boolean bValue) {
        
        if (m_bDirty != bValue) {
            m_bDirty = bValue;
            fireChangedDirty();
        }
    }

    /**
     *
     * @return
     */
    public boolean isDirty() {
        return m_bDirty;
    }
    
    @Override
    public void changedUpdate(DocumentEvent e) {
        setDirty(true);
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        setDirty(true);
    }    
    @Override
    public void removeUpdate(DocumentEvent e) {
        setDirty(true);
    }    
    
    @Override
    public void stateChanged(ChangeEvent e) {
        setDirty(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setDirty(true);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //if ("image".equals(evt.getPropertyName())) {
            setDirty(true);
        //}
    }
    
}
