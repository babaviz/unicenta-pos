
package com.openbravo.pos.printer.screen;

import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.printer.DeviceDisplay;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author  adrian
 */
public class DeviceDisplayWindow extends javax.swing.JFrame implements DeviceDisplay {
    
    private final String m_sName;
    private final DeviceDisplayPanel m_display;
    
    /** Creates new form DeviceDisplayWindow */
    public DeviceDisplayWindow() {
        initComponents();
        
        m_sName = AppLocal.getIntString("display.window");
        m_display = new DeviceDisplayPanel(3.0);
        
        m_jContainer.add(m_display.getDisplayComponent());
        try {
            this.setIconImage(ImageIO.read(DeviceDisplayWindow.class.getResourceAsStream("/com/openbravo/images/favicon.png")));                
        } catch (IOException e) {
        }       

        setVisible(true);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getDisplayName() {
        return m_sName;
    }    

    /**
     *
     * @return
     */
    @Override
    public String getDisplayDescription() {
        return null;
    }        

    /**
     *
     * @return
     */
    @Override
    public JComponent getDisplayComponent() {
        return null;
    }
    
    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(int animation, String sLine1, String sLine2) {
        m_display.writeVisor(animation, sLine1, sLine2);
    }

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(String sLine1, String sLine2) {
        m_display.writeVisor(sLine1, sLine2);
    }

    /**
     *
     */
    @Override
    public void clearVisor() {
        m_display.clearVisor();
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jContainer = new javax.swing.JPanel();

        setTitle(AppLocal.getIntString("display.window")); // NOI18N

        m_jContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        m_jContainer.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        m_jContainer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(m_jContainer, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(767, 245));
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel m_jContainer;
    // End of variables declaration//GEN-END:variables
    
}
