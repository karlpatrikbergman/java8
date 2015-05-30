package se.patrikbergman.java.entities;


import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Apple {
    private String species;
    private String color;
    private Double weight;
}

