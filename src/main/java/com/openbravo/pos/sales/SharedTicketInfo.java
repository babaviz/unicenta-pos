
package com.openbravo.pos.sales;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.data.loader.SerializableWrite;

public class SharedTicketInfo implements SerializableRead, SerializableWrite {
    
    private static final long serialVersionUID = 7640633837719L;
    private String id;
    private String name;
    private String UserName;
    private String status;    
/*
  * For     : RickyO - display Customer Name | Phone | PickupId
  * Change  : JG uniCenta
  * Date    : May 2017          
*/            
    private String phone;
    private String pickupid;
    
    /** Creates a new instance of SharedTicketInfo */
    public SharedTicketInfo() {
    }
    
    /**
     *
     * @param dr
     * @throws BasicException
     */
    @Override
    public void readValues(DataRead dr) throws BasicException {
        id = dr.getString(1);
        name = dr.getString(2);
        UserName = dr.getString(3);
        status = dr.getString(4);  
/*
  * For     : RickyO - display Customer Name | Phone | PickupId
  * Change  : JG uniCenta
  * Date    : May 2017          
*/            
        pickupid = dr.getString(5);        
        phone = dr.getString(6);

    }   

    /**
     *
     * @param dp
     * @throws BasicException
     */
    @Override
    public void writeValues(DataWrite dp) throws BasicException {
        dp.setString(1, id);
        dp.setString(2, name);
        dp.setString(3, UserName);
        dp.setString(4, status);        
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getAppUser() {
        return UserName;
    }
    
    public String getStatus() {
        return status;  
    }

/*
  * For     : RickyO - display Customer Name | Phone | PickupId
  * Change  : JG uniCenta
  * Date    : May 2017          
*/            
    public String getPhone() {
        return phone;
    }
/*
  * For     : RickyO - display Customer Name | Phone | PickupId
  * Change  : JG uniCenta
  * Date    : May 2017          
*/                
    public String getPickupId() {
        return pickupid;
    }
}
