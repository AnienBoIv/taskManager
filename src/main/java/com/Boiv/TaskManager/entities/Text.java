package com.Boiv.TaskManager.entities;

public class Text {

    private int id;
    private String stroka;

    public Text(int id, String stroka) {
        this.id = id;
        this.stroka = stroka;
    }

    public Text() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStroka() {
        return stroka;
    }

    public void setStroka(String stroka) {
        this.stroka = stroka;
    }
}
