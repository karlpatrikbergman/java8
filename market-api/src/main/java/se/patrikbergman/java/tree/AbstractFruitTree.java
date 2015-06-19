package se.patrikbergman.java.tree;

import lombok.Value;
import lombok.experimental.NonFinal;
import se.patrikbergman.java.fruit.AbstractFruit;

import java.util.List;

@Value
@NonFinal
public abstract class AbstractFruitTree {
    Species species;
    int age;

    public abstract List<? extends AbstractFruit> harvest();

    public abstract AbstractFruit pickFruit();

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
