package com.Boiv.TaskManager.entities;

import javax.persistence.*;

@Entity
@Table(name = "TASK_MANAGER")
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String stroka;

    public Text(Long id, String stroka) {
        this.id = id;
        this.stroka = stroka;
    }

    public Text() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStroka() {
        return stroka;
    }

    public void setStroka(String stroka) {
        this.stroka = stroka;
    }

    @Override
    public String toString() {
        return  "Text{" +
                "id=" + id +
                ", stroka='" + stroka + '\'' +
                '}';
    }
}
