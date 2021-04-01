

package com.openbravo.pos.customers;

import com.openbravo.pos.util.StringUtils;
import java.awt.image.BufferedImage;
import java.io.Serializable;

/** @author jack gerrard, adrianromero */

// JG 20 Sep 12 Extended for Postal
// JG 2 Sep 13 Extended for Phone + Email
public class CustomerInfo implements Serializable {
    
    private static final long serialVersionUID = 9083257536541L;

    protected String id;
    protected String searchkey;
    protected String taxid;
    protected String name;
    protected String postal;
    protected String phone;
    protected String email;
    protected BufferedImage image; 
    protected Double curdebt;     

    
    /** Creates a new instance of CustomerInfo
     * @param id */
    public CustomerInfo(String id) {
        this.id = id;
        this.searchkey = null;
        this.taxid = null;
        this.name = null;
        this.postal = null;
        this.phone = null;
        this.email = null;
        this.image = null;
        this.curdebt = null;
    }
    
    /**
     *
     * @return id string
     */
    public String getId() {
        return id;
    }
    
    /**
     *
     * @return searchkey string
     */
    public String getSearchkey() {
        return searchkey;
    }
    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
    
    /**
     *
     * @return taxid string
     */
    public String getTaxid() {
        return taxid;
    }    
    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }
    
    /**
     *
     * @return name string
     */
    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return postal/zip code string
     */
    public String getPcode() {
        return postal;
    }   
    public void setPcode(String postal) {
        this.postal = postal;
    }
    
    /**
     *
     * @return Primary Telephone string
     */
    public String getPhone1() {
        return phone;
    }
    public void setPhone1(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return email string
     */
    public String getCemail() {
        return email;
    }
    public void setCemail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String printName() {
        return StringUtils.encodeXML(name);
    }
    
    @Override
    public String toString() {
        return getName();        
    }
   
    /**
     *
     * @return customer's photograph / image
    */
    public BufferedImage getImage() {
        return image;
    }
    /**
     *
     * @param img
     */
    public void setImage(BufferedImage img) {
        image = img;
    }

    /**
     *
     * @return name double
     */
    public Double getCurDebt() {
        return curdebt;
    }   
    public void setCurDebt(Double curdebt) {
        this.curdebt = curdebt;
    }    
}