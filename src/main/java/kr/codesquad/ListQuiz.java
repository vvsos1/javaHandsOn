package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz {
    List<Character> list = new ArrayList<>();

    public ListQuiz() {
        // eacgbfdh
        list.add('e');
        list.add('a');
        list.add('c');
        list.add('g');
        list.add('b');
        list.add('f');
        list.add('d');
        list.add('h');
    }

    public List getList(){
        return list;
    }
}
