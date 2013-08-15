/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp.entitylib;

import java.util.Date;

/**
 *
 * @author hilman
 */
public class Client {
    private int idClient;
    private Date dateAdd;

    /**
     * @return the idClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * @return the dateAdd
     */
    public Date getDateAdd() {
        return dateAdd;
    }

    /**
     * @param dateAdd the dateAdd to set
     */
    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }
    
}
