package com.example.springbootexceptionhandling.bird;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootexceptionhandling.EntityNotFoundException;

@Service
public class BirdService {

    @Autowired
    private BirdRepository birdRepository;

    public Bird getBirdNoException(Long birdId) throws EntityNotFoundException {
        return birdRepository.findOne(birdId);
    }

    public Bird getBird(Long birdId) throws EntityNotFoundException {
        Bird bird = birdRepository.findOne(birdId);
        if (bird == null) {
            throw new EntityNotFoundException(Bird.class, "id", birdId.toString());
        }
        return bird;
    }

    public Bird createBird(Bird bird) {
        return birdRepository.save(bird);
    }

    public List<Bird> getBirdCollection(BirdCollection birdCollection) throws EntityNotFoundException {
        List<Bird> birds = new ArrayList<>();

        for (Long birdId : birdCollection.getBirdsIds()) {
            Bird bird = birdRepository.findOne(birdId);
            if (bird == null) {
                throw new EntityNotFoundException(Bird.class, "id", birdId.toString());
            }
            birds.add(bird);
        }
        return birds;
    }
}
