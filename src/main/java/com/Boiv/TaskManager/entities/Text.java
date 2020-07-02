package com.Boiv.TaskManager.entities;

import javax.persistence.*;

@Entity
@Table(name = "TASK_MANAGER")
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text_task")
    private String text_task;

    public Text() {
    }

    public Text(String text_task){
        this.text_task = text_task;
    }

    public Text(Long id, String text_task) {
        this.id = id;
        this.text_task = text_task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText_task() {
        return text_task;
    }

    public void setText_task(String text_task) {
        this.text_task = text_task;
    }

}
