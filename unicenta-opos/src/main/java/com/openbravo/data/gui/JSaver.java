//    KrOS POS  - Open Source Point Of Sale
//    Copyright (c) 2009-2018 uniCenta & previous Openbravo POS works
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.data.gui;

import java.util.*;
import javax.swing.*;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.LocalRes;
import com.openbravo.data.user.BrowsableEditableData;
import com.openbravo.data.user.StateListener;

/**
 *
 * @author JG uniCenta
 */
public class JSaver extends JPanel implements StateListener {
    
    /**
     *
     */
    protected BrowsableEditableData m_bd;
        
    /** Creates new form JSaver
     * @param bd */
    public JSaver(BrowsableEditableData bd) {

        initComponents();
        
        m_bd = bd;
        
        // m_bd.addBrowseListener(this);
        m_bd.addStateListener(this);
    }

    /**
     *
     * @param iState
     */
    @Override
    public void updateState(int iState) {
        switch  (iState) {
        case BrowsableEditableData.ST_INSERT:
            jbtnNew.setEnabled(m_bd.canInsertData());
            jbtnDelete.setEnabled(false);
            jbtnSave.setEnabled(m_bd.canInsertData());
            break;
        case BrowsableEditableData.ST_DELETE:
            jbtnNew.setEnabled(m_bd.canInsertData());
            jbtnDelete.setEnabled(false);
            jbtnSave.setEnabled(m_bd.canDeleteData());
            break;
        case BrowsableEditableData.ST_NORECORD:
            jbtnNew.setEnabled(m_bd.canInsertData());
            jbtnDelete.setEnabled(false);
            jbtnSave.setEnabled(false);
            break;
        case BrowsableEditableData.ST_UPDATE:
            jbtnNew.setEnabled(m_bd.canInsertData());
            jbtnDelete.setEnabled(m_bd.canDeleteData());
            jbtnSave.setEnabled(m_bd.canUpdateData());
            break;
        }
   }   
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnNew = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();

        jbtnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/editnew.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pos_messages"); // NOI18N
        jbtnNew.setToolTipText(bundle.getString("tooltip.addnew")); // NOI18N
        jbtnNew.setFocusPainted(false);
        jbtnNew.setFocusable(false);
        jbtnNew.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jbtnNew.setPreferredSize(new java.awt.Dimension(60, 45));
        jbtnNew.setRequestFocusEnabled(false);
        jbtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewActionPerformed(evt);
            }
        });

        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/sale_delete.png"))); // NOI18N
        jbtnDelete.setToolTipText(bundle.getString("tooltip.delete")); // NOI18N
        jbtnDelete.setFocusPainted(false);
        jbtnDelete.setFocusable(false);
        jbtnDelete.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jbtnDelete.setPreferredSize(new java.awt.Dimension(60, 45));
        jbtnDelete.setRequestFocusEnabled(false);
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/filesave.png"))); // NOI18N
        jbtnSave.setToolTipText(bundle.getString("tooltip.save")); // NOI18N
        jbtnSave.setFocusPainted(false);
        jbtnSave.setFocusable(false);
        jbtnSave.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jbtnSave.setPreferredSize(new java.awt.Dimension(60, 45));
        jbtnSave.setRequestFocusEnabled(false);
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        try {
            m_bd.saveData();
          
        } catch (BasicException eD) {
            MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, LocalRes.getIntString("message.nosave"), eD);
            msg.show(this);
        }          
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        try {
            m_bd.actionDelete();
        } catch (BasicException eD) {
            MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, LocalRes.getIntString("message.nodelete"), eD);
            msg.show(this);
        }        
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewActionPerformed
        try {
            m_bd.actionInsert();
        } catch (BasicException eD) {
            MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, LocalRes.getIntString("message.nonew"), eD);
            msg.show(this);
        }
    }//GEN-LAST:event_jbtnNewActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnNew;
    private javax.swing.JButton jbtnSave;
    // End of variables declaration//GEN-END:variables
    
}
