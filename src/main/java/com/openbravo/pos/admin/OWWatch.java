


import com.dalsemi.onewire.OneWireAccessProvider;
import com.dalsemi.onewire.adapter.DSPortAdapter;
import com.dalsemi.onewire.adapter.OneWireIOException;
import com.dalsemi.onewire.container.OneWireContainer;
import com.dalsemi.onewire.utils.*;
import com.dalsemi.onewire.application.monitor.*;


/**
 * Minimal demo to monitor a simple network.
 *
 * @version    0.00, 25 September 2000
 * @author     DS,BA,SH
 */
public class OWWatch
   implements DeviceMonitorEventListener
{

   /**
    * Method main
    *
    *
    * @param args
    *
    */
   public static void main (String args [])
   {
      OneWireContainer owd;
      int              delay;

      try
      {

         // get the default adapter
         DSPortAdapter adapter = OneWireAccessProvider.getDefaultAdapter();

         System.out.println();
         System.out.println("Adapter: " + adapter.getAdapterName()
                            + " Port: " + adapter.getPortName());
         System.out.println();

         // clear any previous search restrictions
         adapter.setSearchAllDevices();
         adapter.targetAllFamilies();
         adapter.setSpeed(adapter.SPEED_REGULAR);

         // create the watcher with this adapter
         OWWatch nw = new OWWatch(adapter);

         // sleep for the specified time
         if (args.length >= 1)
            delay = Integer.decode(args [0]).intValue();
         else
            delay = 20000;

         System.out.println("Monitor run for: " + delay + "ms");
         Thread.sleep(delay);

         // Kill any threads we have running.
         nw.killWatch();

         // free port used by adapter
         adapter.freePort();
      }
      catch (Exception e)
      {
         System.out.println(e);
      }

      return;
   }

   //--------
   //-------- Variables
   //--------

   /** Network Monitor instance */
   private DeviceMonitor dm;

   //--------
   //-------- Constructor
   //--------

   /**
    * Create a 1-Wire Network Watcher
    *
    * @param  adapter for 1-Wire Network to monitor
    */
   public OWWatch (DSPortAdapter adapter)
   {
      // create a network monitor
      dm = new DeviceMonitor(adapter);

      // add this to the event listers
      try
      {
         dm.addDeviceMonitorEventListener(this);
      }
      catch (Exception e){}

      // start the monitor
      Thread t = new Thread(dm);
      t.start();
   }

   /**
    *
    */
   public void killWatch()
   {
     // Kill the OneWireMonitor thread.
     dm.killMonitor();
   }

   /**
    * Arrival event as a NetworkMonitorEventListener
    *
    * @param owme DeviceMonitorEvent add
    */
   public void deviceArrival (DeviceMonitorEvent devt)
   {
      for(int i=0; i<devt.getDeviceCount(); i++)
         System.out.println("ADD: " + devt.getAddressAsStringAt(i));
   }

   /**
    * Depart event as a NetworkMonitorEventListener
    *
    * @param owme DeviceMonitorEvent depart
    */
   public void deviceDeparture (DeviceMonitorEvent devt)
   {
      for(int i=0; i<devt.getDeviceCount(); i++)
         System.out.println("REMOVE: " + devt.getAddressAsStringAt(i));
   }

   /**
    * Depart event as a NetworkMonitorEventListener
    *
    * @param owme DeviceMonitorException depart
    */
   public void networkException (DeviceMonitorException dexc)
   {
      System.out.println("ERROR: " + dexc.toString());
   }
}
