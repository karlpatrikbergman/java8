package se.patrikbergman.java.entities;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

public class AppTest {

    private final ImmutableList<Apple> apples = ImmutableList.of(
            Apple.builder()
                    .species("Granny Smith")
                    .color("Red")
                    .weight(343.6)
                    .build(),
            Apple.builder()
                    .species("Granny Smith")
                    .color("Green")
                    .weight(454.6)
                    .build()

    );


    @Test
    public void foo() {
        apples.stream()
                .forEach(System.out::println);

    }
}
