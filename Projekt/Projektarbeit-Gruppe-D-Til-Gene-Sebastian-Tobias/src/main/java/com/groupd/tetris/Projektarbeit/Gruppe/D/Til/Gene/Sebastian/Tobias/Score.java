package com.groupd.tetris.Projektarbeit.Gruppe.D.Til.Gene.Sebastian.Tobias;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class Score {

    // Primary ID which increments
    // automatically when new entry
    // is added into the database
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    int id;
    String username;
    int score;
    LocalDateTime date;


    public Score() {
    }

    // Parameterized constructor
    public Score(String username, int score,
                 LocalDateTime date) {
        this.username = username;
        this.score = score;
        this.date = date;
    }

    // Getters and setters of
    // the variables
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }
}
