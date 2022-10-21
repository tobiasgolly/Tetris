package com.example.grupped.tetris;

public class Scoreboard {
    private final long id;
    private final String username;

    public Scoreboard(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
