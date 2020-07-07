package com.Boiv.TaskManager.entities;

import javax.persistence.*;

@Entity
@Table(name = "TASK_MANAGER")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "task")
    private String task;

    public Task() {
    }

    public Task(String task){
        this.task = task;
    }

    public Task(Long id, String task) {
        this.id = id;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
