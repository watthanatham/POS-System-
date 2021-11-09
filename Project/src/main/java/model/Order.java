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
    private String no_order;
    private String date;
    private String Usertype;
    private double total;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
     public String getNo_order() {
        return no_order;
    }
     public void setNo_order(String no_order){
         this.no_order = no_order;
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

    public Order(int Id,String no_order ,String date, String Usertype, double total) {
        this.Id = Id;
        this.no_order = no_order;
        this.date = date;
        this.Usertype = Usertype;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id +",no_order=" + no_order +", date=" + date + ", Usertype=" + Usertype + ", total=" + total + '}';
    }
    
    
    
}
