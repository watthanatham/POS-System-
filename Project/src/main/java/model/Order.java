/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 66945
 */
public class Order {
    private int Id;
    private int order_id;
    private String date;
    private String Usertype;
    private double total;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
     public int getOrder_id() {
        return order_id;
    }
     public void setOrder_id(int order_id){
         this.order_id = order_id;
     }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsertype() {
        return Usertype;
    }

    public void setUsertype(String Usertype) {
        this.Usertype = Usertype;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Order(int Id,int order_id ,String date, String Usertype, double total) {
        this.Id = Id;
        this.order_id = order_id;
        this.date = date;
        this.Usertype = Usertype;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id +",no_order=" + order_id +", date=" + date + ", Usertype=" + Usertype + ", total=" + total + '}';
    }
    
    
    
}
