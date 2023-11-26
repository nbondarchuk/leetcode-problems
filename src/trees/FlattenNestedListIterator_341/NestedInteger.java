package trees.FlattenNestedListIterator_341;

import java.util.List;

public class NestedInteger {

    private Integer integer;

    private List<NestedInteger> list;

    public NestedInteger(Integer integer) {
        this.integer = integer;
    }

    public NestedInteger(List<NestedInteger> list) {
        this.list = list;
    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger() {
        return integer != null;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    Integer getInteger() {
        return integer;
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    List<NestedInteger> getList() {
        return list;
    }
}