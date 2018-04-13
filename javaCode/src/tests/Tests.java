package tests;

import code.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.lang.annotation.Annotation;

class Tests  {
        private Main main = new Main();
        @Test
        void test1() {
            String s = main.solution(0);
            assert(s.equals("[0]"));
        }
        @Test
        void test2() {
            String s = main.solution(1);
            assert(s.equals("[1, 2]"));
        }
        @Test
        void test3() {
            String s = main.solution(8);
            assert(s.equals("[32]"));
        }
}
