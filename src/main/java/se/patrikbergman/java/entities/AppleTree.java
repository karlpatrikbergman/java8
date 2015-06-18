package se.patrikbergman.java.entities;

import se.patrikbergman.java.common.Color;

import java.util.Arrays;
import java.util.List;

public class AppleTree {

    public static List<Apple> harvest1() {
        return Arrays.asList(
                Apple.builder()
                        .cultivar(Apple.Cultivar.AKANE)
                        .color(Color.RED)
                        .weight(243.6)
                        .build(),
                Apple.builder()
                        .cultivar(Apple.Cultivar.CAMEO)
                        .color(Color.GREEN)
                        .weight(154.6)
                        .build(),
                Apple.builder()
                        .cultivar(Apple.Cultivar.CAMEO)
                        .color(Color.YELLOW)
                        .weight(93.1)
                        .build(),
                Apple.builder()
                        .cultivar(Apple.Cultivar.BALDWIN)
                        .color(Color.RED_GREEN)
                        .weight(143.6)
                        .build(),
                Apple.builder()
                        .cultivar(Apple.Cultivar.AKANE)
                        .color(Color.GREEN)
                        .weight(104.6)
                        .build(),
                Apple.builder()
                        .cultivar(Apple.Cultivar.BALDWIN)
                        .color(Color.GREEN_YELLOW)
                        .weight(83.3)
                        .build()

        );
    }

//    public static ImmutableList<Apple> harvest() {
//        return ImmutableList.of(
//                Apple.builder()
//                        .cultivar("Granny Smith")
//                        .color("Red")
//                        .weight(343.6)
//                        .build(),
//                Apple.builder()
//                        .cultivar("Granny Smith")
//                        .color("Green")
//                        .weight(454.6)
//                        .build(),
//                Apple.builder()
//                        .cultivar("Granny Smith")
//                        .color("Yellow")
//                        .weight(563.1)
//                        .build(),
//                Apple.builder()
//                        .cultivar("Granny Smith")
//                        .color("Red and green")
//                        .weight(443.6)
//                        .build(),
//                Apple.builder()
//                        .cultivar("Granny Smith")
//                        .color("Green")
//                        .weight(154.6)
//                        .build(),
//                Apple.builder()
//                        .cultivar("Granny Smith")
//                        .color("Green and yellow")
//                        .weight(763.3)
//                        .build()
//
//        );
//    }
}
