/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sirip
 */
public class Employee {
    private int id;
    private String name;
    private String tel;
    private String type;
    private String timeAM;
    private String timePM;
    private String date;
    private String sale;

    public Employee(int id, String name, String tel, String type, String timeAM, String timePM, String date, String sale) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.type = type;
        this.timeAM = timeAM;
        this.timePM = timePM;
        this.date = date;
        this.sale = sale;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimeAM() {
        return timeAM;
    }

    public void setTimeAM(String timeAM) {
        this.timeAM = timeAM;
    }

    public String getTimePM() {
        return timePM;
    }

    public void setTimePM(String timePM) {
        this.timePM = timePM;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Employee{" + "id = " + id + ", name = " + name + ", tel = " + tel + ", type = " + type + ", timeAM = " + timeAM + ", timePM = " + timePM + ", date = " + date + ", sale = " + sale + '}';
    }
    
}
    