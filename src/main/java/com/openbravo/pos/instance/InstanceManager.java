

package com.openbravo.pos.instance;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author adrianromero
 */
public class InstanceManager {
    
    private final Registry m_registry;
    private final AppMessage m_message;
    
    /** Creates a new instance of InstanceManager
     * @param message
     * @throws java.rmi.RemoteException
     * @throws java.rmi.AlreadyBoundException */
    public InstanceManager(AppMessage message) throws RemoteException, AlreadyBoundException {

        m_registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

        m_message = message;

        AppMessage stub = (AppMessage) UnicastRemoteObject.exportObject(m_message, 0);
        m_registry.bind("AppMessage", stub); 

        // jLabel1.setText("Server ready");
    }    
}
