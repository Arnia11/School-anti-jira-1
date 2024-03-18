package com.app.model;

public class Project {
    private long id;
    private String name;
    private String color;

    public Project(long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Project() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

