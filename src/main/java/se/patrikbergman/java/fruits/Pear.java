package se.patrikbergman.java.fruits;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import se.patrikbergman.java.common.Color;
import se.patrikbergman.java.fruit.AbstractFruit;
import se.patrikbergman.java.fruit.Fruit;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class Pear extends AbstractFruit implements Fruit {
    private Cultivar cultivar;

    @Builder
    public Pear(Cultivar cultivar, Color color, double weight) {
        super(color, weight);
        this.cultivar = cultivar;
    }

    @Override
    public String getName() {
        return cultivar.getName();
    }

    public enum Cultivar {
        ABATE_FETEL("Abate Fetel"),
        BON_ROUGE("Bon Rouge"),
        CATILAC("Catillac");

        private final String name;

        public String getName() {
            return name;
        }

        Cultivar(final String name) {
            this.name = name;
        }
    }
}
