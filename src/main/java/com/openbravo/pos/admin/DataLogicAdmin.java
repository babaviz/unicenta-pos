
package com.openbravo.pos.admin;

import com.openbravo.data.loader.*;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.BeanFactoryDataSingle;

/**
 *
 * @author adrianromero
 */
public class DataLogicAdmin extends BeanFactoryDataSingle {
    
    private Session s;
    private TableDefinition m_tpeople;
    private TableDefinition m_troles;
    private TableDefinition m_tresources;    
    
    
    /** Creates a new instance of DataLogicAdmin */
    public DataLogicAdmin() {
    }
    
    /**
     *
     * @param s
     */
    @Override
    public void init(Session s){
        this.s = s;
        
        m_tpeople = new TableDefinition(s,
            "people"
            , new String[] {"ID", "NAME", "APPPASSWORD", "ROLE", "VISIBLE", "CARD", "IMAGE"}
            , new String[] {"ID", AppLocal.getIntString("label.peoplename"), AppLocal.getIntString("label.Password"), AppLocal.getIntString("label.role"), AppLocal.getIntString("label.peoplevisible"), AppLocal.getIntString("label.card"), AppLocal.getIntString("label.peopleimage")}
            , new Datas[] {Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.BOOLEAN, Datas.STRING, Datas.IMAGE}
            , new Formats[] {Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING, Formats.BOOLEAN, Formats.STRING, Formats.NULL}
            , new int[] {0}
        );   
                        
        m_troles = new TableDefinition(s,
            "roles"
            , new String[] {"ID", "NAME", "PERMISSIONS"}
            , new String[] {"ID", AppLocal.getIntString("label.name"), "PERMISSIONS"}
            , new Datas[] {Datas.STRING, Datas.STRING, Datas.BYTES}
            , new Formats[] {Formats.STRING, Formats.STRING, Formats.NULL}
            , new int[] {0}
        );  
        
        m_tresources = new TableDefinition(s,
            "resources"
            , new String[] {
                "ID", "NAME", "RESTYPE", "CONTENT"}
            , new String[] {
                "ID", 
                AppLocal.getIntString("label.name"), 
                AppLocal.getIntString("label.type"), 
                "CONTENT"}
            , new Datas[] {
                Datas.STRING, Datas.STRING, Datas.INT, Datas.BYTES}
            , new Formats[] {
                Formats.STRING, Formats.STRING, Formats.INT, Formats.NULL}
            , new int[] {0}
        );           
    }
       
    /**
     *
     * @return
     */
    public final SentenceList getRolesList() {
        return new StaticSentence(s
            , "SELECT ID, NAME FROM roles ORDER BY NAME"
            , null
            , new SerializerReadClass(RoleInfo.class));
    }

    /**
     *
     * @return
     */
    public final TableDefinition getTablePeople() {
        return m_tpeople;
    }    

    /**
     *
     * @return
     */
    public final TableDefinition getTableRoles() {
        return m_troles;
    }

    /**
     *
     * @return
     */
    public final TableDefinition getTableResources() {
        return m_tresources;
    }
    
    /**
     *
     * @return
     */
    public final SentenceList getPeopleList() {
        return new StaticSentence(s
                , "SELECT ID, NAME FROM people ORDER BY NAME"
                , null
                , new SerializerReadClass(PeopleInfo.class));
    }
}
