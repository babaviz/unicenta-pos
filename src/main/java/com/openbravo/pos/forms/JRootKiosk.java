//    uniCenta oPOS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2018 uniCenta & previous Openbravo POS works
//    https://unicenta.com
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.forms;

import java.awt.*;
import java.awt.event.*;
import com.openbravo.pos.config.JFrmConfig;
import com.openbravo.pos.instance.AppMessage;
import com.openbravo.pos.instance.InstanceManager;
import com.openbravo.pos.util.OSValidator;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import javax.swing.JFrame;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author  adrianromero
 */
public class JRootKiosk extends javax.swing.JFrame implements AppMessage {

    private InstanceManager m_instmanager = null;

    private JRootApp m_rootapp;
    private AppProperties m_props;
    private OSValidator m_OS;

    /** Creates new form JRootKiosk */
    public JRootKiosk() {

        setUndecorated(true);
        setResizable(false);

        initComponents();
    }

    /**
     *
     * @param props
     * @throws java.io.IOException
     */
    public void initFrame(AppProperties props) throws IOException {

        m_OS = new OSValidator();
        m_props = props;

        m_rootapp = new JRootApp();

        if (m_rootapp.initApp(m_props)) {

            if ("true".equals(props.getProperty("machine.uniqueinstance"))) {
                try {
                    m_instmanager = new InstanceManager(this);
                } catch (RemoteException | AlreadyBoundException e) {
                }
            }

            add(m_rootapp, BorderLayout.CENTER);

            setTitle(AppLocal.APP_NAME + " - " + AppLocal.APP_VERSION);

            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setBounds(0, 0, d.width, d.height);

/*
 *  4 Sep 17 JG
 *  2 Dec 17 - Mod' Thanks Hayk Sokolov!
 *  Change here for Linux/Ubuntu full screen
 *  Thanks to Hans Lengerke for solution
*/
            String osName = System.getProperty("os.name").toLowerCase();
            boolean isWindows = osName.startsWith("windows");

            GraphicsDevice device = GraphicsEnvironment
            .getLocalGraphicsEnvironment().getDefaultScreenDevice();

            if (device.isFullScreenSupported() && !isWindows) {
                setResizable(true);

                addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent arg0) {
                    setAlwaysOnTop(true);
                }
                @Override
                public void focusLost(FocusEvent arg0) {
                    setAlwaysOnTop(false);
                }
            });
                device.setFullScreenWindow(this);
            } else {
                setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                AppLocal.getIntString("message.databasechange"),
                "Connection", JOptionPane.INFORMATION_MESSAGE);

            new JFrmConfig(props).setVisible(true);                             // Show the configuration window.
        }
    }

    @Override
    public void restoreWindow() throws RemoteException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (getExtendedState() == JFrame.ICONIFIED) {
                    setExtendedState(JFrame.NORMAL);
                }
                requestFocus();
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                formWindowClosed(e);
            }
            @Override
            public void windowClosing(WindowEvent e) {
                formWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        m_rootapp.tryToClose();

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        m_rootapp.releaseResources();
        System.exit(0);

    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    // End of variables declaration//GEN-END:variables

}
