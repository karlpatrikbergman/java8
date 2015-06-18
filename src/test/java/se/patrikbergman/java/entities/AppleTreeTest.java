package se.patrikbergman.java.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTreeTest {

    private final List<Apple> apples = AppleTree.harvest1();

    @Before
    public void setup() {
        System.out.println();
    }

    @After
    public void tearDown() {
//        System.out.println();
    }

    @Test
    public void sortApplesByWeightReversed() {
        System.out.format("Sorting apples by weight...%n");
        apples.sort(comparing(Apple::getWeight).reversed());
        apples.stream()
                .forEach(System.out::println);
    }

    @Test
    public void sumWeighOfApples() {
        System.out.format("Calculating total weight of apples...%n");
        final Double sumWeight = apples.stream()
                .filter(apple -> apple instanceof Apple)
                .mapToDouble(Fruit::getWeight)
                .sum();
        System.out.format("Total weigh of apples is %s grams%n", sumWeight);
    }
}
