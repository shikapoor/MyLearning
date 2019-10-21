package com.example.springbootexceptionhandling.bird;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BirdCollection {

    @NotNull
    @Size(min = 2)
    private List<Long> birdsIds;

    public List<Long> getBirdsIds() {
        return birdsIds;
    }

    public void setBirdsIds(List<Long> birds) {
        this.birdsIds = birds;
    }
}
