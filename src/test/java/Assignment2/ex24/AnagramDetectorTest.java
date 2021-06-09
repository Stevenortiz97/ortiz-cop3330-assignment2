package Assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_the_right_answer() {


        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("difo","difo");
        boolean expected = true;

        //then

        assertTrue(actual);
    }


    @Test
    void isAnagram_returns_false_for_nonanagrams() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("difo", "god");
        boolean expected = false;

        //then
        assertFalse(actual);




    }
}