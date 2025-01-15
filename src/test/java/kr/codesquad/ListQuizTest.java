package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListQuizTest {
    List<Character> sampleList = new ListQuiz().getList();

    @Test
    @DisplayName("배열의 끝에 i를 추가해보기")
    public void test_plusI () {
        // TODO 1 배열에 i를 추가해보기
        sampleList.add('i');
        assertTrue(sampleList.contains('i'));
        assertEquals('i', sampleList.get(sampleList.size() - 1));
    }

    @Test
    @DisplayName("값이 c인 배열의 인덱스 찾기")
    public void testFindValueC () {
        //TODO 2 값이 c인 배열의 인덱스 찾기

        int answer = sampleList.indexOf('c');

        assertEquals(2, answer);
    }

    @Test
    @DisplayName("list의 여섯 번째 값은?")
    public void testSixthValue () {
        //TODO 3 list의 여섯 번째 값은?
        char answer = sampleList.get(5);
        assertEquals('f', answer);
    }

    @Test
    @DisplayName("배열의 길이")
    public void testLength () {
        // TODO 5 배열의 길이는?
        int answer = sampleList.size();
        assertEquals(answer, sampleList.size());
    }

    @Test
    @DisplayName("배열에서 첫번째 값을 삭제")
    public void testDeleteThirdValue () {
        // TODO 6 배열에서 1번 값을 삭제
        sampleList.remove(0);
        assertFalse(sampleList.contains('e'));
    }

    // LinkedList 에 대한 테스트
    @Test
    public void arrayList() {
        LinkedList<String> values = new LinkedList<>();
        values.add("first");
        values.add("second");

        values.add("third");
        assertTrue(values.get(2).equals("third")); // TODO 7 세 번째 값을 추가하라.
        assertEquals(values.size(), 3); // TODO 8 list의 크기를 구하라.
        assertEquals(values.getFirst(), "first"); // TODO 9 첫 번째 값을 찾아라.
        assertTrue(values.contains("first")); // TODO 10 "first" 값이 포함되어 있는지를 확인
        String remove = values.remove(0);
        assertEquals(remove, "first"); // TODO 11 첫 번째 값을 삭제해라.
        assertFalse(values.contains("first")); // TODO 12 11에서 삭제한 값이 삭제 됐는지 확인한다.

        // TODO 13 values에 담긴 모든 값을 출력한다.
        for (String value : values) {
            System.out.println(value);
        }
    }

}
