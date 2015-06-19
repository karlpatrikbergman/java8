package se.patrikbergman.java.fruit;

import lombok.Value;
import lombok.experimental.NonFinal;
import se.patrikbergman.java.common.Color;

@Value
@NonFinal
public abstract class AbstractFruit {
    Color color;
    double weight;

    public abstract String getName();
}
