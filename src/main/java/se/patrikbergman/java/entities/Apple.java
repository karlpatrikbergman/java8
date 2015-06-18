package se.patrikbergman.java.entities;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class Apple extends Fruit {
    private String cultivar;

    @Builder
    public Apple(String cultivar, String color, double weight) {
        super(color, weight);
        this.cultivar = cultivar;
    }
}

