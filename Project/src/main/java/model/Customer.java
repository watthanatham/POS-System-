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
    private int id;
    private String name;
    private String tel;
    private Double point;
    private int Purshase;

    public Customer(String cid, String cname, String ctel) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Customer(int id, String name, String tel, Double point, int Purshase) {

        this.id = id;
        this.name = name;
        this.tel = tel;
        this.point = point;
        this.Purshase = Purshase;
    }
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", tel=" + tel + ", point=" + point + ", purshase=" + Purshase + '}';
    }


}