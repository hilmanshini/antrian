/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp.entitylib;

/**
 *
 * @author hilman
 */
public class ClientServiceCustomerOrder {
    private Client client;
    private CustomerOrderPending customerOrderPending;

    public ClientServiceCustomerOrder(Client client, CustomerOrderPending customerOrderPending) {
        this.client = client;
        this.customerOrderPending = customerOrderPending;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the customerOrderPending
     */
    public CustomerOrderPending getCustomerOrderPending() {
        return customerOrderPending;
    }

    /**
     * @param customerOrderPending the customerOrderPending to set
     */
    public void setCustomerOrderPending(CustomerOrderPending customerOrderPending) {
        this.customerOrderPending = customerOrderPending;
    }
    
}
