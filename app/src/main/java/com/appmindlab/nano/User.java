package com.appmindlab.nano;

public class User {
    private Long id;
    private String name;
    private float score;

    public User(Long id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getScore() {return score; }

    public void updateScore(float score) {
        this.score = score;
    }
}
