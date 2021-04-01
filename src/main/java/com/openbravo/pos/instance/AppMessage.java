

package com.openbravo.pos.instance;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author adrianromero
 */
public interface AppMessage extends Remote {
    
    /**
     *
     * @throws RemoteException
     */
    public void restoreWindow() throws RemoteException;    
}
