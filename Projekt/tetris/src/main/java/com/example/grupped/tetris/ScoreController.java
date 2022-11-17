package com.example.grupped.tetris;

import java.net.URI;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind
        .annotation.GetMapping;
import org.springframework.web.bind
        .annotation.PostMapping;
import org.springframework.web.bind
        .annotation.RequestBody;
import org.springframework.web.bind
        .annotation.RequestMapping;
import org.springframework.web.bind
        .annotation.RestController;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;

import com.example.grupped.tetris.Score;

// Creating the REST controller
@RestController
@RequestMapping(path = "/users")
public class ScoreController {

    @Autowired
    private UserDAO userDao;

    @GetMapping(
            path = "/",
            produces = "application/json")

    public ScoreList getScoreList()
    {

        return userDao
                .getAllScores();
    }

    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addScore(
            @RequestBody Score score)
    {

        Integer id
                = userDao
                .getAllScores()
                .getScoreList()
                .size()
                + 1;

        score.setId(id);

        userDao
                .addScore(score);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        score.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}

