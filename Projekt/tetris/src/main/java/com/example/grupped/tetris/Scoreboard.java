package com.example.grupped.tetris;

public class Scoreboard {
    private final long id;
    private final String username;

    private final Number score;

    public Scoreboard(long id, String username, Number score) {
        this.id = id;
        this.username = username;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public  Number getScore() {
        return score;
    }
}
