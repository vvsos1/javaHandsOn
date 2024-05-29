package kr.codesquad;

import java.util.HashSet;
import java.util.Set;

public class HashSetQuiz {

    public Set<String> fruitSet = new HashSet<>();

    public HashSetQuiz() {
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("cherry");
        fruitSet.add("dulian");
        fruitSet.add("elderberry");
        fruitSet.add("fig");
    }

    public Set<String> getHashSet() {
        return this.fruitSet;
    }


}
