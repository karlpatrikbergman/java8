package se.patrikbergman.java.entities;

import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
class Fruit {
    String color;
    double weight;
}
