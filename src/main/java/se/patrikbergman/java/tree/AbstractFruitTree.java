package se.patrikbergman.java.tree;

import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public abstract class AbstractFruitTree {
    Species species;
    int age;

    public enum Species {
        APPLE("Apple"),
        PEAR("Pear");

        private final String name;

        public String getName() {
            return name;
        }

        Species(final String name) {
            this.name = name;
        }
    }
}
