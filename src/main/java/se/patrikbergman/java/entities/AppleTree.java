package se.patrikbergman.java.entities;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.List;

public class AppleTree {

    public static List<Apple> harvest1() {
        return Arrays.asList(
                Apple.builder()
                        .species("Granny Smith")
                        .color("Red")
                        .weight(343.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Green")
                        .weight(454.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Yellow")
                        .weight(563.1)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Red and green")
                        .weight(443.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Green")
                        .weight(154.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Green and yellow")
                        .weight(763.3)
                        .build()

        );
    }

    public static ImmutableList<Apple> harvest() {
        return ImmutableList.of(
                Apple.builder()
                        .species("Granny Smith")
                        .color("Red")
                        .weight(343.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Green")
                        .weight(454.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Yellow")
                        .weight(563.1)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Red and green")
                        .weight(443.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Green")
                        .weight(154.6)
                        .build(),
                Apple.builder()
                        .species("Granny Smith")
                        .color("Green and yellow")
                        .weight(763.3)
                        .build()

        );
    }
}
