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
 * @author 66945
 */
public class Order {
    private int id;
    private Date created;
//    private int order_id;
    private User seller;
    private Customer customer;
    private String date;
    private String Usertype;
    private double total;
    private ArrayList<DetailOrder> detailorder;
    
     public Order(int id,Date created,double total, User seller, Customer customer) {
        this.id = id;
        this.created = created;
        this.total = total;
        this.seller = seller;
        this.customer = customer;
        this.detailorder = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }
    public  void addDetailOrder(int id,Product product,int amount,double price){
        for (int row = 0; row <detailorder.size(); row++) {
            DetailOrder d = detailorder.get(row);
            if(d.getProduct().getId()== product.getId()){
                d.addAmount(amount); 
                return;
            }

        }
        detailorder.add(new DetailOrder(id,product,amount,price,this));
    }


    public  void addDetailOrder(Product product,int amount ){
        addDetailOrder(-1, product, amount,product.getPrice());
    }

    public void setTotal(double total){
        this.total = total;
    }
    //Override Method
    public  void addDetailOrder(int id,Product product){
        detailorder.add(new DetailOrder(id,product,product.getAmount(),product.getPrice(),this));
    }
    //Override Method
    public  void addDetailOrder(Product product){
        addDetailOrder(-1, product);
    }
//     public int getOrder_id() {
//        return order_id;
//    }
//     public void setOrder_id(int order_id){
//         this.order_id = order_id;
//     }

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
    public ArrayList<DetailOrder> getDetail() {
        return detailorder;
    }


    public Order(int Id,String date, String Usertype, double total) {
        this.id = Id;
        this.date = date;
        this.Usertype = Usertype;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + id  +", date=" + date + ", Usertype=" + Usertype + ", total=" + total + '}';
    }
    
    
    
}
