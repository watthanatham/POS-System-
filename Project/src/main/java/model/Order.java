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
    private int no_order;
    private String date;
    private String Usertype;
    private double total;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
     public int getNo_order() {
        return no_order;
    }
     public void setNo_order(int no_order){
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

<<<<<<< HEAD
    public Order(int Id,int no_order ,String date, String Usertype, double total) {
=======
    public Order(int Id,String no_order ,String date, String Usertype, double total) {
>>>>>>> 2c9ea2b4a3017eaf74e0b8665da251c66ee3a618
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
