package se.patrikbergman.java.entities;

import se.patrikbergman.java.common.Color;

import java.util.Arrays;
import java.util.List;

public class PearTree {

    public static List<Pear> harvest1() {
        return Arrays.asList(
                Pear.builder()
                        .cultivar(Pear.Cultivar.ABATE_FETEL)
                        .color(Color.RED)
                        .weight(243.6)
                        .build(),
                Pear.builder()
                        .cultivar(Pear.Cultivar.CATILAC)
                        .color(Color.GREEN)
                        .weight(154.6)
                        .build(),
                Pear.builder()
                        .cultivar(Pear.Cultivar.CATILAC)
                        .color(Color.YELLOW)
                        .weight(93.1)
                        .build(),
                Pear.builder()
                        .cultivar(Pear.Cultivar.BON_ROUGE)
                        .color(Color.RED_GREEN)
                        .weight(143.6)
                        .build(),
                Pear.builder()
                        .cultivar(Pear.Cultivar.ABATE_FETEL)
                        .color(Color.GREEN)
                        .weight(104.6)
                        .build(),
                Pear.builder()
                        .cultivar(Pear.Cultivar.BON_ROUGE)
                        .color(Color.GREEN_YELLOW)
                        .weight(83.3)
                        .build()

        );
    }
}

