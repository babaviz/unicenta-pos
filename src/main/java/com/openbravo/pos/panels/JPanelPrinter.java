

package com.openbravo.pos.panels;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.JPanelView;
import com.openbravo.pos.printer.DeviceFiscalPrinter;
import com.openbravo.pos.printer.DevicePrinter;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author adrianromero
 */
public class JPanelPrinter extends JPanel implements JPanelView {

    /** Creates new form JPrinter
     * @param oApp */
    public JPanelPrinter(AppView oApp) {
       
        initComponents();

        
        if (oApp.getDeviceTicket().getDeviceDisplay().getDisplayComponent() != null) {
            m_jDisplay.add(oApp.getDeviceTicket().getDeviceDisplay().getDisplayComponent());
        }     
        
        List<DevicePrinter> aprinters = oApp.getDeviceTicket().getDevicePrinterAll();
        for (DevicePrinter printer : aprinters) {
            if (printer.getPrinterComponent() != null) {
                m_jPrinters.add(printer.getPrinterName(), printer.getPrinterComponent());
            }
        }
        
        DeviceFiscalPrinter fp = oApp.getDeviceTicket().getFiscalPrinter();
        if (fp.getFiscalComponent() != null) {
            m_jPrinters.add(fp.getFiscalName(), fp.getFiscalComponent());
        }
    }

    /**
     *
     * @return
     */
    @Override
    public JComponent getComponent() {
        return this;
    }

    /**
     *
     * @return
     */
    @Override
    public String getTitle() {
        return AppLocal.getIntString("Menu.Printer");
    }        

    /**
     *
     * @throws BasicException
     */
    @Override
    public void activate() throws BasicException {
    }

    /**
     *
     * @return
     */
    @Override
    public boolean deactivate() {
        return true;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jDisplay = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        m_jPrinters = new javax.swing.JTabbedPane();

        setLayout(new java.awt.BorderLayout());
        add(m_jDisplay, java.awt.BorderLayout.NORTH);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.setLayout(new java.awt.BorderLayout());

        m_jPrinters.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(m_jPrinters, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel m_jDisplay;
    private javax.swing.JTabbedPane m_jPrinters;
    // End of variables declaration//GEN-END:variables
    
}
