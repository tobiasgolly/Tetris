package com.example.grupped.tetris;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ScoreboardController {
    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();
    private static final Number number = 0;

    @GetMapping("/scoreboard")
    public Scoreboard scoreboard(@RequestParam(value = "username", defaultValue = "Til") String name) {
        return new Scoreboard(counter.incrementAndGet(), String.format(template,name), number.intValue());
    }
}
