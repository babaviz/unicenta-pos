


package com.openbravo.pos.forms;

import com.openbravo.format.Formats;
import com.openbravo.pos.instance.InstanceQuery;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.openbravo.pos.ticket.TicketInfo;
import java.io.IOException;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSkin;


public class StartPOS {

    private static final Logger logger = Logger.getLogger("com.openbravo.pos.forms.StartPOS");

    private StartPOS() {
    }

    public static boolean registerApp() {

        InstanceQuery i = null;
        try {
            i = new InstanceQuery();
            i.getAppMessage().restoreWindow();
            return false;
        } catch (RemoteException | NotBoundException e) {
            return true;
        }
    }

    public static void main (final String[] args) {

        SwingUtilities.invokeLater (() -> {
            if (!registerApp()) {
                System.exit(1);
            }

            AppConfig config = new AppConfig(args);

            config.load();

            String slang = config.getProperty("user.language");
            String scountry = config.getProperty("user.country");
            String svariant = config.getProperty("user.variant");
            if (slang != null
                    && !slang.equals("")
                    && scountry != null
                    && svariant != null) {
                Locale.setDefault(new Locale(slang, scountry, svariant));
            }

            Formats.setIntegerPattern(config.getProperty("format.integer"));
            Formats.setDoublePattern(config.getProperty("format.double"));
            Formats.setCurrencyPattern(config.getProperty("format.currency"));
            Formats.setPercentPattern(config.getProperty("format.percent"));
            Formats.setDatePattern(config.getProperty("format.date"));
            Formats.setTimePattern(config.getProperty("format.time"));
            Formats.setDateTimePattern(config.getProperty("format.datetime"));

            // Set the look and feel.
            try {

                Object laf = Class.forName(config.getProperty("swing.defaultlaf")).newInstance();
                if (laf instanceof LookAndFeel){
                    UIManager.setLookAndFeel((LookAndFeel) laf);
                } else if (laf instanceof SubstanceSkin) {
                    SubstanceLookAndFeel.setSkin((SubstanceSkin) laf);
                }
                // JG 6 May 2013 to multicatch
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                logger.log(Level.WARNING, "Cannot set Look and Feel", e);
            }

        // JG July 2014 Hostname for Tickets
        String hostname = config.getProperty("machine.hostname");
        TicketInfo.setHostname(hostname);

        String screenmode = config.getProperty("machine.screenmode");

        if ("fullscreen".equals(screenmode)) {
            JRootKiosk rootkiosk = new JRootKiosk();
            try {
                rootkiosk.initFrame(config);
            } catch (IOException ex) {
                Logger.getLogger(StartPOS.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JRootFrame rootframe = new JRootFrame();
            try {
                rootframe.initFrame(config);
            } catch (Exception ex) {
                Logger.getLogger(StartPOS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
}
