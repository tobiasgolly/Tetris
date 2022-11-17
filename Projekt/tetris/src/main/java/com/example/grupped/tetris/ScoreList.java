package com.example.grupped.tetris;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {

    private List<Score> scoreList;

    public List<Score> getScoreList()
    {

        if (scoreList == null) {

            scoreList
                    = new ArrayList<>();


        }

        return scoreList;


    }

    public void
    setScoreList(
            List<Score> scoreList)
    {
        this.scoreList
                = scoreList;
    }
}
