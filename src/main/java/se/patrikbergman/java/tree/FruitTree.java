package se.patrikbergman.java.tree;

import se.patrikbergman.java.fruit.Fruit;

import java.util.List;

public interface FruitTree {
    List<? extends Fruit> harvest();
}
