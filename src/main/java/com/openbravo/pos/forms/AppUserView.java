

package com.openbravo.pos.forms;

/**
 *
 * @author adrianromero
 */
public interface AppUserView {
    
    /**
     *
     */
    public static final String ACTION_TASKNAME = "taskname";
    
    // Acciones de la aplicacion

    /**
     *
     * @return
     */
        public AppUser getUser(); // Usuario logado

    /**
     *
     * @param sTaskClass
     */
    public void showTask(String sTaskClass);

    /**
     *
     * @param sTaskClass
     */
    public void executeTask(String sTaskClass);
}
