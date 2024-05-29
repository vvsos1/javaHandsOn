package kr.codesquad;

import java.util.HashMap;
import java.util.Map;

public class HashMapQuiz {
    public Map<String, String> fruitMap = new HashMap<>();

    public HashMapQuiz() {
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("dulian", "yellow");
        fruitMap.put("elderberry", "purple");
        fruitMap.put("fig", "brown");
    }

    public Map<String, String> getMap() {
        return fruitMap;
    }
}
