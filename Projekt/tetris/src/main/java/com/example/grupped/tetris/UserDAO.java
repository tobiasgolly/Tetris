package com.example.grupped.tetris;

import org.springframework
        .stereotype
        .Repository;
import com.example.grupped.tetris.ScoreList;

import java.time.LocalDateTime;

@Repository

public class UserDAO {

    private static ScoreList list
            = new ScoreList();

    static
    {

        list.getScoreList().add(
                new Score(
                        LocalDateTime.now(),
                        1,
                        "Til",
                        2300));

        list.getScoreList().add(
                new Score(
                        LocalDateTime.now(),
                        2,
                        "Tobi",
                        2400));

        list.getScoreList().add(
                new Score(
                        LocalDateTime.now(),
                        3,
                        "Gene",
                        23));


    }

    public ScoreList getAllScores()
    {

        return list;
    }


    public void
    addScore(Score score)
    {
        list.getScoreList()
                .add(score);

    }
}
