package se.patrikbergman.java.entities;

import org.junit.Test;

import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTreeTest {

    private final List<Apple> apples = AppleTree.harvest1();

    @Test
    public void sortApplesByWeightReversed() {
        apples.sort(comparing(Apple::getWeight).reversed());
        apples.stream()
                .forEach(System.out::println);
    }

    @Test
    public void sumWeighOfApples() {
        final Double sumWeight = apples.stream()
                .filter(apple -> apple instanceof Apple)
                .mapToDouble(Fruit::getWeight)
                .sum();
        System.out.format("Total weigh of apples is %s", sumWeight);
    }
}
