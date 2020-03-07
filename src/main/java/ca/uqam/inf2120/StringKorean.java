package ca.uqam.inf2120;

import java.util.Iterator;

/**
 * StringKorean
 */
public class StringKorean implements Iterable<Hangul> {

    private String input;

    StringKorean(String input) {
        this.input = input.trim();
    }

    @Override
    public Iterator<Hangul> iterator() {
        return new IteratorStringKorean(this);
    }

    public class IteratorStringKorean implements Iterator<Hangul> {
        private int index;
        private StringKorean str;

        IteratorStringKorean(StringKorean str) {
            this.str = str;
        }

        @Override
        public boolean hasNext() {
            return index < str.input.length();
        }

        @Override
        public Hangul next() {
            Hangul hangul = new Hangul(this.str.input.charAt(index));
            index++;
            return hangul;
        }
    }
}
