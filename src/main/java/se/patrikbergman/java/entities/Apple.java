package se.patrikbergman.java.entities;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import se.patrikbergman.java.common.Color;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class Apple extends Fruit {
    private Cultivar cultivar;

    @Builder
    public Apple(Cultivar cultivar, Color color, double weight) {
        super(color, weight);
        this.cultivar = cultivar;
    }

    public enum Cultivar {
        AKANE("Akane"),
        BALDWIN("Baldwin"),
        CAMEO("Cameo");

        private final String name;

        public String getName() {
            return name;
        }

        Cultivar(final String name) {
            this.name = name;
        }
    }
}

