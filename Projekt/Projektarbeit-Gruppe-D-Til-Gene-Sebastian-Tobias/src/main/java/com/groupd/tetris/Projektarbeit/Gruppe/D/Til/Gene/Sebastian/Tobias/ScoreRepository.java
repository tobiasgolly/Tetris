package com.groupd.tetris.Projektarbeit.Gruppe.D.Til.Gene.Sebastian.Tobias;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository
    extends CrudRepository<Score,
            Integer> {

        Score findById ( int id);
        List<Score> findAll ();

        void deleteById ( int id);
    }
