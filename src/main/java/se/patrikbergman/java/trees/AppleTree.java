package se.patrikbergman.java.trees;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import se.patrikbergman.java.common.Color;
import se.patrikbergman.java.fruits.Apple;
import se.patrikbergman.java.tree.AbstractFruitTree;
import se.patrikbergman.java.tree.FruitTree;

import java.util.Arrays;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class AppleTree extends AbstractFruitTree implements FruitTree {

    @Builder
    public AppleTree(Species species, int age) {
        super(species, age);
    }

    @Override
    public List<Apple> harvest() {
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
}
