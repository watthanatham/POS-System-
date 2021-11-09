/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author watan
 */
public class Receipt {
    private int id;
    private Date created;
    private User seller;
    private Customer customer;
    private ArrayList<ReceiptDetail> receiptDetail;

    public Receipt(int id, Date created, User seller, Customer customer) {
        this.id = id;
        this.created = created;
        this.seller = seller;
        this.customer = customer;
    }

    public Receipt(Date created, User seller, Customer customer) {
        this(-1, created, seller, customer);
    }
    
    
}
