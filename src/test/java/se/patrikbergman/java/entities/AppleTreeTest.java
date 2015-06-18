package se.patrikbergman.java.entities;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTreeTest {


    @Rule
    public TestName name= new TestName();

    private List<Apple> apples;

    @Before
    public void setup() {
        apples = AppleTree.harvest1();
        System.out.format("%nExecuting method '%s':%n", name.getMethodName());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("");
    }

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
        System.out.format("Total weigh of apples is %s grams%n", sumWeight);
    }
}
