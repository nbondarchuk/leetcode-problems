package trees.FlattenNestedListIterator_341;

import common.Difficulty;
import common.Topics;

import java.util.ArrayList;
import java.util.List;

import static common.DifficultyLevel.MEDIUM;
import static common.Topic.*;

/**
 * <a href = "https://leetcode.com/problems/flatten-nested-list-iterator">Flatten Nested List Iterator</a>
 */
@Topics({
        DFS,
        TREE,
        STACK,
        QUEUE,
        DESIGN,
        ITERATOR
})
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        NestedIterator nestedIterator = new NestedIterator(List.of(new NestedInteger(List.of(new NestedInteger(1))), new NestedInteger(3)));
        while (nestedIterator.hasNext()) {
            list.add(nestedIterator.next());
        }
        System.out.println(list);
    }
}
