package se.patrikbergman.java.entities;

import lombok.Value;
import lombok.experimental.NonFinal;
import se.patrikbergman.java.common.Color;

@Value
@NonFinal
class Fruit {
    Color color;
    double weight;
}
