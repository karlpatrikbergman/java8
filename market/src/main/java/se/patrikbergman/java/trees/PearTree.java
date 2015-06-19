package se.patrikbergman.java.trees;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import se.patrikbergman.java.common.Color;
import se.patrikbergman.java.fruit.AbstractFruit;
import se.patrikbergman.java.fruits.Pear;
import se.patrikbergman.java.tree.AbstractFruitTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Value
public class PearTree extends AbstractFruitTree {

    private final List<Pear> pears = new LinkedList(
            Arrays.asList(
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

            )
    );

    @Builder
    public PearTree(Species species, int age) {
        super(species, age);
    }

    @Override
    public List<Pear> harvest() {
        return pears;
    }

    @Override
    public AbstractFruit pickFruit() throws RuntimeException {
        if(pears.isEmpty()) throw new RuntimeException("Apple tree has no apples left");
        return pears.remove(pears.size()-1);
    }
}

