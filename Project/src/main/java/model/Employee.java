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
    private String timeAt;
    private String timeDe;
    private String dateAt;
    private String salePerDay;

    public Employee(int id, String name, String tel, String type, String timeAt, String timeDe, String dateAt, String salePerDay) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.type = type;
        this.timeAt = timeAt;
        this.timeDe = timeDe;
        this.dateAt = dateAt;
        this.salePerDay = salePerDay;
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

    public String getTimeAt() {
        return timeAt;
    }

    public void setTimeAt(String timeAt) {
        this.timeAt = timeAt;
    }

    public String getTimeDe() {
        return timeDe;
    }

    public void setTimeDe(String timeDe) {
        this.timeDe = timeDe;
    }

    public String getDateAt() {
        return dateAt;
    }

    public void setDateAt(String dateAt) {
        this.dateAt = dateAt;
    }

    public String getSalePerDay() {
        return salePerDay;
    }

    public void setSalePerDay(String salePerDay) {
        this.salePerDay = salePerDay;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", tel=" + tel + ", type=" + type + ", timeAt=" + timeAt + ", timeDe=" + timeDe + ", dateAt=" + dateAt + ", salePerDay=" + salePerDay + '}';
    }
    
    
}
