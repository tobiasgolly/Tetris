package com.groupd.tetris.Projektarbeit.Gruppe.D.Til.Gene.Sebastian.Tobias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ScoreController {
    @Autowired
    private ScoreRepository repo;

    // Home Page
    @GetMapping("/")
    public String welcome()
    {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    // Get All Notes
    @GetMapping("/scoreboard")
    public List<Score> getAllNotes()
    {
        return repo.findAll();
    }

    // Get the company details by
    // ID
    @GetMapping("/scoreboard/{id}")
    public Score getScoreById(
            @PathVariable(value = "id") int id)
    {
        return repo.findById(id);
    }

    @PostMapping("/scoreboard")
    @ResponseStatus(HttpStatus.CREATED)
    public Score addScore(
            @RequestBody Score score)
    {
        return repo.save(score);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteScore(
            @PathVariable(value = "id") int id)
    {
        repo.deleteById(id);
    }

    @PutMapping("/scoreboard/{id}")
    public ResponseEntity<Object> updateScore(
            @RequestBody Score score,
            @PathVariable int id)
    {

        Optional<Score> scoreRepo
                = Optional.ofNullable(
                repo.findById(id));

        if (!scoreRepo.isPresent())
            return ResponseEntity
                    .notFound()
                    .build();

        score.setId(id);

        repo.save(score);

        return ResponseEntity
                .noContent()
                .build();
    }
}
