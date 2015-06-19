package se.patrikbergman.java.fruits;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import se.patrikbergman.java.common.Color;
import se.patrikbergman.java.fruit.AbstractFruit;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class Apple extends AbstractFruit {
    private Cultivar cultivar;

    @Builder
    public Apple(Cultivar cultivar, Color color, double weight) {
        super(color, weight);
        this.cultivar = cultivar;
    }

    @Override
    public String getName() {
        return cultivar.getName();
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

