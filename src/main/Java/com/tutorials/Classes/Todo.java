package com.tutorials.Classes;

import java.util.Date;
import java.util.Objects;

public class Todo {

    private int id;
    private String user;

    public Todo(){

    }
    public Todo(int id, String user, String desc, Date date,Boolean isdone){
        this.id=id;
        this.user = user;
        this.desc=desc;
        this.date=date;
        this.isDone=isdone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    private String desc;
    private Date date;
    private Boolean isDone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return getId() == todo.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", date=" + date +
                ", isDone=" + isDone +
                '}';
    }
}
