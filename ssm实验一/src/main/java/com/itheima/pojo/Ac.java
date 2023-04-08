package com.itheima.pojo;


// alt + 鼠标左键 整列编辑
public class Ac {

    private Integer id;
    private String name;
    private Integer hours;
    private Integer sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Integer gethours() {
        return hours;
    }

    public void sethours(Integer hours) { this.hours = hours ;}

    public Integer getsid() {
        return sid;
    }

    public void setsid(Integer sid) { this.sid = sid ; }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours='" + hours +
                ", sid='" + sid +
                '}';
    }
}
