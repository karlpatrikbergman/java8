package se.patrikbergman.java.entities;

import org.junit.Test;

import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTreeTest {

    private final List<Apple> apples = AppleTree.harvest1();

    @Test
    public void foo() {
        apples.sort(comparing(Apple::getWeight).reversed());
        apples.stream()
                .forEach(System.out::println);
    }
}
