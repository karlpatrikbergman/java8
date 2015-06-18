package se.patrikbergman.java.entities;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import se.patrikbergman.java.common.Color;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class Pear extends Fruit {
    private Cultivar cultivar;

    @Builder
    public Pear(Cultivar cultivar, Color color, double weight) {
        super(color, weight);
        this.cultivar = cultivar;
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
