package se.patrikbergman.java.fruits;

import org.junit.*;
import org.junit.rules.TestName;
import se.patrikbergman.java.common.Color;
import se.patrikbergman.java.fruit.AbstractFruit;
import se.patrikbergman.java.trees.AppleTree;

import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTreeTest {


    @Rule
    public TestName name= new TestName();

    private final List<Apple> apples;
    private final AppleTree appleTree;

    public AppleTreeTest() {
        appleTree = AppleTree.builder().build();
        apples = appleTree.harvest();

    }

    @Before
    public void setup() {
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
        final Double sumWeightApples = apples.stream()
                .filter(apple -> apple instanceof Apple)
                .mapToDouble(AbstractFruit::getWeight)
                .sum();
        System.out.format("Total weigh of apples is %s grams%n", sumWeightApples);
    }

    @Test
    public void sumWeighOfRedApples() {
        final double sumWeighRedApples = apples.stream()
                .filter(apple -> apple.getColor().equals(Color.RED))
                .mapToDouble(Apple::getWeight)
                .sum();
        System.out.format("Total weigh of apples is %s grams%n", sumWeighRedApples );
    }

    @Test
    public void testAppleGetters() {
        final Apple apple = appleTree.pickFruit();
        System.out.println(apple.getCultivar());
        System.out.println(apple.getColor());
        System.out.println(apple.getWeight());
    }
}
