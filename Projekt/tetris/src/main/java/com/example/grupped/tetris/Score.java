package com.example.grupped.tetris;

import java.time.LocalDateTime;

@Entity
public class Score {

    public Score() {}

    public Score(
            LocalDateTime date, Integer id, String username, Integer score)
    {

        super();

        this.date = date;

        this.id = id;

        this.username = username;

        this.score = score;
    }

    private LocalDateTime date;
    private Integer id;
    private String username;
    private Integer score;

    @Override
    public String toString()
    {

        return "Score [date="
                + date + ", id="
                + id + ", username="
                + username + ", score="
                + score + "]";


    }

    public LocalDateTime getDate()
    {

        return date;
    }

    public void setDate(LocalDateTime date)
    {

        this.date = date;
    }

    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public String getUsername()
    {

        return username;
    }

    public void setUsername(
            String username)
    {

        this.username = username;
    }

    public Integer getScore()
    {

        return score;
    }

    public void setScore(Integer score)
    {

        this.score = score;
    }
}

