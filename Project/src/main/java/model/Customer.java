/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author saharudseerakoon
 */
public class Customer {
    private int no;
    private String id;
    private String name;
    private String tel;
    private Double point;
    private int Purshase;

    public Customer(int cno, String cid, String cname, String ctel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    public Customer(int newid, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }
    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public int getPurshase() {
        return Purshase;
    }

    public void setPurshase(int Purshase) {
        this.Purshase = Purshase;
    }

    public Customer(int no, String id, String name, String tel, Double point, int Purshase) {
        this.no = no;
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.point = point;
        this.Purshase = Purshase;
    }
    @Override
    public String toString() {
        return "Customer{" + "no=" + no + ", id=" + id + ", name=" + name + ", tel=" + tel + ", point=" + point + ", purshase=" + Purshase + '}';
    }

   
}
