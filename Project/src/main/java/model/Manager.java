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
public class Manager {
    private int id;
    private String name;
    private String tel;
    private String type;
    private String timeAt;
    private String timeDe;
    private String date;

    public Manager(int id, String name, String tel, String type, String timeAt, String timeDe, String date) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.type = type;
        this.timeAt = timeAt;
        this.timeDe = timeDe;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Manager{" + "id=" + id + ", name=" + name + ", tel=" + tel + ", type=" + type + ", timeAt=" + timeAt + ", timeDe=" + timeDe + ", date=" + date + '}';
    }
    
}
